package utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PageGeneratorTest {
  @Test
  void navigation() {
    PageGenerator pageGenerator = new PageGenerator() {
      @Override
      public String content() {
        return null;
      }
    };
    String html = pageGenerator.html();

    assertTrue(html.contains("<a href=\"/\""), "홈 문제 있음" + html);
    assertTrue(html.contains("<a href=\"/account\""), "게좌 문제 있음" + html);
    assertTrue(html.contains("<a href=\"/transfer\""), "송금 문제 있음" + html);
  }
}