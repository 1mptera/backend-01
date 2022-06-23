package services;

import models.Account;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TransferServiceTest {

  @Test
  void simpleTest() {
    List<Account> accounts = List.of(
        new Account("2345", "JOKER", 1000) ,
        new Account("1234", "Ashal", 3000)
    );

    Account sender = accounts.get(1);
    Account receiver = accounts.get(0);

    TransferService transferService = new TransferService(accounts);

    long oldsenderAmount = sender.amount();
    long oldReceiverAmount = receiver.amount();

    transferService.transfer("1234", "2345" , 1000);

    long newsenderAmount = sender.amount();
    long newReceiverAmount = receiver.amount();


    assertEquals(1000, oldsenderAmount - newsenderAmount); //송금을 하면 송금 금액만큼 계좌의 금액이 빠져나가야함
    assertEquals(2000, newReceiverAmount ); //송금을 받은 계좌에 송금금액 만큼 금액이 추가

  }
}
