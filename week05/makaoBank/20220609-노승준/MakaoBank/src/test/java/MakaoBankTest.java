import models.Transaction;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MakaoBankTest {
  @Test
  void loadTransaction() throws FileNotFoundException {
    MakaoBank makaoBank = new MakaoBank();

    List<Transaction> transactions = makaoBank.loadTransaction();

    assertNotNull(transactions);

    Transaction transaction1 = transactions.get(0);
    Transaction transaction2 = transactions.get(1);

    assertEquals(new Transaction("μμ‘", 1000), transaction1);
    assertEquals(new Transaction("μκΈ", 200), transaction2);

  }
}

