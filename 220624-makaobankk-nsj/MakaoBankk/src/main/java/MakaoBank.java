import com.sun.net.httpserver.HttpServer;
import models.Account;
import services.TransferService;
import utils.*;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.URI;
import java.util.List;
import java.util.Map;

public class MakaoBank {
  private final FormParser formParser;
  private final Account account;
  private final TransferService transferService;
  private final List<Account> accounts;

  public static void main(String[] args) throws IOException {
    MakaoBank application = new MakaoBank();
    application.run();
  }

  public MakaoBank() {
    formParser = new FormParser();

    accounts = List.of(
        new Account("1234", "ashal", 3000),
        new Account("2345", "joker", 1000)
    );
    account = accounts.get(0);
    transferService = new TransferService(accounts);
  }

  public void run() throws IOException {
    InetSocketAddress addres = new InetSocketAddress(8000);
    HttpServer httpServer = HttpServer.create(addres, 0);

    httpServer.createContext("/", (exchange) -> {
      // 입력
      URI requestURI = exchange.getRequestURI();
      String path = requestURI.getPath();

      String method = exchange.getRequestMethod();

      String requestBody = new RequestBodyReader(exchange).body();

      // 처리
      Map<String, String> formData = formParser.parse(requestBody);

      PageGenerator pageGenerator = process(path, method, formData);
      // 출력
      new MessageWriter(exchange).write(pageGenerator.html());
    });

    httpServer.start();
    System.out.print("http://localhost:8000");
  }

  private PageGenerator process(String path, String method,
                                Map<String, String> formData) {
    String[] steps = path.substring(1).split("/");
    return switch (steps[0]) {
      case "account" -> processAccount(steps.length > 1 ? steps[1] : "");
      case "transfer" -> processTransfer(method, formData);
      default -> new GreetingPageGenerator();
    };
  }

  private PageGenerator processTransfer(String method,
                                        Map<String, String> formData) {
    if (method.equals("GET")) {
      return processTransferGet();
    }
    return processTransferPost(formData);
  }

  private AccountPageGenerator processAccount(String identifier) {
    Account found = accounts.stream()
        .filter(account -> account.identifier().equals(identifier))
        .findFirst()
        .orElse(account);
    return new AccountPageGenerator(found);
  }

  private TransferPageGenerator processTransferGet() {
    return new TransferPageGenerator(account);
  }

  private TransferSuccessPageGenerator processTransferPost(Map<String, String> formData) {
    // TODO : 진짜 처리
    transferService.transfer(
        account.identifier(),
        formData.get("to"),
        (int) Long.parseLong(formData.get("amount")));

    return new TransferSuccessPageGenerator(account);
  }

}
