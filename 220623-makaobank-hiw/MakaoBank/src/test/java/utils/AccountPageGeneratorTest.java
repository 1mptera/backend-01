package utils;

import models.Account;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountPageGeneratorTest {
  @Test
  void identifier() {
    Account account = new Account("352-0528", "Chikorita", 100000);
    PageGenerator pageGenerator = new AccountPageGenerator(account);

    assertTrue(
        pageGenerator.html().contains("계좌번호: 352-0528"),
        "html String 변수에 계좌번호 정보 메세지가 없거나 Test case와 다릅니다.\n" +
            "(html 내용: " + pageGenerator.html() + ")\n"
    );
  }

  @Test
  void name() {
    Account account = new Account("352-0528", "Chikorita", 100000);
    PageGenerator pageGenerator = new AccountPageGenerator(account);

    assertTrue(
        pageGenerator.html().contains("예금주명: Chikorita"),
        "html String 변수에 예금주명 정보 메세지가 없거나 Test case와 다릅니다.\n" +
            "(html 내용: " + pageGenerator.html() + ")\n"
    );
  }

  @Test
  void amount() {
    Account account = new Account("352-0528", "Chikorita", 100000);
    PageGenerator pageGenerator = new AccountPageGenerator(account);

    assertTrue(
        pageGenerator.html().contains("잔액: 100000원"),
        "html String 변수에 잔액 정보 메세지가 없거나 Test case와 다릅니다.\n" +
            "(html 내용: " + pageGenerator.html() + ")\n"
    );
  }
}
