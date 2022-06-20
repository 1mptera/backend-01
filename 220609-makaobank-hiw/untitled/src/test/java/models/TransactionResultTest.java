package models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TransactionResultTest {
  @Test
  void equalsTest() {
    TransactionResult transactionResult1 = new TransactionResult(new Transaction("잔액", 5000), 5000);
    TransactionResult transactionResult2 = new TransactionResult(new Transaction("잔액", 5000), 5000);

    assertEquals(transactionResult1, transactionResult2);
  }

  @Test
  void transferTest() {
    TransactionResult transactionResult = new TransactionResult(new Transaction("잔액", 5000), 5000);

    String line = transactionResult.transfer();

    assertEquals("잔액,5000,5000", line);
  }
}
