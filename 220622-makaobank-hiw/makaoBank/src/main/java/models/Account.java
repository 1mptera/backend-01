package models;

public class Account {
  private final String identifier;
  private final String name;
  private final long amount;

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
}
