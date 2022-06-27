package utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PageGeneratorTest {
  @Test
  void navigation() {
    PageGenerator pageGenerator = new PageGenerator() {
      @Override
      public String content() {
        return "";
      }
    };

    assertTrue(pageGenerator.navigation().contains("<a href=\"/\">Home</a>"));
    assertTrue(pageGenerator.navigation().contains("<a href=\"Account\">잔액 조회</a>"));
    assertTrue(pageGenerator.navigation().contains("<a href=\"Transfer\">송금하기</a>"));
  }

}
