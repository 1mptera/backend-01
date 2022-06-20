// main -> non static run 으로 만들어주기
// web application server로 만들어주기
//



import com.sun.net.httpserver.HttpContext;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;
import utils.MessageGenerator;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
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

      //인사말 만들기

      MessageGenerator messageGenerator = new MessageGenerator();
      String content = messageGenerator.text();



       // 내용을 http로 전달

      exchange.sendResponseHeaders(200, content.getBytes().length);

      OutputStream outputStream = exchange.getResponseBody();

      outputStream.write(content.getBytes());
      outputStream.flush();
      outputStream.close();

    });

    httpServer.createContext("/sunghwan" , (exchange) -> {
      MessageGenerator messageGenerator = new MessageGenerator("sunghwna");
      String content = messageGenerator.text();



      exchange.sendResponseHeaders(200, content.getBytes().length);

      OutputStream outputStream = exchange.getResponseBody();

      outputStream.write(content.getBytes());
      outputStream.flush();
      outputStream.close();

    });

    httpServer.start();


  }
}