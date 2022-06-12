public class Account {
  private String number = "011-1234-1234-123";
  private long amount = 1000;

  public String getNumber() {
    return number;
  }

  public long getAmount() {
    return amount;
  }

  public void transfer(long transferAmount) {
     amount -= transferAmount;
  }
}
