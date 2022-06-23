package utils;

import models.Account;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TransferPageGeneratorTest {

  @Test
  void amount() {
    Account account = new Account("352-0528", "Chikorita", 100000);
    PageGenerator pageGenerator = new TransferPageGenerator(account);

    assertTrue(
        pageGenerator.html().contains("잔액: 100000원"),
        "html String 변수에 잔액 정보 메세지가 없거나 Test case와 다릅니다.\n" +
            "(html 내용: " + pageGenerator.html() + ")\n"
    );
  }

  @Test
  void receiverInformation() {
    Account account = new Account("352-0528", "Chikorita", 100000);
    PageGenerator pageGenerator = new TransferPageGenerator(account);

    assertTrue(
        pageGenerator.html().contains("송금할 계좌: <input"),
        "html String 변수에 송금할 계좌 입력 칸이 없거나 Test case와 다릅니다.\n" +
            "(html 내용: " + pageGenerator.html() + ")\n"
    );

    assertTrue(
        pageGenerator.html().contains("송금할 금액: <input"),
        "html String 변수에 송금할 금액 입력 칸이 없거나 Test case와 다릅니다.\n" +
            "(html 내용: " + pageGenerator.html() + ")\n"
    );

    assertTrue(
        pageGenerator.html().contains("<button"),
        "html String 변수에 송금하기 버튼이 없거나 Test case와 다릅니다.\n" +
            "(html 내용: " + pageGenerator.html() + ")\n"
    );
  }
}