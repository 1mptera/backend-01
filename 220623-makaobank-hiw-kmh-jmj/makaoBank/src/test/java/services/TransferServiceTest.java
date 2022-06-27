package services;

import models.Account;
import org.junit.jupiter.api.Test;
import repository.AccountRepository;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TransferServiceTest {

  @Test
  void simpleTest() {
    AccountRepository accountRepository = new AccountRepository();

    Account sender = accountRepository.find("1234");
    Account receiver = accountRepository.find("2345");

    TransferService transferService = new TransferService(accountRepository);

    long oldSenderAmount = sender.amount();

    transferService.transfer("1234", "2345" , 1000);

    long newSenderAmount = sender.amount();
    long newReceiverAmount = receiver.amount();

    assertEquals(1000, oldSenderAmount - newSenderAmount); //송금을 하면 송금 금액만큼 계좌의 금액이 빠져나가야함
    assertEquals(2000, newReceiverAmount); //송금을 받은 계좌에 송금금액 만큼 금액이 추가
  }
}
