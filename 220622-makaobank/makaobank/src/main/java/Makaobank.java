import com.sun.net.httpserver.HttpServer;
import models.Account;
import services.TransferService;
import utils.*;

import java.io.IOException;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.net.URI;
import java.util.List;
import java.util.Map;
// 다른 사람계좌를 볼 수있게 /account/identifier
public class Makaobank {
  private Account account;
  private TransferService transferService;
  private FormParser formParser;
  private List<Account> accounts;

  public static void main(String[] args) throws IOException {
    Makaobank application = new Makaobank();
    application.run();
  }

  public Makaobank() {
    formParser = new FormParser();
    accounts = List.of(
        new Account("1234", "Ashal", 3000),
        new Account("2345", "JOKER", 1000)
    );
    account = accounts.get(0);
    transferService = new TransferService(accounts);
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
      default -> new GreetingPageGenerator();
    };
  }

  public AccountPageGenerator processAccount(String identifier) {
       Account found = accounts.stream().filter(account ->
        account.identifier().equals(identifier))
        .findFirst()
        .orElse(account);

    return new AccountPageGenerator(found);
  }

  public PageGenerator processTransfer(String method, Map<String, String> formData) {
    if (method.equals("GET")) {
      return processTransferGet();
    }

    return processTransferPost(formData);


  }

  public TransferPageGenerator processTransferGet() {
    return new TransferPageGenerator(account);
  }

  public TransferSuccessPageGenerator processTransferPost(Map<String, String> formData) {
    // TODO : real proceed


        transferService.transfer(account.identifier(),
        formData.get("to"),
        Long.parseLong(formData.get("amount")));



        return new TransferSuccessPageGenerator(account);

  }
}
