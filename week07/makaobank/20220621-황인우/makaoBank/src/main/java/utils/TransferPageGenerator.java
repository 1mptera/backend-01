package utils;

import models.Account;

public class TransferPageGenerator extends PageGenerator {
  private final Account account;

  public TransferPageGenerator(Account account) {
    super();

    this.account = account;
  }

  public String content() {
    return "  <form method=\"POST\">"
        + "    <p>잔액: " + account.amount() + "</p>\n"
        + "    <p>보낼 계좌: <input type=\"text\" name=\"to\" /></p>\n"
        + "    <p>보낼 금액: <input type=\"number\" name=\"amount\" /></p>\n"
        + "    <button type=\"submit\">송금</button>\n"
        + "  </form>";
  }
}
