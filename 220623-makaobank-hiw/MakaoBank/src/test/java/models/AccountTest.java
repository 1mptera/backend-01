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

  @Test
  void transfer() {
    Account sender = new Account("352-0528", "Chikorita", 100000);
    Account receiver = new Account("179-20", "Eevee", 50000);

    sender.transfer(receiver, 1000);

    assertEquals(99000, sender.amount());
    assertEquals(51000, receiver.amount());
  }
}