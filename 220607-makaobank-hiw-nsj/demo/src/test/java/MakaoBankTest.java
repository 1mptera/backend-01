import models.Transaction;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MakaoBankTest {
    @Test
    void loadTransactionsTest() throws FileNotFoundException {
        MakaoBank makaoBank = new MakaoBank();

        List<Transaction> transactions = makaoBank.loadTransactions();
        assertNotNull(transactions);

        Transaction transaction = transactions.get(0);
        assertNotNull(transaction);
        assertEquals("잔액", transaction.getType());
        assertEquals(2000, transaction.getAmount());
    }

}
