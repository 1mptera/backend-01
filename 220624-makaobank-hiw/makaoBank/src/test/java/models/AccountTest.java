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

  @Test
  void transfer() {
    Account sender = new Account("352", "Chikorita", 50000);
    Account receiver = new Account("179", "Eevee", 1000);

    sender.transfer(receiver, 100);

    assertEquals(49900, sender.amount());
    assertEquals(1100, receiver.amount());
  }
}