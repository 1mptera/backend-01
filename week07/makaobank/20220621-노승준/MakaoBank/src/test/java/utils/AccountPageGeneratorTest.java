package utils;

import models.Account;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountPageGeneratorTest {
  @Test
  void html() {
    Account account = new Account("1234", "ashal", 3000);

    PageGenerator pageGenerator = new AccountPageGenerator(account);

    String html = pageGenerator.html();

    assertTrue(html.contains("계좌번호: 1234"));
    assertTrue(html.contains("이름: ashal"), "이름 포한 안됨"+ html);
    assertTrue(html.contains("잔액: 3000"), "잔액 포한 안됨"+ html);

  }
}
