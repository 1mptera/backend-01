import models.Transaction;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MakaoBankTest {
    @Test
    void simpleTest() throws FileNotFoundException {
        MakaoBank makaoBank = new MakaoBank();

        List<Transaction> transactions = makaoBank.loadTransactions();

        assertNotNull(transactions);
    }

    @Test
    void oneTransactionTest() throws FileNotFoundException {
        MakaoBank makaoBank = new MakaoBank();
        List<Transaction> transactions = makaoBank.loadTransactions();

        Transaction transaction1 = transactions.get(0);
        assertNotNull(transaction1);
        assertEquals(new Transaction("잔액", 1000), transaction1);

        Transaction transaction2 = transactions.get(1);
        assertNotNull(transaction2);
        assertEquals(new Transaction("출금", 300), transaction2);

        Transaction transaction3 = transactions.get(2);
        assertNotNull(transaction3);
        assertEquals(new Transaction("입금", 500), transaction3);
    }
}