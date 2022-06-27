package models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {
  // 계좌 번호
  // 이름
  // 잔액
  @Test
  void creation() {
    Account account = new Account("1234", "Ashal", 3000);

    assertEquals("1234", account.identifer());
    assertEquals("Ashal", account.name());
    assertEquals(3000, account.amount());
  }


}