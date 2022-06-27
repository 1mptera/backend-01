// 1~2강. http 서버 생성 후 본인 이름으로 path 지정
// 3강. 마카오뱅크의 주요 기능 중 account 구현
// -> account 생성, PageGenerator 생성 및 extends 사용, html 등장
// 4강. 마카오뱅크의 주요 기능 중 transfer 구현
// -> transferPageGenerator 생성, html 작성

import com.sun.net.httpserver.HttpServer;
import models.Account;
import utils.*;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.URI;

public class MakaoBank {
  public static void main(String[] args) throws IOException {
    MakaoBank application = new MakaoBank();
    application.run();
  }

  public void run() throws IOException {
    InetSocketAddress address = new InetSocketAddress(8000);

    HttpServer httpServer = HttpServer.create(address, 0);

    httpServer.createContext("/", (exchange) -> {

      // 입력

      URI requestURI = exchange.getRequestURI();
      String path = requestURI.getPath();

      // 처리

      String method = exchange.getRequestMethod();

      Account account = new Account("1234", "Ashal", 3000);

      PageGenerator pageGenerator = switch (path) {
        case "/account" -> new AccountPageGenerator(account);
        case "/transfer" -> method.equals("GET")
            ? new TransferPageGenerator(account)
            : new TransferProcessPageGenerator(account);
        default -> new GreetingPageGenerator();
      };

      String content = pageGenerator.html();

      // 출력

      MessageWriter messageWriter = new MessageWriter(exchange);
      messageWriter.write(content);
    });

    httpServer.start();
    System.out.println("http://localhost:8000/");
  }
}
