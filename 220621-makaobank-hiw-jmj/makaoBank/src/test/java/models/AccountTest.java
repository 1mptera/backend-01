package models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {
  @Test
  void creation() {
    Account account = new Account("1234", "Inu", 4000);

    assertEquals("1234", account.identifier());
    assertEquals("Inu", account.name());
    assertEquals(4000, account.amount());
  }
}