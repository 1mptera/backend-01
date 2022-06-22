package utils;

import models.Account;

public class TransferSuccessPageGenerator extends PageGenerator {
  private Account account;
  public TransferSuccessPageGenerator(Account account) {
    super();

    this.account = account;
  }

  @Override
  protected String content() {
    return "<p>계좌 이체 성공!</p>";
  }
}