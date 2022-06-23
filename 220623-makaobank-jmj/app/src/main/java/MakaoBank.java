// 1. 서버 생성, 본인 이름으로 path 접근 시 문구출력 화면 노출
// 2. 마카오뱅크 기본 기능 구현 -> 3가지
//  1) 잔액조회: account 활용. account 계좌 생성(계좌번호, 이름, 잔액), PageGenerator 생성,
//             pageGenerator 추상화 후 받아서 쓰기, html로 텍스트 주기, /account 패스로 접속
//  2) 송금: transfer 활용. 해당 페이지 제너레이터 생성

import com.sun.net.httpserver.HttpServer;
import models.Account;
import utils.*;

import java.io.IOException;
import java.io.InputStream;
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

      String method = exchange.getRequestMethod();

      // 처리

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
