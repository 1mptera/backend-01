// -> 1.서버세팅
// 2. exchange를 통해서 서버에서 받아서
// 헬로 월드를 웹에 출력

// 3. 빈 패스일때 헬로 월드, 아샬일때 헬로 아샬로 구분되어 출력
// 4. http server header content(byte) size body content
// 200 서버랑 잘 통신함
// 300 리디렉션
// 400 클라이언트 잘못 404 낫 파운드
// 500 서버 내부 잘못
// 중복 발견 => 중복 제거 => 리팩토링 => 관심사의 분리

import com.sun.net.httpserver.HttpServer;
import utils.MessageGenerator;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;

public class MakaoBank {
  public static void main(String[] args) throws IOException {
    MakaoBank application = new MakaoBank();
    application.run();
  }

  public void run() throws IOException {
    InetSocketAddress address = new InetSocketAddress(8000);
    HttpServer httpServer = HttpServer.create(address,0);

    httpServer.createContext("/" , (exchange) -> {
      MessageGenerator messageGenerator = new MessageGenerator();
      String content = messageGenerator.text();

      exchange.sendResponseHeaders(200 ,content.getBytes().length);
      OutputStream outputStream = exchange.getResponseBody();
      outputStream.write(content.getBytes());
      outputStream.flush();
      outputStream.close();
    });

    httpServer.createContext("/ashal" , (exchange) -> {
      MessageGenerator messageGenerator = new MessageGenerator("Ashal");
      String content = messageGenerator.text();

      exchange.sendResponseHeaders(200 ,content.getBytes().length);
      OutputStream outputStream = exchange.getResponseBody();
      outputStream.write(content.getBytes());
      outputStream.flush();
      outputStream.close();
    });

    httpServer.start();
    System.out.println("http://localhost:8000/");
  }

}
