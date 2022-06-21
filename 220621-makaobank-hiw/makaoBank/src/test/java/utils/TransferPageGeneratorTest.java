package utils;

import models.Account;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TransferPageGeneratorTest {
  @Test
  void html() {
    Account account = new Account("352-0528", "Inu", 500000);

    PageGenerator pageGenerator = new TransferPageGenerator(account);

    assertTrue(pageGenerator.html().contains("잔액: 500000"),
        "html 문자열에 잔액을 나타내는 내용이 없거나 잘못되었습니다.\n"
            + "(html 내용)\n"
            + pageGenerator.html() + "\n"
    );
    assertTrue(pageGenerator.html().contains("보낼 계좌: <input type"),
        "html 문자열에 보낼 계좌 입력 텍스트 칸이 없거나 잘못되었습니다.\n"
            + "(html 내용)\n"
            + pageGenerator.html() + "\n"
    );
    assertTrue(pageGenerator.html().contains("보낼 금액: <input type"),
        "html 문자열에 보낼 금액 입력 텍스트 칸이 없거나 잘못되었습니다.\n"
            + "(html 내용)\n"
            + pageGenerator.html() + "\n"
    );
    assertTrue(pageGenerator.html().contains("<button type"),
        "html 문자열에 송금 버튼 칸이 없거나 잘못되었습니다.\n"
            + "(html 내용)\n"
            + pageGenerator.html() + "\n"
    );
  }
}
