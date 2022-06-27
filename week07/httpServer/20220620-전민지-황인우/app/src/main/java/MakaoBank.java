// static main, nonstatic run
// 서버생성
// 궁극적으로는 본인의 이름을 패스로 넣었을 때 본인의 이름과 함께 Hello, 이름! 문구가 나오게 함
// -> 메시지를 만들어주는 클래스(MessageGenerator)
// -> 만든 메시지를 http보내주는 클래스(MessageWriter)

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpServer;
import utils.MessageGenerator;
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
      String name = nameFromPath(exchange);

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

  public String nameFromPath(HttpExchange exchange) {
    URI requestURI = exchange.getRequestURI();
    String path = requestURI.getPath();
    String name = path.substring(1);
    return name;
  }
}
