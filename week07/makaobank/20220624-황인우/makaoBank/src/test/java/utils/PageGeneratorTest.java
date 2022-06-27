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
        pageGenerator.navigation().contains("홈으로"),
        "navigation에 홈으로 링크 내용 없음\n" +
            "navigation 내용: {\n" + pageGenerator.navigation() + "\n}\n");

    assertTrue(
        pageGenerator.navigation().contains("잔액 조회"),
        "navigation에 잔액 조회 링크 내용 없음\n" +
            "navigation 내용: {\n" + pageGenerator.navigation() + "\n}\n");

    assertTrue(
        pageGenerator.navigation().contains("송금하기"),
        "navigation에 송금하기 링크 내용 없음\n" +
            "navigation 내용: {\n" + pageGenerator.navigation() + "\n}\n");

    assertTrue(
        pageGenerator.navigation().contains("거래내역 조회"),
        "navigation에 거래내역 조회 링크 내용 없음\n" +
            "navigation 내용: {\n" + pageGenerator.navigation() + "\n}\n");
  }
}
