package services;

import models.Account;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TransferServiceTest {
  @Test
  void transfer() {


    List<Account> accounts = List.of(
        new Account("1234", "ashal", 3000),
        new Account("2345", "JOKER", 1000)
    );
    Account sender = accounts.get(0);
    Account receiver = accounts.get(1);

    TransferService transferService = new TransferService(accounts);

    long oldsenderAmount = sender.amount();
    long oldreceiverAmount = receiver.amount();

    transferService.transfer("1234" , "2345", 1000);

    long newsenderAmount = sender.amount();
    long newreceiverAmount = receiver.amount();

    assertEquals(2000, oldsenderAmount - oldreceiverAmount);
    assertEquals(0, newsenderAmount - newreceiverAmount);
  }
}