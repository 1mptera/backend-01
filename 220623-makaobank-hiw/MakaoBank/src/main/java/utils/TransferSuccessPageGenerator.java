package utils;

import models.Account;

public class TransferSuccessPageGenerator extends PageGenerator {
  private final Account account;

  public TransferSuccessPageGenerator(Account account) {
    super();

    this.account = account;
  }

  @Override
  public String content() {
    return "    <p>계좌이체 성공!!</p>\n";
  }
}
