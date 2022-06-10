package models;

public class Transaction {
  private final String TYPE;
  private final int AMOUNT;

  public Transaction(String type, int amount) {
    this.TYPE = type;
    this.AMOUNT = amount;
  }

  @Override
  public boolean equals(Object other) {
    Transaction otherTransaction = (Transaction) other;
    return this.TYPE.equals(otherTransaction.TYPE)
        && this.AMOUNT == otherTransaction.AMOUNT;
  }

  @Override
  public String toString() {
    return "Transaction(" + this.TYPE + ", " + this.AMOUNT + ")";
  }

  public String type() {
    return this.TYPE;
  }

  public int amount() {
    return this.AMOUNT;
  }
}
