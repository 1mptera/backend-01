package utils;

import models.Account;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountPageGeneratorTest {
  @Test
  void html() {
    Account account = new Account("1234", "Inu", 4000);

    PageGenerator pageGenerator = new AccountPageGenerator(account);

    assertTrue(pageGenerator.html().contains("계좌번호: 1234"), "계좌번호 문제");
    assertTrue(pageGenerator.html().contains("이름: Inu"), "이름 문제");
    assertTrue(pageGenerator.html().contains("잔액: 4000원"), "잔액 문제");
  }

}