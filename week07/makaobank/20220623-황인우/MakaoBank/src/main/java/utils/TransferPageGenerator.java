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
    return
        "    <form method=\"POST\">\n" +
            "      <p>잔액: " + account.amount() + "원</p>\n" +
            "      <p>송금할 계좌: <input type=\"text\" name=\"to\" /></p>\n" +
            "      <p>송금할 금액: <input type=\"number\" name=\"amount\" /></p>\n" +
            "      <button type=\"submit\">송금하기</button>\n" +
            "    </form>";
  }
}
