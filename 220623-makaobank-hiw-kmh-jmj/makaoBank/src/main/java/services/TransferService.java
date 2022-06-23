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
    // todo account는 from과 관련돼야 함
    // todo : to도 써야함
    Account sender = accounts.stream()
        .filter( account -> account.identifier().equals(from))
        .findFirst().get();

    Account receiver = accounts.stream()
        .filter( account -> account.identifier().equals(to))
        .findFirst().get();

    sender.transfer(receiver, amount);
  }
}
