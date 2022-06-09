package models;

import java.util.Objects;

public class TransactionResult {
  private final Transaction TRANSACTION;
  private final Integer RESULT;

  public TransactionResult(Transaction transaction, int result) {
    this.TRANSACTION = transaction;
    this.RESULT = result;
  }

  @Override
  public boolean equals(Object other) {
    TransactionResult otherTransactionResult = (TransactionResult) other;

    return Objects.equals(this.TRANSACTION.getType(), otherTransactionResult.TRANSACTION.getType())
        && Objects.equals(this.TRANSACTION.getAmount(), otherTransactionResult.TRANSACTION.getAmount())
        && this.RESULT.equals(otherTransactionResult.RESULT);
  }

  @Override
  public String toString() {
    return "TYPE: " + this.TRANSACTION.getType()
        + ", AMOUNT: " + this.TRANSACTION.getAmount()
        + ", RESULT: " + this.RESULT;
  }

  public String transfer() {
    return String.join(",",
        this.TRANSACTION.getType(),
        this.TRANSACTION.getAmount().toString(),
        this.RESULT.toString()
    );
  }
}
