public class Account {
    private long amount;

    Account() {
        this.amount = 5000;
    }

    public long getAmount() {
        return this.amount;
    }

    public void transfer(long transferredAmount) {
        this.amount -= transferredAmount;
    }
}
