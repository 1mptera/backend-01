// 마카오 뱅크
// 잔액 조회
// 1. account 계좌 번호 필요함
// 2. 송금
// 여러 계좌 -> 계좌 번호로 구분
// Transaction 추가
// 3. 거래내역 transactions
// 거래내역 List로 관리
// messageGenerator 를 pageGenerator로 이름 바꾸기
// pageGenerator를 상속 AccountPageGenrator

import com.sun.net.httpserver.HttpServer;
import models.Account;
import utils.AccountPageGenerator;
import utils.PageGenerator;
import utils.MessageWriter;

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

      URI requestURI = exchange.getRequestURI();
      String path = requestURI.getPath();

      if(!path.equals("/account")) {
         // todo : 뭐가 문제가 있음
      }

      Account account = new Account("1234" , "Ashal" , 3000);
      PageGenerator PageGenerator = new AccountPageGenerator(account);
      String content = PageGenerator.html();


      MessageWriter messageWriter = new MessageWriter(exchange);
      messageWriter.write(content);

    });


    httpServer.start();
    System.out.print("http://localhost:8000");

  }


}