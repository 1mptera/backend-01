package utils;

import models.Account;

public class TransferPageGenerator extends PageGenerator {
  private Account account;

  public TransferPageGenerator(Account account) {
    super();

    this.account = account;
  }


// abstract -> pageGenerator   -> accou, transfer, greeting

  @Override
  public String content() {
    return "<p> 잔액 : " + account.amount() + "원</p>\n" +
        "<form method=\"POST\">" +
        "<p> 보낼계좌: <input type=\"text\" name=\"to\" /><p>\n" +
        "<p> 보낼금액: <input type=\"number\" name=\"amount\" /><p>\n" +
        "<p><button type=\"submit\">check</button></p>\n" +
        "</form>";
  }
}