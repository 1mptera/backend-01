// 1. 서버 생성, 본인 이름으로 path 접근 시 문구출력 화면 노출
// 2. 마카오뱅크 기본 기능 구현 -> 3가지
//  1) 잔액조회: account 활용. account 계좌 생성(계좌번호, 이름, 잔액), PageGenerator 생성,
//             pageGenerator 추상화 후 받아서 쓰기, html로 텍스트 주기

import com.sun.net.httpserver.HttpServer;
import models.Account;
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

      URI requestURI = exchange.getRequestURI();
      String path = requestURI.getPath();

      Account account = new Account("1234", "Ashal", 3000);

      PageGenerator pageGenerator = new PageGenerator();
      String content = pageGenerator.text();

      MessageWriter messageWriter = new MessageWriter(exchange);
      messageWriter.write(content);
    });

    httpServer.start();
    System.out.println("http://localhost:8000/");
  }

}
