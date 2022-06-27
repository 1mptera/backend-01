package utils;

import models.Account;

import java.util.stream.Collectors;

public class TransactionPageGenerator extends PageGenerator {
  private final Account account;

  public TransactionPageGenerator(Account account) {
    super();

    this.account = account;
  }

  @Override
  public String content() {
    return
        "    <h1>" + account.name() + " 거래 내역</h1>\n" +
            "    <ul>\n" + account.transactions().stream()
            .map(eachTransaction ->
                "      <li>" + eachTransaction.command() + ": "
                    + eachTransaction.amount() + "원 "
                    + eachTransaction.target().name() + "</li>\n")
            .collect(Collectors.joining()) +
            "    </ul>\n";
  }
}
