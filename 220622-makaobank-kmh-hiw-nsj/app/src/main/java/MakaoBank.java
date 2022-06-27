import com.sun.net.httpserver.HttpServer;
import models.Account;
import service.TransferService;
import utils.*;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.URI;
import java.util.concurrent.LinkedTransferQueue;

public class MakaoBank {
  private Account account;
  private TransferService transferService;

  public MakaoBank() {
  }

  public static void main(String[] args) throws IOException {
    MakaoBank application = new MakaoBank();
    application.run();
  }

  public void run() throws IOException {
    account = new Account("1234", "Ashal", 3000);
    transferService = new TransferService();

    InetSocketAddress address = new InetSocketAddress(8000);
    HttpServer httpServer = HttpServer.create(address, 0);

    httpServer.createContext("/", (exchange) -> {
      // input
      URI requestURI = exchange.getRequestURI();
      String path = requestURI.getPath();

      String method = exchange.getRequestMethod();

      // process


      PageGenerator pageGenerator = process(path, method);

      String content = pageGenerator.html();

      // output
      MessageWriter messagewriter = new MessageWriter(exchange);
      messagewriter.write(content);
    });
    httpServer.start();
    System.out.print("http://localhost:8000/");
  }

  public PageGenerator process(String path, String method) {
    return switch (path) {
      case "/account" -> processAccount();
      case "/transfer" -> processTransfer(method);
      default -> new GreetingPageGenerator();
    };
  }

  public AccountPageGenerator processAccount() {
    return new AccountPageGenerator(account);
  }

  public PageGenerator processTransfer(String method) {
    if (method.equals("GET")) {
      return processTransferGet();
    }
    return processTransferPost();
  }

  public TransferPageGenerator processTransferGet() {
    return new TransferPageGenerator(account);
  }

  public TransferSuccessPageGenerator processTransferPost() {
    transferService.transfer("1234", "2345", 1000);

    return new TransferSuccessPageGenerator(account);
  }
}