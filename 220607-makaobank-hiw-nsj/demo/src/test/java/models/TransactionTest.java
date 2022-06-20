// 거래 정보 확인
// 거래 정보 비교
//
//

package models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TransactionTest {
    @Test
    void creation() {
        Transaction transaction = new Transaction("입금", 1000);
    }

    @Test
    void equalsTest() {
        Transaction transaction1 = new Transaction("입금", 1000);
        Transaction transaction2 = new Transaction("입금", 1000);

        assertEquals(transaction1, transaction2);
    }
}
