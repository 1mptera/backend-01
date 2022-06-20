package models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TransactionTest {
  @Test
  void equalsTest() {
    Transaction transaction1 = new Transaction("입금", 5000);
    Transaction transaction2 = new Transaction("입금", 5000);

    assertEquals(transaction1, transaction2);
  }
}
