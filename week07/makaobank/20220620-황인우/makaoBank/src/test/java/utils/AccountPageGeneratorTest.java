package utils;

import models.Account;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class AccountPageGeneratorTest {
  @Test
  void content() {
    Account account = new Account("352-0528-2645-53", "Inu", 100000);

    AccountPageGenerator testAccountPageGenerator = new AccountPageGenerator(account);

    assertTrue(testAccountPageGenerator.html()
        .contains("계좌번호: 352-0528-2645-53"),
        "출력 html 문자열에 계좌번호에 대한 내용이 없습니다.\n" + testAccountPageGenerator.html());
    assertTrue(testAccountPageGenerator.html()
            .contains("예금주명: Inu"),
        "출력 html 문자열에 예금주명에 대한 내용이 없습니다.\n" + testAccountPageGenerator.html());
    assertTrue(testAccountPageGenerator.html()
            .contains("잔액: 100000원"),
        "출력 html 문자열에 잔액에 대한 내용이 없습니다.\n" + testAccountPageGenerator.html());
  }
}
