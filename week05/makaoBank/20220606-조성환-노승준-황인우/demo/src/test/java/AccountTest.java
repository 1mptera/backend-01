import models.Account;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {
    @Test
    void loadTransactionNullTest() {
        Account account = new Account();

        assertNotNull(account.loadTransactions());
    }

    @Test
    void firstTransactionReadTest() {
        Account account = new Account();

        assertEquals("잔액,1000", account.getTransaction(0));
    }
}