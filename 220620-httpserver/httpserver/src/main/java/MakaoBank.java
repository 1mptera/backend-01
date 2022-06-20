// main -> non static run 으로 만들어주기
// web application server로 만들어주기
//



import com.sun.net.httpserver.HttpContext;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;
import utils.MessageGenerator;
import utils.MessageWriter;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.Executor;

public class MakaoBank {
  public static void main(String[] args) throws IOException {
    MakaoBank application = new MakaoBank();
    application.run();
  }

  public void run() throws IOException {
    InetSocketAddress address = new InetSocketAddress(8000);

    HttpServer httpServer = HttpServer.create(address, 0);

    httpServer.createContext("/" , (exchange) -> {
      String name = getName(exchange);
      //인사말 만들기

      MessageGenerator messageGenerator = new MessageGenerator(name);
      String content = messageGenerator.text();



       // 내용을 http로 전달
      MessageWriter messageWriter = new MessageWriter(exchange);
      messageWriter.write(content);

    });



    httpServer.start();
    System.out.print("http://localhost:8000");

  }

  public String getName(HttpExchange exchange) {
    URI requestURI = exchange.getRequestURI();
    String path = requestURI.getPath();
    String name = path.substring(1);
    return name;
  }

}