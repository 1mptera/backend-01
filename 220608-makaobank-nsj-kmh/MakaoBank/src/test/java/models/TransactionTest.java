// 거래정보 확인
// 거래정보 비교
//

package models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TransactionTest {
    @Test
    void creation() {
        Transaction transaction = new Transaction("잔액", 1000);
    }

    @Test
    void equals() {
        Transaction transaction1 = new Transaction("잔액", 10000);
        Transaction transaction2 = new Transaction("잔액", 1000);

        assertEquals(transaction1, transaction2);
    }

    @Test
    void string() {
        Transaction transaction = new Transaction("잔액",1000);

        assertEquals("Transaction(잔액 : 1000)",transaction.toString());

    }

}

