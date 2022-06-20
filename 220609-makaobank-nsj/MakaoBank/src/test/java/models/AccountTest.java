package models;

import org.junit.jupiter.api.Test;

import javax.annotation.processing.AbstractProcessor;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {
  @Test
  void processWithoutTransaction() {
    Account account = new Account();
    assertEquals(List.of(), account.process(List.of()));
  }

  @Test
  void processOneTransaction() {
    Transaction transaction = new Transaction("잔액", 1000);
    TransactionResult transactionResults = new TransactionResult(transaction, 1000);

    Account accont = new Account();

    List<Transaction> transactions = List.of(transaction);

    assertEquals(List.of(transactionResults), accont.process(transactions));
  }

  @Test
  void processTwoTransaction() {

    List<Transaction> transactions = List.of(
        new Transaction("잔액", 1000),
        new Transaction("입금", 200),
        new Transaction("출금", 100)
    );

    List<TransactionResult> transactionResults = List.of(
        new TransactionResult(transactions.get(0), 1000),
        new TransactionResult(transactions.get(1), 1000 + 200),
        new TransactionResult(transactions.get(2), 1000 + 200 - 100)
    );

    Account accont = new Account();

    assertEquals(transactionResults, accont.process(transactions));
  }
}

