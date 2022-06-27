import java.util.ArrayList;
import java.util.List;

public class Account {
    private long amount = 10000;
    List<String> transactions = new ArrayList<>();

    public long getAmount() {
        return this.amount;
    }

    public List<String> getTransactions() {
        return this.transactions;
    }

    public void transfer(long transferredMoney) {
        this.amount -= transferredMoney;
        transactions.add(transferredMoney + "원 송금");
    }
}
