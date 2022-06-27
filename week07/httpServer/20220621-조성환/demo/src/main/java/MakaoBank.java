
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpServer;
import utils.MessageGenerator;
import utils.MessageWriter;


import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.URI;
import java.util.concurrent.Executor;

public class MakaoBank {


  public static void main(String[] args) throws IOException {
    MakaoBank application = new MakaoBank();
    application.run();

  }

  public void run() throws IOException {
    InetSocketAddress address = new InetSocketAddress(8000);
    HttpServer httpServer =  HttpServer.create(address, 0);

    httpServer.createContext("/" , (exchange) -> {

      URI requestURI = exchange.getRequestURI();
      String path = requestURI.getPath();
      String name = path;
      MessageGenerator messageGenerator = new MessageGenerator(name);
      String content = messageGenerator.text();

      MessageWriter messagewriter = new MessageWriter(exchange);
      messagewriter.write(content);

    });


    httpServer.start();
    System.out.print("http://localhost:8000/");
  }




}