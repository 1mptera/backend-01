import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;

public class MakaoBank {
  public static void main(String[] args) throws IOException {
    MakaoBank application = new MakaoBank();
    application.run();
  }

  public void run() throws IOException {
    HttpServer httpServer = HttpServer.create(new InetSocketAddress(8000), 0);

    httpServer.createContext("/", (exchange) -> {
      String content = "Hello, World!";

      exchange.sendResponseHeaders(200, content.getBytes().length);

      OutputStream outputStream = exchange.getResponseBody();
      outputStream.write(content.getBytes());
      outputStream.flush();
      outputStream.close();
    });

    httpServer.start();

    System.out.println("Server is listening... http://localhost:8000");
  }

}
