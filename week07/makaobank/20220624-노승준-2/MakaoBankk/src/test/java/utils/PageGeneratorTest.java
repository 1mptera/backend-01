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
    String html = pageGenerator.navigation();

    assertTrue(html.contains("<a href=\"/\">홈"));
    assertTrue(html.contains("<a href=\"/account\">잔액조회"));
    assertTrue(html.contains("<a href=\"/transfer\">송금"));
    assertTrue(html.contains("<a href=\"/transactions\">거래 내역"));
  }

}