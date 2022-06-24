package utils;

import models.Account;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountPageGeneratorTest {

  @Test
  void content() {
    Account account = new Account("352", "Chikorita", 50000);

    PageGenerator pageGenerator = new AccountPageGenerator(account);

    assertTrue(pageGenerator.html().contains("계좌번호: 352"),
        "html에 계좌번호 안내 없음\n" +
            "html 내용: {\n" + pageGenerator.html() + "\n}\n");

    assertTrue(pageGenerator.html().contains("예금주명: Chikorita"),
        "html에 예금주명 안내 없음\n" +
            "html 내용: {\n" + pageGenerator.html() + "\n}\n");

    assertTrue(pageGenerator.html().contains("잔액: 50000원"),
        "html에 잔액 안내 없음\n" +
            "html 내용: {\n" + pageGenerator.html() + "\n}\n");
  }
}