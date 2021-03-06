package utils;

import models.Account;

public class AccountPageGenerator extends PageGenerator {
  private final Account account;

  public AccountPageGenerator(Account account) {
    this.account = account;
  }


  @Override
  public String content() {
    return "<p>계좌번호: " + account.identifier() + "</p>" +
        "<p>이름: " + account.name() + "</p>" +
        "<p>잔액: " + account.amount() + "</p>" ;

  }
}
