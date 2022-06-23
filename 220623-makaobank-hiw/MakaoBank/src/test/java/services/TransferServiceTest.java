package services;

import models.Account;
import org.junit.jupiter.api.Test;
import utils.FormParser;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TransferServiceTest {

  @Test
  void transfer() {
    List<Account> accounts = List.of(
        new Account("352-0528", "Chikorita", 100000),
        new Account("179-20", "Eevee", 50000)
    );
    Account sender = accounts.get(0);
    Account receiver = accounts.get(1);

    TransferService transferService = new TransferService();

    FormParser formParser = new FormParser();

    Map<String, String> formData = formParser.parse("to=179-20&amount=1000");

    transferService.transfer(accounts, sender.identifier(), formData);

    assertEquals(99000, sender.amount());
    assertEquals(51000, receiver.amount());
  }
}