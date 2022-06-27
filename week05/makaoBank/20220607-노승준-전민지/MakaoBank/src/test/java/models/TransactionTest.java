// 거래 내역
// 비교

package models;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TransactionTest {
    @Test
    void creation() {
        Transaction transaction = new Transaction("입금", 1000);
    }

    @Test
    void equals() {
        Transaction transactions1 = new Transaction("입금", 1000);
        Transaction transactions2 = new Transaction("입금", 1000);

        assertEquals(transactions1, transactions2);
    }

}