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

    httpServer.createContext("/", exchange -> {
      URI requestURI = exchange.getRequestURI();
      String path = requestURI.getPath();
      String name = path.substring(1);
      String method = exchange.getRequestMethod();

      Account account = new Account("352-0528", "Chikorita", 100000);

      PageGenerator pageGenerator = switch (path) {
        case "/Account" -> new AccountPageGenerator(account);
        case "/Transfer" -> method.equals("GET")
            ? new TransferPageGenerator(account)
            : new TransferSuccessPageGenerator(account);
        default -> new GreetingPageGenerator(name);
      };

      String content = pageGenerator.html();

      exchange.sendResponseHeaders(200, content.getBytes().length);

      MessageWriter messageWriter = new MessageWriter(exchange);
      messageWriter.write(content);
    });

    httpServer.start();

    System.out.println("Server is listening... http://localhost:8000");
  }
}
