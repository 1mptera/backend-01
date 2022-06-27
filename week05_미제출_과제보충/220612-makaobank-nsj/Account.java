import java.util.ArrayList;
import java.util.List;

public class Account {
  private String number = "011-1234-1234-123";

  private long amount = 1000;

  private List<String> transactions = new ArrayList<>();

  public String getNumber() {
    return number;
  }

  public long getAmount() {
    return amount;
  }

  public List<String> getTransactions() {
    return transactions;
  }

  public int getTransactionsSize() {
    return transactions.size();
  }

  public void transfer(long transferAmount) {
     amount -= transferAmount;

    transactions.add("송금: " + transferAmount + "원");
  }
}
