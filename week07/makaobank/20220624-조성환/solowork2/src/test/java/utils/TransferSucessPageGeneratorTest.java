package utils;

import models.Account;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TransferSucessPageGeneratorTest {
  @Test
  void success() {
    Account account = new Account("1234", "ashal", 3000);
    PageGenerator pageGenerator = new TransferSucessPageGenerator(account);

    String html = pageGenerator.html();

    assertTrue(html.contains("계좌 이체 성공"));
  }
}
