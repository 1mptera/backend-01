// ToDoList
// 1. 서버 생성 - 완료
// 2. 제목 투 두 리스트. h1 사이즈로(HTML) - TODOLIST 글씨는 출력 완료
// 3. 투 두 라고 쓰기(한영바꾸기 귀찮음)
// 4. 입력칸 -> input 활용(글씨는 몇글짜까지 받을거임) - 완료
// 5. 크리에이트 버튼 만들기 - 완료
// 6. 궁극적인 목적 -> 입력창에 투두항목을 넣고 create 버튼 눌렀을 때 아래에 누적되게
// 7. (1) 겟리퀘스트바디를 통해 입력값을 가져옴 -> 입력값은 키&밸류 형태로 가져와질 것임
//    (2) 입력받은 키&밸류 형태의 값을 스플릿을 이용해 쪼갠다
//    (3) 리스트에 밸류만 애드
// 8. 리스트에서 문자열을 뽑아낸 다음에 문자열만 전달 to html

import com.sun.net.httpserver.HttpServer;
import utils.FormParser;
import utils.MessagePage;
import utils.ToDoListManager;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;

public class ToDoList {
  private ToDoListManager toDoListManager;

  public static void main(String[] args) throws IOException {
    ToDoList application = new ToDoList();
    application.run();
  }

  public void run() throws IOException {
    toDoListManager = new ToDoListManager();

    InetSocketAddress address = new InetSocketAddress(8000);
    HttpServer httpServer = HttpServer.create(address, 0);

    httpServer.createContext("/", (exchange) -> {
      FormParser formParser = new FormParser(exchange);
      String todo = formParser.parse();
      //System.out.print(todo);

      toDoListManager.add(todo);
      String stackedList = toDoListManager.stack();

      MessagePage messagePage = new MessagePage();
      String content = messagePage.html(stackedList);

      exchange.sendResponseHeaders(200, content.getBytes().length);

      OutputStream outputStream = exchange.getResponseBody();
      outputStream.write(content.getBytes());
      outputStream.flush();
      outputStream.close();
    });
       httpServer.start();
       System.out.println("http://localhost:8000");
  }


}
