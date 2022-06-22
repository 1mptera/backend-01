package utils;

import models.Account;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountPageGeneratorTest {

  @Test
  void html() {
    Account testAccount = new Account("352-0528", "Chikorita", 1000000);

    PageGenerator testPageGenerator = new AccountPageGenerator(testAccount);

    assertTrue(
        testPageGenerator.html().contains("계좌번호: 352-0528"),
        "html String에 계좌번호 안내가 없거나 Test Case와 다릅니다.\n"
            + "html 내용: \n"
            + testPageGenerator.html()
    );

    assertTrue(
        testPageGenerator.html().contains("이름: Chikorita"),
        "html String에 이름 안내가 없거나 Test Case와 다릅니다.\n"
            + "html 내용: \n"
            + testPageGenerator.html()
    );

    assertTrue(
        testPageGenerator.html().contains("잔액: 1000000원"),
        "html String에 잔액 안내가 없거나 Test Case와 다릅니다.\n"
            + "html 내용: \n"
            + testPageGenerator.html()
    );
  }
}
