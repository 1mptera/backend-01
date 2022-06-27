package models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {
  @Test
  void creation() {
    Account testAccount = new Account("352-0528-2645-53", "Inu", 100000);

    assertEquals("352-0528-2645-53", testAccount.identifier());
    assertEquals("Inu", testAccount.name());
    assertEquals(100000, testAccount.amount());
  }

}
