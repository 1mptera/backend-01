package utils;

import models.Account;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TransactionPageGeneratorTest {

  @Test
  void title() {
    Account account1 = new Account("352", "Chikorita", 50000);

    PageGenerator pageGenerator = new TransactionPageGenerator(account1);

    assertTrue(pageGenerator.content().contains("Chikorita 거래 내역"),
        "content에 거래 내역 안내 없음\n" +
            "content 내용: {\n" + pageGenerator.content() + "\n}\n");
  }

  @Test
  void transaction() {
    Account account1 = new Account("352", "Chikorita", 50000);
    Account account2 = new Account("179", "Eevee", 1000);

    account1.transfer(account2, 100);
    account2.transfer(account1, 300);

    PageGenerator pageGenerator1 = new TransactionPageGenerator(account1);

    assertTrue(pageGenerator1.content().contains("송금: 100원 Eevee"),
        "content에 송금 내역 예시 1 없음\n" +
            "content 내용: {\n" + pageGenerator1.content() + "\n}\n");

    assertTrue(pageGenerator1.content().contains("입금: 300원 Eevee"),
        "content에 입금 내역 예시 1 없음\n" +
            "content 내용: {\n" + pageGenerator1.content() + "\n}\n");

    PageGenerator pageGenerator2 = new TransactionPageGenerator(account2);

    assertTrue(pageGenerator2.content().contains("입금: 100원 Chikorita"),
        "content에 송금 내역 예시 2 없음\n" +
            "content 내용: {\n" + pageGenerator2.content() + "\n}\n");

    assertTrue(pageGenerator2.content().contains("송금: 300원 Chikorita"),
        "content에 송금 내역 예시 2 없음\n" +
            "content 내용: {\n" + pageGenerator2.content() + "\n}\n");
  }
}
