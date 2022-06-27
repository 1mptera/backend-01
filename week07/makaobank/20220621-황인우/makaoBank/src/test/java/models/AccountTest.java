package models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {
  @Test
  void creation() {
    Account testAccount = new Account("352-0528", "Inu", 500000);

    assertEquals("352-0528", testAccount.identifier());
    assertEquals("Inu", testAccount.name());
    assertEquals(500000, testAccount.amount());
  }
}
