package utils;

import models.Account;

public class TransferSuccessPageGenerator extends PageGenerator {
  public TransferSuccessPageGenerator(Account account) {
    super();
  }

  @Override
  public String content() {
    return "<p> 계좌 이체 성공 </p>";
  }
}
