package utils;

import models.Account;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountPageGeneratorTest {
  @Test
  void html() {
    Account account = new Account("352-0528", "Inu", 500000);

    PageGenerator pageGenerator = new AccountPageGenerator(account);

    assertTrue(pageGenerator.html().contains("계좌번호: 352-0528"),
        "html 문자열에 계좌번호를 나타내는 내용이 없거나 잘못되었습니다.\n"
            + "(html 내용)\n"
            + pageGenerator.html() + "\n"
    );
    assertTrue(pageGenerator.html().contains("예금주명: Inu"),
        "html 문자열에 예금주명을 나타내는 내용이 없거나 잘못되었습니다.\n"
            + "(html 내용)\n"
            + pageGenerator.html() + "\n"
    );
    assertTrue(pageGenerator.html().contains("잔액: 500000원"),
        "html 문자열에 잔액을 나타내는 내용이 없거나 잘못되었습니다.\n"
            + "(html 내용)\n"
            + pageGenerator.html() + "\n"
    );
  }
}
