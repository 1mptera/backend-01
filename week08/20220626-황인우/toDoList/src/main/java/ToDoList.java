import com.sun.net.httpserver.HttpServer;
import pages.ToDoListPageGenerator;
import utils.MessageWriter;
import utils.ToDoListManager;

import java.io.IOException;
import java.net.InetSocketAddress;

public class ToDoList {
  private final ToDoListManager toDoListManager;

  public static void main(String[] args) throws IOException {
    ToDoList application = new ToDoList();
    application.run();
  }

  public ToDoList() {
    this.toDoListManager = new ToDoListManager();
  }

  public void run() throws IOException {
    InetSocketAddress address = new InetSocketAddress(8000);

    HttpServer httpServer = HttpServer.create(address, 0);

    httpServer.createContext("/", exchange -> {
      //처리
      String text = processToDoListPage().html();

      //출력
      exchange.sendResponseHeaders(200, text.getBytes().length);

      new MessageWriter(exchange).write(text);
    });

    httpServer.start();

    System.out.println("Server is listening... http://localhost:8000");
  }

  private ToDoListPageGenerator processToDoListPage() {
    return new ToDoListPageGenerator(toDoListManager);
  }
}
