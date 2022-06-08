import models.Transaction;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MakakoBankTest {
    @Test
    void simple() throws FileNotFoundException {
        MakakoBank makakoBank = new MakakoBank();

        List<Transaction> transactions = makakoBank.loadTransaction();

        assertNotNull(transactions);

        Transaction transaction = transactions.get(0);

        assertEquals(new Transaction("잔액", 1000), transaction);
    }
}

