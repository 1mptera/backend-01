package services;

import models.Account;
import org.junit.jupiter.api.Test;
import repositories.AccountRepository;

import static org.junit.jupiter.api.Assertions.*;

class TransferServiceTest {
  @Test
  void transfer() {
    AccountRepository accountRepository = new AccountRepository();

    Account sender = accountRepository.find("1234");
    Account receiver = accountRepository.find("2345");

    TransferService transferService = new TransferService(accountRepository);

    long oldSenderAmount = sender.amount();
    long oldReceiverAmount = receiver.amount();

    transferService.transfer("1234", "2345", 500);

    long newReceiverAmount = receiver.amount();
    long newSenderAmount = sender.amount();

    assertEquals(500, oldSenderAmount - newSenderAmount);
    assertEquals(500, newReceiverAmount - oldReceiverAmount);
  }
}