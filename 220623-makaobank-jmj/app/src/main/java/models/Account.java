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
    return identifier;
  }

  public String name() {
    return name;
  }

  public long amount() {
    return amount;
  }

  //TODO: 지금은 문제가 있음. 받는 사람이 필요함
  public void transfer(Account receiver, long amount) {
    this.amount -= amount;

    receiver.amount += amount;
  }
}
