import java.util.ArrayList;
import java.util.List;

public class Account {
  private final String accountNumber = "123-456-789-012";
  private long amount = 1000;
  private final ArrayList<String> transactions = new ArrayList<>();

  public String getAccountNumber() {
    return accountNumber;
  }

  public long getAmount() {
    return amount;
  }

  public List<String> transactions() {
    return new ArrayList<>(transactions);
  }

  public int transactionSize() {
    return transactions.size();
  }

  public void transfer(Long transferAmount) {
    amount -= transferAmount;
    transactions.add("송금 : " + transferAmount + "원");
  }
}
