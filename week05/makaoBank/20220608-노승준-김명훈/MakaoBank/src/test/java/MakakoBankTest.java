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

        Transaction transaction1 = transactions.get(0);
        Transaction transaction2 = transactions.get(1);

        assertEquals(new Transaction("μμ‘", 1000), transaction1);
        assertEquals(new Transaction("μκΈ", 2000), transaction2);
    }
}

