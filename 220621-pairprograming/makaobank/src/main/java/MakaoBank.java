// 할 것
// account 페이지 만들기(accountpagegenerator) -> 계좌 번호 , 이름 , 잔액을 가지고 있음
// transfer 페이지 만들기(transferpagegenerator) -> html로 만들기

import com.sun.net.httpserver.HttpServer;
import models.Account;
import utils.*;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.URI;

public class MakaoBank {
  public MakaoBank() {
  }

  public static void main(String[] args) throws IOException {
    MakaoBank application = new MakaoBank();
    application.run();
  }

  public void run() throws IOException {
    InetSocketAddress address = new InetSocketAddress(8000);
    HttpServer httpServer = HttpServer.create(address, 0);

    httpServer.createContext("/", (exchange) -> {
      // input
      URI requestURI = exchange.getRequestURI();
      String path = requestURI.getPath();

      // process
      Account account = new Account("1234", "Ashal", 3000);

      PageGenerator pageGenerator = switch (path) {
        case "/account" -> new AccountPageGenerator(account);
        case "/transfer" -> new TransferPageGenerator(account);
        default -> new GreetingPageGenerator();
      };

      String content = pageGenerator.html();

      // output
      MessageWriter messagewriter = new MessageWriter(exchange);
      messagewriter.write(content);
    });
    httpServer.start();
    System.out.print("http://localhost:8000/");
  }
}