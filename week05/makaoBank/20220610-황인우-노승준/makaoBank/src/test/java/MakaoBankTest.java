import models.Transaction;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MakaoBankTest {
  @Test
  void loadTransactions() throws FileNotFoundException {
    MakaoBank makaoBank = new MakaoBank();

    List<Transaction> transactions = makaoBank.loadTransactions();

    assertNotNull(transactions);

    Transaction firstTransaction = transactions.get(0);
    assertEquals(new Transaction("잔액", 1000), firstTransaction);

    Transaction anotherTransaction = transactions.get(1);
    assertEquals(new Transaction("입금", 200), anotherTransaction);

    Transaction finalTransaction = transactions.get(4);
    assertEquals(new Transaction("출금", 45000), finalTransaction);
  }

  @Test
  void createTransactions() {
    MakaoBank makaoBank = new MakaoBank();

    assertEquals(new Transaction("입금", 5000),
        makaoBank.parseTransaction("입금,5000"));
  }
}
