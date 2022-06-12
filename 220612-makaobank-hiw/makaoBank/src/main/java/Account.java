import java.util.ArrayList;
import java.util.List;

public class Account {
  private long amount;
  private List<String> transactionsList = new ArrayList<>();

  Account() {
    this.amount = 10000;
  }

  public long getAmount() {
    return this.amount;
  }

  public List<String> getTransactionsList() {
    return this.transactionsList;
  }

  public void transfer(long transferredAmount) {
    this.amount -= transferredAmount;
    transactionsList.add(transferredAmount + "원 송금");
  }
}
