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
    return  "<p>잔액: "+ account.amount()+ "원</p>" +
        "<form method=\"POST\">" +
        "<p> 보낼계좌: <input type=\"text\" name=\"to\"></p>" +
        "<p> 보낼금액: <input type=\"number\" name=\"amount\"></p>" +
        "<button type=\"submit\">확인</button>" +
        "</form>";
  }
}
