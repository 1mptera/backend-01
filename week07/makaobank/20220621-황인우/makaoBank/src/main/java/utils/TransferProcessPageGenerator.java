package utils;

import models.Account;

public class TransferProcessPageGenerator extends PageGenerator {
  private final Account account;

  public TransferProcessPageGenerator(Account account) {
    super();

    this.account = account;
  }

  public String content() {
    return "";
  }
}
