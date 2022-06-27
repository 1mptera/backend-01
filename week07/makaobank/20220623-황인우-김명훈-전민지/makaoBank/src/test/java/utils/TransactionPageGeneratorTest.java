package utils;

import models.Account;
import org.junit.jupiter.api.Test;
import repository.AccountRepository;

import static org.junit.jupiter.api.Assertions.*;

class TransactionPageGeneratorTest {

  @Test
  void header() {
    AccountRepository accountRepository = new AccountRepository();
    Account account = accountRepository.find("1234");
    PageGenerator pageGenerator = new TransactionPageGenerator(account);

    String content = pageGenerator.content();

    assertTrue(content.contains("거래 내역"), "페이지 제목 문제\n" + content);
  }

  @Test
  void content() {
    AccountRepository accountRepository = new AccountRepository();

    Account sender = accountRepository.find("1234");
    Account receiver = accountRepository.find("2345");

    sender.transfer(receiver, 500);
    receiver.transfer(sender, 100);

    PageGenerator pageGenerator = new TransactionPageGenerator(sender);

    String content = pageGenerator.content();

    assertTrue(content.contains("거래 내역"), "페이지 제목 문제\n" + content);
    assertTrue(content.contains("송금: JOKER 500원"), "송금 내역 문제" + content);
    assertTrue(content.contains("입금: JOKER 100원"), "입금 내역 문제" + content);
  }
}