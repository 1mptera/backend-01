package services;

import models.Account;

public class TransferService {
  public void transfer(Account sender, Account receiver, long amountTransferred) {
    sender.transfer(receiver, amountTransferred);
  }
}
