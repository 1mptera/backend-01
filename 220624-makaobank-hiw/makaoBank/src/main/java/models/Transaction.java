package models;

public class Transaction {
  private String command;
  private Account target;
  private long amount;

  public Transaction(String command, Account target, long amount) {
    this.command = command;
    this.target = target;
    this.amount = amount;
  }

  public String command() {
    return this.command;
  }

  public Account target() {
    return this.target;
  }

  public long amount() {
    return this.amount;
  }
}
