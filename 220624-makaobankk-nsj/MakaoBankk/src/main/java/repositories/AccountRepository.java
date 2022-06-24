package repositories;

import models.Account;

import java.util.ArrayList;
import java.util.List;

public class AccountRepository {
  private final List<Account> accounts = new ArrayList<>();

  public AccountRepository() {
    List.of(new Account("1234", "ashal", 3000),
        new Account("2345", "joker", 1000))
        .stream()
        .forEach(account -> accounts.add(account));
  }

  public Account find(String identifier) {
    return accounts.stream()
        .filter(account -> account.identifier().equals(identifier)
        ).findFirst()
        .orElse(null);
  }
}
