// 1. http서버 생성, 자신의 이름을 path로 입력시 출력 문구 변경
// 2. MessageGenerator 클래스에서 메시지 생성, MessageWriter에서 http로 메시지 전달

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpServer;
import utils.MessageGenerator;
import utils.MessageWriter;

import java.io.IOException;
import java.io.OutputStream;
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
