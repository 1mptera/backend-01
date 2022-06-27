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

    assertTrue(html.contains("<a href=\"/\">홈으로</a>"), "홈으로 문제");
    assertTrue(html.contains("<a href=\"/account\">잔액조회</a>"), "잔액조회 문제");
    assertTrue(html.contains("<a href=\"/transfer\">송금하기</a>"), "송금하기 문제");
  }

}