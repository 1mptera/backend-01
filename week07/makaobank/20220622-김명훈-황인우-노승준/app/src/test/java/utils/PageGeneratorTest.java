package utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PageGeneratorTest {
  @Test
  void navigation() {
    PageGenerator pageGenerator = new PageGenerator() {
      @Override
      protected String content() {
        return "";
      }
    };
    String html = pageGenerator.html();

    assertTrue(html.contains("홈으로"), "홈으로 링크 문제 있음" + html);
  }

}