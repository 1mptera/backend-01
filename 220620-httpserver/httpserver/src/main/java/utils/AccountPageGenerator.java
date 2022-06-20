package utils;

import models.Account;

public class AccountPageGenerator extends PageGenerator{

  private Account account;
  private String name;

  public AccountPageGenerator(Account account) {

    this.account = account;

  }

  @Override
  public String html() {
    return "계좌번호 " + this.account.identifer() +
        "이름 " + this.name;
  }
}
