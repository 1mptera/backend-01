import com.sun.net.httpserver.HttpServer;
import models.Account;
import services.TransferService;
import utils.*;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.URI;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MakaoBank {
  private TransferService transferService;

  private List<Account> accounts;
  private Account account;
  private String identifier;

  public static void main(String[] args) throws IOException {
    MakaoBank application = new MakaoBank();
    application.run();
  }

  public void run() throws IOException {
    transferService = new TransferService();

    accounts = List.of(
        new Account("352-0528", "Chikorita", 100000),
        new Account("179-20", "Eevee", 50000)
    );
    account = accounts.get(0);
    identifier = account.identifier();

    InetSocketAddress address = new InetSocketAddress(8000);
    HttpServer httpServer = HttpServer.create(address, 0);

    httpServer.createContext("/", exchange -> {
      URI requestURI = exchange.getRequestURI();
      String path = requestURI.getPath();

      String method = exchange.getRequestMethod();

      String line = "";
      Map<String, String> formData = new HashMap<>();

      if (method.equals("POST")) {
        RequestBodyReader requestBodyReader = new RequestBodyReader(exchange);
        line = requestBodyReader.read();

        FormParser formParser = new FormParser();
        formParser.parse(line);
      }

      PageGenerator pageGenerator = process(path, method, identifier, formData);

      String content = pageGenerator.html();

      exchange.sendResponseHeaders(200, content.getBytes().length);

      MessageWriter messageWriter = new MessageWriter(exchange);
      messageWriter.write(content);
    });

    httpServer.start();

    System.out.println("Server is listening... http://localhost:8000");
  }

  public PageGenerator process(
      String path, String method, String identifier,
      Map<String, String> formData) {
    return switch (path) {
      case "/Account" -> processAccount(path);
      case "/Transfer" -> method.equals("GET")
          ? processTransferGet()
          : processTransferPost(identifier, formData);
      default -> processGreeting();
    };
  }

  public AccountPageGenerator processAccount(String path) {
    return new AccountPageGenerator(account);
  }

  public TransferPageGenerator processTransferGet() {
    return new TransferPageGenerator(account);
  }

  public TransferSuccessPageGenerator processTransferPost(
      String identifier, Map<String, String> formData) {
    transferService.transfer(accounts, identifier, formData);

    return new TransferSuccessPageGenerator(account);
  }

  public GreetingPageGenerator processGreeting() {
    return new GreetingPageGenerator();
  }
}
