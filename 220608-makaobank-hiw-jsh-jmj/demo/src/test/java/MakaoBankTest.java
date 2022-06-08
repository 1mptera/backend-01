import models.Transaction;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MakaoBankTest {
    @Test
    void simpleTest() {
        MakaoBank makaoBank = new MakaoBank();

        List<Transaction> transactions = makaoBank.loadTransactions();

        assertNotNull(transactions);
    }

    @Test
    void oneTransactionTest() {
        MakaoBank makaoBank = new MakaoBank();
        List<Transaction> transactions = makaoBank.loadTransactions();

        Transaction firstTransaction = transactions.get(0);

        //assertEquals();
    }
}