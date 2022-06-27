package models;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Account {
  private String identifier;
  private String name;
  private long amount;

  private List<Transaction> transactions;

  public Account(String identifier, String name, long amount) {
    this.identifier = identifier;
    this.name = name;
    this.amount = amount;

    transactions = new ArrayList<>();
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

  public void transfer(Account receiver, long amountTransferred) {
    this.amount -= amountTransferred;
    receiver.amount += amountTransferred;

    this.transactions.add(new Transaction("송금", receiver, amountTransferred));
    receiver.transactions.add(new Transaction("입금", this, amountTransferred));
  }

  public List<Transaction> transactions() {
    return new ArrayList<>(transactions);
  }
}
