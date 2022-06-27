package repository;

import models.Account;

import java.util.ArrayList;
import java.util.List;

public class AccountRepository {
  private List<Account> accounts = new ArrayList<>();

  public AccountRepository() {
    List.of(
        new Account("1234", "Ashal", 3000),
        new Account("2345", "JOKER", 1000)
    ).stream().forEach(account -> {
      accounts.add(account);
    });
  }

  public Account find(String identifier) {
    return accounts.stream()
        .filter(account -> account.identifier().equals(identifier))
        .findFirst()
        .orElse(null);
  }
}
