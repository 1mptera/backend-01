// static main, nonstatic run
// 서버생성
// 궁극적으로는 본인의 이름을 패스로 넣었을 때 본인의 이름과 함께 Hello, 이름! 문구가 나오게 함
// -> 메시지를 만들어주는 클래스(MessageGenerator)
// -> 만든 메시지를 http보내주는 클래스(MessageWriter)
//
// 잔액조회: path로 접근, Account를 이용해 정보 출력
// 송금: html 틀만 작성

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
      Account account = new Account("1234", "Inu", 4000);

      PageGenerator pageGenerator = new GreetingPageGenerator();

      if (path.equals("/Account")) {
        pageGenerator = new AccountPageGenerator(account);
      }
      if (path.equals("/Transfer")) {
        pageGenerator = new TransferPageGenerator(account);
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
