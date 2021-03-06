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

  private void run() throws IOException {
    InetSocketAddress addres = new InetSocketAddress(8000);
    HttpServer httpServer = HttpServer.create(addres, 0);

    httpServer.createContext("/", (exchange) -> {
      // 입력
      URI requestURI = exchange.getRequestURI();
      String path = requestURI.getPath();

      // 처리
      PageGenerator pageGenerator = new GreetingPageGenerator();

      if(path.equals("/account")) {
        Account account = new Account("1234", "ashal", 3000);
        pageGenerator = new AccountPageGenerator(account);
      }
      String content = pageGenerator.html();

      // 출력
      MessageWriter messageWriter = new MessageWriter(exchange);
      messageWriter.write(content);
    });

    httpServer.start();
    System.out.print("http://localhost:8000");
  }

}
