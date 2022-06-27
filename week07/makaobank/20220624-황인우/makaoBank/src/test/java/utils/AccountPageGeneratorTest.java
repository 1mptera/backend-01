package utils;

import models.Account;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountPageGeneratorTest {

  @Test
  void content() {
    Account account = new Account("352", "Chikorita", 50000);

    PageGenerator pageGenerator = new AccountPageGenerator(account);

    assertTrue(pageGenerator.content().contains("계좌번호: 352"),
        "content에 계좌번호 안내 없음\n" +
            "content 내용: {\n" + pageGenerator.content() + "\n}\n");

    assertTrue(pageGenerator.content().contains("예금주명: Chikorita"),
        "content에 예금주명 안내 없음\n" +
            "content 내용: {\n" + pageGenerator.content() + "\n}\n");

    assertTrue(pageGenerator.content().contains("잔액: 50000원"),
        "content에 잔액 안내 없음\n" +
            "content 내용: {\n" + pageGenerator.content() + "\n}\n");
  }
}
