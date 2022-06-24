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

  private void run() throws IOException {
    InetSocketAddress InetSocketAddress = new InetSocketAddress(8000);
    HttpServer httpServer = HttpServer.create(InetSocketAddress, 0);

    httpServer.createContext("/", (exchange) -> {

          URI requestURI = exchange.getRequestURI();
          String path = requestURI.getPath();

          String method = exchange.getRequestMethod();

          Account account = new Account("1234", "ashal", 3000);


          PageGenerator pageGenerator = switch (path) {
            case "/account" -> new AccountPageGenerator(account);
            case "/transfer" -> method.equals("GET")
                ? new TransferPageGenerator(account)
                : new TransferProcessPageGenerator(account);
            default -> new GreetingPageGenerator();
          };


          String content = pageGenerator.html();


          MessageWriter messageWriter = new MessageWriter(exchange);
          messageWriter.write(content);


        }
    );
    httpServer.start();
    System.out.println("http://localhost:8000");
  }
}

