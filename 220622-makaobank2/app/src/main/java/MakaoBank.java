// 1. http server 생성과 본인 이름 path로 지정하여 페이지 문구 출력하게 하기
// 2. 마카오뱅크 기능 구현. 주요 기능 3가지
//  1) account. 계좌 생성, html로 텍스트 뿌려주기, PageGen 생성
//  2) transfer
//  3) transactions


import com.sun.net.httpserver.HttpServer;
import models.Account;
import utils.AccountPageGenerator;
import utils.GreetingPageGenerator;
import utils.PageGenerator;
import utils.MessageWriter;

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
      PageGenerator pageGenerator = new GreetingPageGenerator();

      if (path.equals("/account")) {
        Account account = new Account("1234", "Ashal", 3000);
        pageGenerator = new AccountPageGenerator(account);
      }

      String content = pageGenerator.html();

      // 출력
      MessageWriter messageWriter = new MessageWriter(exchange);
      messageWriter.write(content);
    });

    httpServer.start();
    System.out.println("http://localhost:8000/");
  }
}
