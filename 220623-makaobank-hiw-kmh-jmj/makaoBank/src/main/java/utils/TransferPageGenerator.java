package utils;

import models.Account;
import utils.PageGenerator;

public class TransferPageGenerator extends PageGenerator {
  private Account account;

  public TransferPageGenerator(Account account) {
    super();


    this.account = account;
  }


  @Override
  public String content() {
    return "<form method=\"POST\">" +
        "<p> 잔액: " + account.amount() + "원</p>\n" +
        "<p> 보낼계좌: <input type=\"text\" name=\"to\" /><p>\n" +
        "<p> 보낼금액: <input type=\"number\" name=\"amount\" /><p>\n" +
        "<p><button type=\"submit\">check</button></p>\n" +
        "</form>\n";


  }
}
