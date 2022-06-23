package repository;

import models.Account;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountRepositoryTest {
  @Test
  void find1() {
    AccountRepository accountRepository = new AccountRepository();
    Account account = accountRepository.find("1234");

    assertEquals("1234", account.identifier());
    assertEquals("Ashal", account.name());
    assertEquals(3000, account.amount());
  }

  @Test
  void notFound() {
    AccountRepository accountRepository = new AccountRepository();
    Account account = accountRepository.find("8888");

    assertNull(account);
  }
}
