// 1. static main, non-static main
// 2. 서버 만들어주기
// 3. 서버 내에서 Hello, world! 문구를 출력하기 위해 소스코드 작성
// 4. 궁극적으로는 서버가 아닌 사용자에게 해당 문구를 출력해주어야 하므로 response 관련 메소드 활용
// 5. 본인의 이름을 path로 활용하여 접속하면 Hello, 본인이름! 문구를 출력해주기

import com.sun.net.httpserver.HttpServer;
import utils.MessageGenerator;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;

public class MakaoBank {
  public static void main(String[] args) throws IOException {
    MakaoBank application = new MakaoBank();
    application.run();
  }

  public void run() throws IOException {
    // 서버 생성
    InetSocketAddress address = new InetSocketAddress(8000);
    HttpServer httpServer = HttpServer.create(address, 0);

    httpServer.createContext("/", (exchange) -> {

      // 메시지 생성
      MessageGenerator messageGenerator = new MessageGenerator();
      String content = messageGenerator.text();

      // 메시지 출력
      exchange.sendResponseHeaders(200, content.getBytes().length);

      OutputStream outputStream = exchange.getResponseBody();
      outputStream.write(content.getBytes());
      outputStream.flush();
      outputStream.close();
    });

    httpServer.createContext("/ashal", (exchange) -> {

      // 메시지 생성
      MessageGenerator messageGenerator = new MessageGenerator("Ashal");
      String content = messageGenerator.text();

      // 메시지 출력
      exchange.sendResponseHeaders(200, content.getBytes().length);

      OutputStream outputStream = exchange.getResponseBody();
      outputStream.write(content.getBytes());
      outputStream.flush();
      outputStream.close();
    });

    httpServer.start();
    System.out.println("http://localhost:8000/");
  }
}
