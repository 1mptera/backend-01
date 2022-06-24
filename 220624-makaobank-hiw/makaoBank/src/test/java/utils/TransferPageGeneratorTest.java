package utils;

import models.Account;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TransferPageGeneratorTest {

  @Test
  void content() {
    Account account = new Account("352", "Chikorita", 50000);

    PageGenerator pageGenerator = new TransferPageGenerator(account);

    assertTrue(
        pageGenerator.content().contains("잔액: 50000원"),
        "content에 잔액 안내 없음\n" +
            "content 내용: {\n" + pageGenerator.content() + "\n}\n");

    assertTrue(
        pageGenerator.content().contains("보낼 계좌번호: <input"),
        "content에 보낼 계좌번호 입력 칸 없음\n" +
            "content 내용: {\n" + pageGenerator.content() + "\n}\n");

    assertTrue(
        pageGenerator.content().contains("보낼 금액: <input"),
        "content에 보낼 금액 입력 칸 없음\n" +
            "content 내용: {\n" + pageGenerator.content() + "\n}\n");

    assertTrue(
        pageGenerator.content().contains("<button"),
        "content에 송금하기 버튼 없음\n" +
            "content 내용: {\n" + pageGenerator.content() + "\n}\n");
  }
}
