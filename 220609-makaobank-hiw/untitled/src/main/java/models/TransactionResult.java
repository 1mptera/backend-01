package models;

import java.util.Objects;

public class TransactionResult {
  private final Transaction TRANSACTION;
  private final int RESULT;

  public TransactionResult(Transaction transaction, int result) {
    this.TRANSACTION = transaction;
    this.RESULT = result;
  }

  @Override
  public boolean equals(Object other) {
    TransactionResult otherTransactionResult = (TransactionResult) other;

    return Objects.equals(this.TRANSACTION.getType(), otherTransactionResult.TRANSACTION.getType())
        && this.TRANSACTION.getAmount() == otherTransactionResult.TRANSACTION.getAmount()
        && this.RESULT == otherTransactionResult.RESULT;
  }

  @Override
  public String toString() {
    return "TYPE: " + this.TRANSACTION.getType() + ", AMOUNT: " + this.TRANSACTION.getAmount()
        + ", RESULT: " + this.RESULT;
  }
}
