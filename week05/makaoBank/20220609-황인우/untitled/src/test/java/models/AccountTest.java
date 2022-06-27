package models;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {
  @Test
  void createListTest() {
    Account testAccount = new Account();

    List<Transaction> testTransactions = new ArrayList<>();

    testTransactions.add(new Transaction("잔액", 5000));
    testTransactions.add(new Transaction("입금", 1000));
    testTransactions.add(new Transaction("출금", 4000));
    testTransactions.add(new Transaction("입금", 200));
    testTransactions.add(new Transaction("입금", 100));
    testTransactions.add(new Transaction("출금", 600));

    List<TransactionResult> testTransactionResults = testAccount.process(testTransactions);

    assertNotNull(testTransactionResults);
  }

  @Test
  void getFirstTransactionResultTest() {
    Account testAccount = new Account();

    List<Transaction> testTransactions = new ArrayList<>();

    testTransactions.add(new Transaction("잔액", 5000));
    testTransactions.add(new Transaction("입금", 1000));
    testTransactions.add(new Transaction("출금", 4000));
    testTransactions.add(new Transaction("입금", 200));
    testTransactions.add(new Transaction("입금", 100));
    testTransactions.add(new Transaction("출금", 600));

    List<TransactionResult> testTransactionResults = testAccount.process(testTransactions);

    TransactionResult firstTransactionResult = testTransactionResults.get(0);

    assertEquals(new TransactionResult(new Transaction("잔액", 5000), 5000), firstTransactionResult);
  }

  @Test
  void getAllTransactionResultsTest() {
    Account testAccount = new Account();

    List<Transaction> testTransactions = new ArrayList<>();

    testTransactions.add(new Transaction("잔액", 5000));
    testTransactions.add(new Transaction("입금", 1000));
    testTransactions.add(new Transaction("출금", 4000));
    testTransactions.add(new Transaction("입금", 200));
    testTransactions.add(new Transaction("입금", 100));
    testTransactions.add(new Transaction("출금", 600));

    List<TransactionResult> testTransactionResults = testAccount.process(testTransactions);

    assertEquals(new TransactionResult(new Transaction("잔액", 5000), 5000), testTransactionResults.get(0));
    assertEquals(new TransactionResult(new Transaction("입금", 1000), 6000), testTransactionResults.get(1));
    assertEquals(new TransactionResult(new Transaction("출금", 4000), 2000), testTransactionResults.get(2));
    assertEquals(new TransactionResult(new Transaction("입금", 200), 2200), testTransactionResults.get(3));
    assertEquals(new TransactionResult(new Transaction("입금", 100), 2300), testTransactionResults.get(4));
    assertEquals(new TransactionResult(new Transaction("출금", 600), 1700), testTransactionResults.get(5));
  }
}
