package models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {
  @Test
  void creation() {
    Account account = new Account("1234", "ashal", 3000);

    assertEquals("1234", account.identifier());
    assertEquals("ashal", account.name());
    assertEquals(3000, account.amount());
  }

  @Test
  void transfer() {
    Account sender = new Account("1234", "ashal", 3000);
    Account recevier = new Account("2345", "joker", 1000);

    sender.transfer(recevier, 500);

    assertEquals(2500, sender.amount());
    assertEquals(1500, recevier.amount());
  }
} 