import models.Transaction;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MakakoBankTest {
    @Test
    void simple() {
        MakakoBank makakoBank = new MakakoBank();

        assertNotNull(makakoBank.loadTransaction());

//        List<Transaction> transactions = transactions.get(0);

//        assertEquals("잔액 1000",);
    }

}

