package models;

public class TransactionResult {
    private final Transaction transaction;
    private final int result;

    public TransactionResult(Transaction transaction, int result) {
        this.transaction = transaction;
        this.result = result;
    }

    @Override
    public boolean equals(Object other) {
        TransactionResult otherTransactionResult = (TransactionResult) other;
        return this.transaction.getType().equals(otherTransactionResult.transaction.getType()) &&
                this.transaction.getAmount() == otherTransactionResult.transaction.getAmount() &&
                this.result == otherTransactionResult.result;
    }

    @Override
    public String toString() {
        return this.transaction.getType() + " " + this.transaction.getAmount() + " " + this.result;
    }
}
