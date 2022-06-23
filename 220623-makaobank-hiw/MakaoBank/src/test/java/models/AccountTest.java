package models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {
  @Test
  void creation() {
    Account account = new Account("352-0528", "Chikorita", 100000);

    assertEquals("352-0528", account.identifier());
    assertEquals("Chikorita", account.name());
    assertEquals(100000, account.amount());
  }
}