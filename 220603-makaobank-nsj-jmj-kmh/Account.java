public class Account {
    private long amount = 1000;
    private String accountNumber = "352-0914-9066-63";

    public String getAccountNumber() {
        return accountNumber;
    }

    public long getAmount() {
        return amount;
    }

    public void transfer(long transAmount) {
        amount -= transAmount;
    }
}
