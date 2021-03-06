//잔액조회
//  Account의 계좌를 조회
//송금
//  Map을 통해 관리
//  보낼 계좌, 송금액을 입력
//  보내기 버튼을 누르면 송금인의 금액 차감, 수신인의 금액 증가
//거래내역 확인
//  List를 통해 관리
//  송금 시 거래내역에 내역 추가

import com.sun.net.httpserver.HttpServer;
import models.Account;
import utils.AccountPageGenerator;
import utils.GreetingPageGenerator;
import utils.PageGenerator;
import utils.MessageWriter;

import java.io.IOException;
import java.net.InetSocketAddress;

public class MakaoBank {
  public static void main(String[] args) throws IOException {
    MakaoBank application = new MakaoBank();
    application.run();
  }

  public void run() throws IOException {
    InetSocketAddress address = new InetSocketAddress(8000);

    HttpServer httpServer = HttpServer.create(address, 0);

    httpServer.createContext("/", exchange -> {
      //입력
      String path = exchange.getRequestURI().getPath();
      String name = path.substring(1);

      //처리
      Account account = new Account("352-0528-2645-53", "Inu", 100000);

      PageGenerator pageGenerator = switch (path) {
        case "/Account" -> new AccountPageGenerator(account);
        default -> new GreetingPageGenerator(name);
      };

      String html = pageGenerator.html();

      //출력
      MessageWriter messageWriter = new MessageWriter(exchange);
      messageWriter.write(html);
    });

    httpServer.start();

    System.out.println("Server is listening... http://localhost:8000/");
  }
}
