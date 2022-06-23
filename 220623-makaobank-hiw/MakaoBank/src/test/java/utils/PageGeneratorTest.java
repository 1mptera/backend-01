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

    assertTrue(
        pageGenerator.html().contains("홈으로"),
        "html String 변수에 홈으로 가기 링크 메세지가 없거나 Test case와 다릅니다.\n" +
            "(html 내용: " + pageGenerator.html() + ")\n"
    );

    assertTrue(
        pageGenerator.html().contains("잔액 조회하기"),
        "html String 변수에 잔액 조회하기 링크 메세지가 없거나 Test case와 다릅니다.\n" +
            "(html 내용: " + pageGenerator.html() + ")\n"
    );

    assertTrue(
        pageGenerator.html().contains("송금하기"),
        "html String 변수에 송금하기 링크 메세지가 없거나 Test case와 다릅니다.\n" +
            "(html 내용: " + pageGenerator.html() + ")\n"
    );
  }
}