// 1. 거래정보 만들기 완료.
// 2. 거래정보 비교하기 완료. 테스트 결과 내용이 잘 보이도록!. 완성
// 3. 잔액 변동
// 4. 잔액 변하게 한 결과 도출?

package models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TransactionTest {
  @Test
  void creation() {
    Transaction transaction = new Transaction("입금", 1000);
  }

  @Test
  void equals() {
    Transaction transaction1 = new Transaction("입금", 1000);
    Transaction transaction2 = new Transaction("입금", 1000);

    assertEquals(transaction1, transaction2);
  }

  @Test
  void string() {
    Transaction transaction = new Transaction("입금", 1000);

    assertEquals("Transaction(입금: 1000)", transaction.toString());
  }
}
