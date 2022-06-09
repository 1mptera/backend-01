import models.Transaction;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MakaoBankTest {
  @Test
  void createListTest() throws FileNotFoundException {
    MakaoBank testApplication = new MakaoBank();

    List<Transaction> transactions = testApplication.loadTransactions();

    assertNotNull(transactions);
  }

  @Test
  void getFirstTransactionTest() throws FileNotFoundException {
    MakaoBank testApplication = new MakaoBank();

    List<Transaction> transactions = testApplication.loadTransactions();

    Transaction firstTransaction = transactions.get(0);

    assertEquals(new Transaction("잔액", 5000), firstTransaction);
  }

  @Test
  void getAllTransactionTest() throws FileNotFoundException {
    MakaoBank testApplication = new MakaoBank();

    List<Transaction> transactions = testApplication.loadTransactions();

    assertEquals(new Transaction("잔액", 5000), transactions.get(0));
    assertEquals(new Transaction("입금", 1000), transactions.get(1));
    assertEquals(new Transaction("출금", 4000), transactions.get(2));
    assertEquals(new Transaction("입금", 200), transactions.get(3));
    assertEquals(new Transaction("입금", 100), transactions.get(4));
    assertEquals(new Transaction("출금", 600), transactions.get(5));
  }
}
