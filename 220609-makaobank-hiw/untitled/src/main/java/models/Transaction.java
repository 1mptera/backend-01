package models;

import java.util.Objects;

public class Transaction {
  private final String TYPE;
  private final int AMOUNT;

  public Transaction(String type, int amount) {
    this.TYPE = type;
    this.AMOUNT = amount;
  }

  public String getType() {
    return this.TYPE;
  }

  public Integer getAmount() {
    return this.AMOUNT;
  }

  @Override
  public boolean equals(Object other) {
    Transaction otherTransaction = (Transaction) other;

    return Objects.equals(this.TYPE, otherTransaction.TYPE)
        && this.AMOUNT == otherTransaction.AMOUNT;
  }

  @Override
  public String toString() {
    return "TYPE: " + this.TYPE + ", AMOUNT: " + this.AMOUNT;
  }
}
