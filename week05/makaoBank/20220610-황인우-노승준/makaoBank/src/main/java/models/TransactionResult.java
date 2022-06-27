package models;

public class TransactionResult {
  private final Transaction TRANSACTION;
  private final int AMOUNT;

  public TransactionResult(Transaction transaction, int amount) {
    this.TRANSACTION = transaction;
    this.AMOUNT = amount;
  }

  public String[] values() {
    return new String[] {
        //this.TRANSACTION.type(),
        //this.TRANSACTION.amount(),
        //this.AMOUNT
    };
  }
}
