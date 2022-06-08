package models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TransactionResultTest {

    @Test
    void depositTest() {
        Transaction transaction = new Transaction("입금", 500);
        int amount = 1000 + 500;
        TransactionResult transactionResult = new TransactionResult(transaction, amount);
        assertEquals(new TransactionResult(transaction, 1500), transactionResult);
    }
}
