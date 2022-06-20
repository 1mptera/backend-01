package models;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {
    @Test
    void simpleTest() {
        Account account = new Account();
//        List<Transaction> transactions = new ArrayList<>();
//        transactions.add(new Transaction("잔액", 1000));
//        transactions.add(new Transaction("출금", 300));
//        transactions.add(new Transaction("입금", 500));

        //List<TransactionResult> transactionResults = account.process(transactions);
        assertEquals(List.of(), account.process(List.of()));
       // assertNotNull(transactionResults);
    }
}
