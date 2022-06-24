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

  private void run() throws IOException {
    InetSocketAddress InetSocketAddress = new InetSocketAddress(8000);
    HttpServer httpServer = HttpServer.create(InetSocketAddress, 0);

    httpServer.createContext("/", (exchange) -> {

          URI requestURI = exchange.getRequestURI();
          String path = requestURI.getPath();
          String name = path.substring(1);

          MessageGenerator messageGenerator = new MessageGenerator(name);
          String content = messageGenerator.text();


          MessageWriter messageWriter = new MessageWriter(exchange);
          messageWriter.write(content);


        }
    );
    httpServer.start();
    System.out.println("http://localhost:8000");
  }
}

