package utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TransferSuccessPageGeneratorTest {

  @Test
  void content() {
    PageGenerator pageGenerator = new TransferSuccessPageGenerator();

    assertTrue(pageGenerator.content().contains("계좌이체 성공!"),
        "content에 계좌이체 성공 안내 없음\n" +
            "content 내용: {\n" + pageGenerator.content() + "\n}\n");
  }
}
