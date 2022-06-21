package utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PageGeneratorTest {

  @Test
  void navigation() {
    PageGenerator testPageGenerator = new PageGenerator() {
      @Override
      public String content() {
        return "";
      }
    };

    assertTrue(testPageGenerator.navigation().contains("홈으로"),
        "navigation 문자열에 홈으로 링크가 없거나 잘못되었습니다.\n"
            + "(navigation 내용)\n"
            + testPageGenerator.navigation() + "\n"
    );
    assertTrue(testPageGenerator.navigation().contains("잔액 조회"),
        "navigation 문자열에 잔액 조회 링크가 없거나 잘못되었습니다.\n"
            + "(navigation 내용)\n"
            + testPageGenerator.navigation() + "\n"
    );
    assertTrue(testPageGenerator.navigation().contains("송금"),
        "navigation 문자열에 송금 링크가 없거나 잘못되었습니다.\n"
            + "(navigation 내용)\n"
            + testPageGenerator.navigation() + "\n"
    );
  }
}
