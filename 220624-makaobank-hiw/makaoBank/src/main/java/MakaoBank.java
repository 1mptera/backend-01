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

  private List<Account> accountList;
  private Account myAccount;
  private String myIdentifier;

  public static void main(String[] args) throws IOException {
    MakaoBank application = new MakaoBank();
    application.run();
  }

  public void run() throws IOException {
    transferService = new TransferService();

    accountList = List.of(
        new Account("352", "Chikorita", 50000),
        new Account("179", "Eevee", 1000),
        new Account("110", "Pikachu", 3000)
    );
    myAccount = accountList.get(0);
    myIdentifier = myAccount.identifier();

    InetSocketAddress address = new InetSocketAddress(8000);
    HttpServer httpServer = HttpServer.create(address, 0);

    httpServer.createContext("/", exchange -> {
      URI uri = exchange.getRequestURI();
      String path = uri.getPath();
      String name = path.substring(1);

      String method = exchange.getRequestMethod();

      Map<String, String> formData = new HashMap<>();

      if (method.equals("POST")) {
        RequestBodyReader requestBodyReader = new RequestBodyReader(exchange);
        String line = requestBodyReader.read();

        FormParser formParser = new FormParser();
        formData = formParser.parse(line);
      }

      PageGenerator pageGenerator = process(path, name, method, formData);
      String text = pageGenerator.html();

      exchange.sendResponseHeaders(200, text.getBytes().length);

      MessageWriter messageWriter = new MessageWriter(exchange);
      messageWriter.write(text);
    });

    httpServer.start();

    System.out.println("Server is listening... http://localhost:8000/");
  }

  public PageGenerator process(String path, String name, String method, Map<String, String> formData) {
    String[] eachPath = path.substring(1).split("/");

    String identifier = (eachPath.length >= 2) ? eachPath[1] : "";

    return switch (eachPath[0]) {
      case "Account" -> processAccount(identifier);
      case "Transfer" -> processTransfer(method, formData);
      default -> processGreeting(name);
    };
  }

  public AccountPageGenerator processAccount(String identifier) {
    Account found = accountList.stream()
        .filter(account -> account.identifier().equals(identifier))
        .findFirst()
        .orElse(myAccount);

    return new AccountPageGenerator(found);
  }

  public PageGenerator processTransfer(String method, Map<String, String> formData) {
    if (method.equals("GET")) {
      return processTransferGet();
    }

    return processTransferPost(formData);
  }

  private TransferSuccessPageGenerator processTransferPost(Map<String, String> formData) {
    Account sender = accountList.stream()
        .filter(account -> account.identifier().equals(myIdentifier))
        .findFirst()
        .orElse(myAccount);

    Account receiver = accountList.stream()
        .filter(account -> account.identifier().equals(formData.get("to")))
        .findFirst()
        .get();

    long amountTransferred = Long.parseLong(formData.get("amount"));

    transferService.transfer(sender, receiver, amountTransferred);

    return new TransferSuccessPageGenerator();
  }

  private TransferPageGenerator processTransferGet() {
    return new TransferPageGenerator(myAccount);
  }

  private GreetingPageGenerator processGreeting(String name) {
    return new GreetingPageGenerator(name);
  }
}
