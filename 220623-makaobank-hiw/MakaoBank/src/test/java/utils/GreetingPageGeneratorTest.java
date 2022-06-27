package utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreetingPageGeneratorTest {
  @Test
  void defaultText() {
    PageGenerator pageGenerator = new GreetingPageGenerator();

    assertTrue(
        pageGenerator.html().contains("Hello, world!"),
        "html String 변수에 인사 메세지가 없거나 Test case와 다릅니다.\n" +
            "(html 내용: " + pageGenerator.html() + ")\n"
    );
  }

  @Test
  void emptyText() {
    PageGenerator pageGenerator = new GreetingPageGenerator("");

    assertTrue(
        pageGenerator.html().contains("Hello, world!"),
        "html String 변수에 인사 메세지가 없거나 Test case와 다릅니다.\n" +
            "(html 내용: " + pageGenerator.html() + ")\n"
    );
  }

  @Test
  void blankText() {
    PageGenerator pageGenerator = new GreetingPageGenerator("    ");

    assertTrue(
        pageGenerator.html().contains("Hello, world!"),
        "html String 변수에 인사 메세지가 없거나 Test case와 다릅니다.\n" +
            "(html 내용: " + pageGenerator.html() + ")\n"
    );
  }

  @Test
  void textForSomebody() {
    PageGenerator pageGenerator = new GreetingPageGenerator("Chikorita");

    assertTrue(
        pageGenerator.html().contains("Hello, Chikorita!"),
        "html String 변수에 인사 메세지가 없거나 Test case와 다릅니다.\n" +
            "(html 내용: " + pageGenerator.html() + ")\n"
    );
  }
}
