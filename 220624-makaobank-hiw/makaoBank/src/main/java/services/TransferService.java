package services;

import models.Account;
import repositories.AccountRepository;

import java.util.Map;

public class TransferService {
  private final AccountRepository accountRepository;

  public TransferService(AccountRepository accountRepository) {
    this.accountRepository = accountRepository;
  }

  public void transfer(String senderIdentifier, Map<String, String> formData) {
    Account sender = accountRepository.find(senderIdentifier);
    Account receiver = accountRepository.find(formData.get("to"));

    long amountTransferred = Long.parseLong(formData.get("amount"));

    sender.transfer(receiver, amountTransferred);
  }
}
