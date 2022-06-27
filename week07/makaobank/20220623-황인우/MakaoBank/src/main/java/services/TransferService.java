package services;

import models.Account;

import java.util.List;
import java.util.Map;

public class TransferService {

  public void transfer(List<Account> accounts, String identifier,
                       Map<String, String> formData) {
    Account sender = accounts.stream()
        .filter(account -> account.identifier().equals(identifier))
        .findFirst().get();

    String receiverIdentifier = formData.get("to");

    Account receiver = accounts.stream()
        .filter(account -> account.identifier().equals(receiverIdentifier))
        .findFirst().get();

    long amount = Long.parseLong(formData.get("amount"));

    sender.transfer(receiver, amount);
  }
}
