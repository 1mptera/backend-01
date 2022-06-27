package services;

import models.Account;
import repository.AccountRepository;

public class TransferService {
  private final AccountRepository accountRepository;

  public TransferService(AccountRepository accountRepository) {
    this.accountRepository = accountRepository;
  }

  public boolean transfer(String from, String to, long amount) {
    if (amount <= 0) {
      return false;
    }

    Account sender = accountRepository.find(from);

    Account receiver = accountRepository.find(to);

    sender.transfer(receiver, amount);

    return true;
  }
}
