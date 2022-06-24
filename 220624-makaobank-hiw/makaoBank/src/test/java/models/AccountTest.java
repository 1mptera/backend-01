package models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {
  @Test
  void creation() {
    Account account = new Account("352", "Chikorita", 50000);

    assertEquals("352", account.identifier());
    assertEquals("Chikorita", account.name());
    assertEquals(50000, account.amount());
  }
}