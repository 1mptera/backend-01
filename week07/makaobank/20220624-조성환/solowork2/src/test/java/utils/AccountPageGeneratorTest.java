package utils;

import models.Account;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountPageGeneratorTest {
  @Test
  void creation() {
    Account account = new Account("1234","ashal",3000);

    PageGenerator pageGenerator = new AccountPageGenerator(account);

    String html = pageGenerator.html();

    assertTrue(html.contains("계좌번호: 1234"), "계좌 문제 있음" + html);
    assertTrue(html.contains("이름: ashal"), "이름 문제 있음" + html);
    assertTrue(html.contains("잔액: 3000"), "잔액 문제 있음" + html);
  }


}