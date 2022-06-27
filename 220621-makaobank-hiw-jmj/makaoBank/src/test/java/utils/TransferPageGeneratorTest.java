package utils;

import models.Account;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TransferPageGeneratorTest {

  @Test
  void html() {
    Account account = new Account("1234", "Inu", 4000);

    PageGenerator pageGenerator = new TransferPageGenerator(account);

    assertTrue(pageGenerator.html().contains("잔액: "), "잔액 문제");
    assertTrue(pageGenerator.html().contains("보낼 계좌번호: <input type"), "계좌번호 문제");
    assertTrue(pageGenerator.html().contains("보낼 금액: <input type"), "금액 문제");
    assertTrue(pageGenerator.html().contains("<button type=\"submit\">송금"), "버튼 문제");
  }
}