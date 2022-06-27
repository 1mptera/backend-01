// 1. static main, non-static main
// 2. 서버 만들어주기
// 3. 서버 내에서 Hello, world! 문구를 출력하기 위해 소스코드 작성
// 4. 궁극적으로는 서버가 아닌 사용자에게 해당 문구를 출력해주어야 하므로 response 관련 메소드 활용
// 5. 목표 -> 본인의 이름을 path로 활용하여 접속하면 Hello, 본인이름! 문구를 출력해주기
// 6. MessageGenerator라는 별도의 클래스를 통해 출력할 문구 생성역할 수행
// 7. MessageWriter라는 별도의 클래스 통해 HTTP에 해당 메시지 전달
// 8. 사용자가 입력하는 path 이후 이름에 대해 문구 적용해주기

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpServer;
import utils.MessageGenerator;
import utils.MessageWriter;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.URI;
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
      // 입력
      URI requestURI = exchange.getRequestURI();
      String path = requestURI.getPath();

      String name = path.substring(1);

      // 처리
      MessageGenerator messageGenerator = new MessageGenerator(name);
      String content = messageGenerator.text();

      // 출력
      MessageWriter messageWriter = new MessageWriter(exchange);
      messageWriter.write(content);
    });

    httpServer.start();
    System.out.println("http://localhost:8000/");
  }
}
