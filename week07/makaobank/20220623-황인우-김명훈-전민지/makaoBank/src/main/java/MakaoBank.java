//Transaction model 만들기
//  >> Transaction List는 Account에 저장됨
//  >> Account의 Transfer가 실행되면
//     sender와 receiver Account에 Transaction이 추가됨

import com.sun.net.httpserver.HttpServer;
import models.Account;
import repository.AccountRepository;
import services.TransferService;
import utils.*;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.URI;
import java.util.Map;

public class MakaoBank {
  private AccountRepository accountRepository;
  private String accountIdentifier = "1234";

  private TransferService transferService;
  private FormParser formParser;

  public static void main(String[] args) throws IOException {
    MakaoBank application = new MakaoBank();
    application.run();
  }

  public MakaoBank() {
    formParser = new FormParser();

    accountRepository = new AccountRepository();

    transferService = new TransferService(accountRepository);
  }

  public void run() throws IOException {
    InetSocketAddress address = new InetSocketAddress(8000);

    HttpServer httpServer = HttpServer.create(address, 0);

    httpServer.createContext("/", (exchange) -> {

      URI requestURI = exchange.getRequestURI();
      String path = requestURI.getPath();
      String method = exchange.getRequestMethod();

      String requestBody = new RequestBodyReader(exchange).body();

      Map<String, String> formData = formParser.parse(requestBody);

      formData.get("to");
      formData.get("amount");

      //처리
      PageGenerator pageGenerator = process(path, method, formData);

      new MessageWriter(exchange).write(pageGenerator.html());
    });


    httpServer.start();
    System.out.print("http://localhost:8000/");
  }

  public PageGenerator process(String path, String method, Map<String, String> formData) {

    String[] steps = path.substring(1).split("/");

    return switch (steps[0]) {
      case "account" -> processAccount(steps.length > 1 ? steps[1] : "");
      case "transfer" -> processTransfer(method, formData);
      case "transaction" -> processTransaction();
      default -> new GreetingPageGenerator();
    };
  }

  public AccountPageGenerator processAccount(String identifier) {
    Account account = accountRepository.find(identifier);

    if (account == null) {
      account = accountRepository.find(accountIdentifier);
    }

    return new AccountPageGenerator(account);
  }

  public PageGenerator processTransfer(String method, Map<String, String> formData) {
    if (method.equals("GET")) {
      return processTransferGet();
    }

    return processTransferPost(formData);
  }

  public TransferPageGenerator processTransferGet() {
    Account account = accountRepository.find(accountIdentifier);

    return new TransferPageGenerator(account);
  }

  public TransferSuccessPageGenerator processTransferPost(Map<String, String> formData) {
    transferService.transfer(
        accountIdentifier,
        formData.get("to"),
        Long.parseLong(formData.get("amount"))
    );

    Account account = accountRepository.find(accountIdentifier);

    return new TransferSuccessPageGenerator(account);
  }

  public PageGenerator processTransaction() {
    Account account = accountRepository.find(accountIdentifier);

    return new TransactionPageGenerator(account);
  }
}
