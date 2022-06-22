import com.sun.net.httpserver.HttpServer;
import models.Account;
import utils.*;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.URI;

public class Makaobank {
  private Account account;


  public static void main(String[] args) throws IOException {
    Makaobank application = new Makaobank();
    application.run();
  }

  public void run() throws IOException {
    account = new Account("1234", "Ashal", 3000);

    InetSocketAddress address = new InetSocketAddress(8000);
    HttpServer httpServer = HttpServer.create(address, 0);

    httpServer.createContext("/", (exchange) -> {

      URI requestURI = exchange.getRequestURI();
      String path = requestURI.getPath();

      String requestMethod = exchange.getRequestMethod();
      String method = requestMethod;

      PageGenerator pageGenerator = process(path, method);

      String content = pageGenerator.html();

      MessageWriter messageWriter = new MessageWriter(exchange);
      messageWriter.write(content);
    });


    httpServer.start();
    System.out.print("http://localhost:8000/");
  }

  public PageGenerator process(String path, String method) {

    return switch (path) {
      case "/account" ->  processAccount();
      case "/transfer" -> processTransfer(method);
      default -> new GreetingPageGenerator();
    };
  }

  private AccountPageGenerator processAccount() {
    return new AccountPageGenerator(account);
  }

  private PageGenerator processTransfer(String method) {
    if (method.equals("GET")) {
      return processTransferGet();
    }

    method.equals("POST");
    return processTransferPost();
  }

  private TransferPageGenerator processTransferGet() {
    return new TransferPageGenerator(account);
  }

  private TransferSuccessPageGenerator processTransferPost() {
    // TODO : real proceed
    return new TransferSuccessPageGenerator(account);
  }
}
