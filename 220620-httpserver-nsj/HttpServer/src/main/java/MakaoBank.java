import com.sun.net.httpserver.HttpServer;
import utils.AccountPageGenerator;
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
    HttpServer httpServer = HttpServer.create(new InetSocketAddress(8000), 0);
    httpServer.createContext("/", (exchange) -> {

      // 입력
      URI requestURI = exchange.getRequestURI();
      String path = requestURI.getPath();

      if(!path.equals("/account")) {
        // TODO : 뭔가 잘못됨
      }

      // 처리
      PageGenerator PageGenerator = new AccountPageGenerator();
      String content = PageGenerator.html();

      // 출력
      MessageWriter messageWriter = new MessageWriter(exchange);
      messageWriter.wirte(content);
    });

    httpServer.start();

    System.out.print("http://localhost:8000/");
  }
}
