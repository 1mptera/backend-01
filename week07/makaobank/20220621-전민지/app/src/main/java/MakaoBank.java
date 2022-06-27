// 1~2강. 서버생성 후 본인의 이름을 path로 입력하면 Hello, 이름! 문구 출력
// 마카오뱅크 기능 3가지
// 1. account(계좌번호 필요). 주소는 /account
// 2. 송금. 주소는 /transfer
//   -> 어떻게 구분? : 계좌번호
//   -> 어떻게 관리? : Map
//   -> 송금 발생 시: Transaction 추가
// 3. 거래내역 확인. 주소는 /transactions
//   -> Transactions(거래내역) 관리 -> List 로 관리

// account 관련 -> 어카운트 모델 만들고, MessageGenerator->PageGenerator로 변환 및 상속하여 사용

// transfer 관련
// 1. TransferPageGenerator 생성하여 송금 UI 보여주기
// 2. 송금 처리 -> POST, GET 이용
// 3. 송금 결과 보여주고 만들어주기

import com.sun.net.httpserver.HttpServer;
import models.Account;
import utils.*;

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

    httpServer.createContext("/", (exchange) -> {

      // 입력
      URI requestURI = exchange.getRequestURI();
      String path = requestURI.getPath();

      String method = exchange.getRequestMethod();

      // 처리
      Account account = new Account("1234", "Ashal", 3000);

        PageGenerator pageGenerator = switch (path) {
          case "/account" -> new AccountPageGenerator(account);
          case "/transfer" ->
              method.equals("GET")
                  ? new TransferPageGenerator(account)
                  : new TransferProcessPageGenerator(account);
          default -> new GreetingPageGenerator();
        };

        String content = pageGenerator.html();


      // 출력
      MessageWriter messageWriter = new MessageWriter(exchange);
      messageWriter.write(content);
    });

    httpServer.start();
    System.out.println("http://localhost:8000/");
  }
}
