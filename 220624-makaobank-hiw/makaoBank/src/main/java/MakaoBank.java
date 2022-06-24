import com.sun.net.httpserver.HttpServer;
import models.Account;
import repositories.AccountRepository;
import services.TransferService;
import utils.*;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.URI;
import java.util.HashMap;
import java.util.Map;

public class MakaoBank {
  private TransferService transferService;

  private AccountRepository accountRepository;
  private Account myAccount;

  public static void main(String[] args) throws IOException {
    MakaoBank application = new MakaoBank();
    application.run();
  }

  public void run() throws IOException {
    transferService = new TransferService();

    accountRepository = new AccountRepository();
    myAccount = accountRepository.find("352");

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
    Account found = accountRepository.find(identifier);

    if (found == null) {
      found = myAccount;
    }

    return new AccountPageGenerator(found);
  }

  public PageGenerator processTransfer(String method, Map<String, String> formData) {
    if (method.equals("GET")) {
      return processTransferGet();
    }

    return processTransferPost(formData);
  }

  private TransferSuccessPageGenerator processTransferPost(Map<String, String> formData) {
    Account receiver = accountRepository.find(formData.get("to"));

    long amountTransferred = Long.parseLong(formData.get("amount"));

    transferService.transfer(myAccount, receiver, amountTransferred);

    return new TransferSuccessPageGenerator();
  }

  private TransferPageGenerator processTransferGet() {
    return new TransferPageGenerator(myAccount);
  }

  private GreetingPageGenerator processGreeting(String name) {
    return new GreetingPageGenerator(name);
  }
}
