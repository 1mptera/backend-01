package models;

public class Account {
  private String identifier;
  private String name;
  private long amount;

  public Account(String identifier, String name, long amount) {
    this.identifier = identifier;
    this.name = name;
    this.amount = amount;
  }

  public String identifier() {
    return this.identifier;
  }

  public String name() {
    return this.name;
  }

  public long amount() {
    return this.amount;
  }

  public void transfer(Account receiver, long amount) {
    this.amount -= amount;
    receiver.amount += amount;
  }
}
