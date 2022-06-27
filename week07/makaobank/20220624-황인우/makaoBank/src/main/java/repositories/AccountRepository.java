package repositories;

import models.Account;

import java.util.List;

public class AccountRepository {
  private final List<Account> accountList;

  public AccountRepository() {
    accountList = List.of(
        new Account("352", "Chikorita", 50000),
        new Account("179", "Eevee", 1000),
        new Account("110", "Pikachu", 3000)
    );
  }

  public Account find(String identifier) {
    return accountList.stream()
        .filter(account -> account.identifier().equals(identifier))
        .findFirst()
        .orElse(null);
  }
}
