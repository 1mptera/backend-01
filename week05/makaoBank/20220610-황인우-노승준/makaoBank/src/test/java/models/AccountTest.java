package models;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {
  @Test
  void process() {
    Account account = new Account();

    List<Transaction> transactions = new ArrayList<>();

    List<TransactionResult> transactionResults = account.process(transactions);

    assertNotNull(transactionResults);
  }

  @Test
  void processOneTransaction() {
    Transaction transaction = new Transaction("입금", 200);
    int amount = 1000 + 200;

    TransactionResult transactionResult = new TransactionResult(transaction, amount);

    assertArrayEquals(new String[]{"입금","200","1200"}, transactionResult.values());
  }
}
