package models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {
  @Test
  void creation() {
    Account testAccount = new Account("352-0528", "Chikorita", 1000000);

    assertEquals("352-0528", testAccount.identifier());
    assertEquals("Chikorita", testAccount.name());
    assertEquals(1000000, testAccount.amount());
  }
}
