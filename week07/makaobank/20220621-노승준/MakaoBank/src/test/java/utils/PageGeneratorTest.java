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
    String html = pageGenerator.html();
    assertTrue(html.contains("홈"));
    assertTrue(html.contains("잔액 조회"));
    assertTrue(html.contains("송금"));
  }

}