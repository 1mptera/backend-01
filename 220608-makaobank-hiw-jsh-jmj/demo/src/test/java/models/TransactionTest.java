package models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TransactionTest {
    @Test
    void simpleTest() {
        Transaction transaction1 = new Transaction("잔액", 1000);
        Transaction transaction2 = new Transaction("잔액", 1000);
        assertEquals(transaction1, transaction2);
    }

}