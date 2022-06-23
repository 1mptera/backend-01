package services;

import models.Account;

import java.util.ArrayList;
import java.util.List;

public class TransferService {
  private final List<Account> accounts;

  public TransferService(List<Account> accounts) {
    this.accounts = new ArrayList<>(accounts);
  }

  public void transfer(String from, String to, long amount) {
    // TODO: To도 써야 함

    Account sender = accounts.stream()
        .filter(i -> i.identifier().equals(from))
        .findFirst()
        .get();
    Account receiver = accounts.stream()
        .filter(i -> i.identifier().equals(to))
        .findFirst()
        .get();

    sender.transfer(receiver, amount);
  }
}
