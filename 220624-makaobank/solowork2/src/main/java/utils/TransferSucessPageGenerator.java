package utils;

import models.Account;

public class TransferSucessPageGenerator extends PageGenerator {
  private final Account account;

  public TransferSucessPageGenerator(Account account) {
    super();
    this.account = account;
  }

  @Override
  public String content() {
    return "계좌 이체 성공";
  }
}
