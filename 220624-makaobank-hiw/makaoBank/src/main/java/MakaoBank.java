import com.sun.net.httpserver.HttpServer;
import models.Account;
import utils.AccountPageGenerator;
import utils.GreetingPageGenerator;
import utils.MessageWriter;
import utils.PageGenerator;

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
      URI uri = exchange.getRequestURI();
      String path = uri.getPath();
      String name = path.substring(1);

      Account account = new Account("352", "Chikorita", 50000);

      PageGenerator pageGenerator = switch (path) {
        case "/Account" -> new AccountPageGenerator(account);
        default -> new GreetingPageGenerator(name);
      };

      String text = pageGenerator.html();

      exchange.sendResponseHeaders(200, text.getBytes().length);

      MessageWriter messageWriter = new MessageWriter(exchange);
      messageWriter.write(text);
    });

    httpServer.start();

    System.out.println("Server is listening... http://localhost:8000/");
  }
}
