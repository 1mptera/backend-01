public class Account {
  private final String accountNumber = "123-456-789-012";
  private long amount = 1000;

  public String getAccountNumber() {
    return accountNumber;
  }

  public long getAmount() {
    return amount;
  }

  public void transfer(Long transferAmount) {
    amount -= transferAmount;
  }
}
