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
      //  입력
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

    System.out.print("http://localhost:8000/");
  }
}
