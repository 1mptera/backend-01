// 1. 서버 생성, 본인 이름으로 path 접근 시 문구출력 화면 노출
// 2. 마카오뱅크 기본 기능 구현 -> 3가지
//  1) 잔액조회: account 활용. account 계좌 생성(계좌번호, 이름, 잔액), PageGenerator 생성,
//             pageGenerator 추상화 후 받아서 쓰기, html로 텍스트 주기, /account 패스로 접속
//  2) 송금: transfer 활용. 해당 페이지 제너레이터 생성

import com.sun.net.httpserver.HttpServer;
import models.Account;
import services.TransferService;
import utils.*;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.URI;
import java.util.List;

public class MakaoBank {
  private Account account;
  private TransferService transferService;

  public static void main(String[] args) throws IOException {
    MakaoBank application = new MakaoBank();
    application.run();
  }

  public void run() throws IOException {
    List<Account> accounts = List.of(
        new Account("1234", "Ashal", 3000),
        new Account("2345", "JOKER", 1000)
    );

    Account account = accounts.get(0);
    transferService = new TransferService(accounts);

    InetSocketAddress address = new InetSocketAddress(8000);

    HttpServer httpServer = HttpServer.create(address, 0);

    httpServer.createContext("/", (exchange) -> {

      // 입력
      URI requestURI = exchange.getRequestURI();
      String path = requestURI.getPath();

      String method = exchange.getRequestMethod();

      // 처리

      PageGenerator pageGenerator = process(path, method);

      String content = pageGenerator.html();

      // 출력
      MessageWriter messageWriter = new MessageWriter(exchange);
      messageWriter.write(content);
    });

    httpServer.start();
    System.out.println("http://localhost:8000/");
  }

  public PageGenerator process(String path, String method) {
    return switch (path) {
      case "/account" -> processAccount();
      case "/transfer" -> processTransfer(method);
      default -> new GreetingPageGenerator();
    };
  }

  public AccountPageGenerator processAccount() {
    return new AccountPageGenerator(account);
  }

  public PageGenerator processTransfer(String method) {
    if (method.equals("GET")) {
      return transferProcessGet();
    }
    return transferProcessPost();
  }

  public TransferPageGenerator transferProcessGet() {
    return new TransferPageGenerator(account);
  }

  public TransferSuccessPageGenerator transferProcessPost() {
    // TODO: 진짜 처리
    transferService.transfer("1234", "2345", 1000);
    return new TransferSuccessPageGenerator(account);
  }
}
