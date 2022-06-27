package utils;

import models.Account;

public class TransferPageGenerator extends PageGenerator {
  private final Account account;

  public TransferPageGenerator(Account account) {
    super();

    this.account = account;
  }

  @Override
  public String content() {
    return "<p>잔액: " + account.amount() + "</p>\n" +
        "<p>보낼 계좌번호: <input type=\"text\" name=\"to\" /></p>\n" +
        "<p>보낼 금액: <input type=\"number\" /></p>\n" +
        "<button type=\"submit\">송금</button>\n";
  }
}
