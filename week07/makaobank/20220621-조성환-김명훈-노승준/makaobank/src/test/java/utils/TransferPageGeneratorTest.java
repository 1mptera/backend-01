package utils;

import models.Account;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TransferPageGeneratorTest {
  @Test
  void form() {
    Account account = new Account("1234", "Ashal", 3000);

    PageGenerator pageGenerator = new TransferPageGenerator(account);

    String html = pageGenerator.html();
    assertTrue(html.contains("잔액 : 3000원"), "잔액 문제 있음"  +html);
    assertTrue(html.contains("보낼계좌: <input"), "보낼계좌 문제있음"  +html);
    assertTrue(html.contains("보낼금액: <input"), "보낼계좌 문제있음"  +html);
    assertTrue(html.contains("<button type=\"submit\""), "보낼계좌 문제있음"  +html);
  }

}