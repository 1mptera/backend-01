package utils;

import models.Account;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TransferSuccessPageGeneratorTest {

  @Test
  void successMessage() {
    Account account = new Account("352-0528", "Chikorita", 100000);
    PageGenerator pageGenerator = new TransferSuccessPageGenerator(account);

    assertTrue(
        pageGenerator.html().contains("계좌이체 성공!!"),
        "html String 변수에 계좌이체 성공 메세지가 없거나 Test case와 다릅니다.\n" +
            "(html 내용: " + pageGenerator.html() + ")\n"
    );
  }
}
