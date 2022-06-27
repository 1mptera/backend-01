import utils.TransactionPageGenerator;
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
  private final AccountRepository accountRepository;
  private final Account myAccount;

  private final TransferService transferService;

  public static void main(String[] args) throws IOException {
    MakaoBank application = new MakaoBank();
    application.run();
  }

  public MakaoBank() {
    accountRepository = new AccountRepository();
    myAccount = accountRepository.find("352");

    transferService = new TransferService(accountRepository);
  }

  public void run() throws IOException {
    InetSocketAddress address = new InetSocketAddress(8000);
    HttpServer httpServer = HttpServer.create(address, 0);

    httpServer.createContext("/", exchange -> {
      URI uri = exchange.getRequestURI();
      String path = uri.getPath();
      String name = path.substring(1);

      String method = exchange.getRequestMethod();

      Map<String, String> formData = new HashMap<>();

      if (method.equals("POST")) {
        String line = new RequestBodyReader(exchange).read();

        formData = new FormParser().parse(line);
      }

      String text = process(path, name, method, formData).html();

      exchange.sendResponseHeaders(200, text.getBytes().length);

      new MessageWriter(exchange).write(text);
    });

    httpServer.start();

    System.out.println("Server is listening... http://localhost:8000/");
  }

  public PageGenerator process(
      String path, String name, String method, Map<String, String> formData) {
    String[] eachPath = path.substring(1).split("/");

    String identifier = (eachPath.length >= 2) ? eachPath[1] : "";

    return switch (eachPath[0]) {
      case "Account" -> processAccount(identifier);
      case "Transfer" -> processTransfer(method, formData, identifier);
      case "Transaction" -> processTransaction(identifier);
      default -> processGreeting(name);
    };
  }

  public Account findAccount(String identifier) {
    Account found = accountRepository.find(identifier);

    if (found == null) {
      found = myAccount;
    }

    return found;
  }

  public PageGenerator processAccount(String identifier) {
    Account found = findAccount(identifier);

    return new AccountPageGenerator(found);
  }

  public PageGenerator processTransfer(
      String method, Map<String, String> formData, String identifier) {
    Account found = findAccount(identifier);

    if (method.equals("GET")) {
      return processTransferGet(found);
    }

    return processTransferPost(formData, found);
  }

  public PageGenerator processTransferGet(Account found) {
    return new TransferPageGenerator(found);
  }

  public PageGenerator processTransferPost(
      Map<String, String> formData, Account found) {
    transferService.transfer(found.identifier(), formData);

    return new TransferSuccessPageGenerator();
  }

  public PageGenerator processTransaction(String identifier) {
    Account found = findAccount(identifier);

    return new TransactionPageGenerator(found);
  }

  public PageGenerator processGreeting(String name) {
    return new GreetingPageGenerator(name);
  }
}
