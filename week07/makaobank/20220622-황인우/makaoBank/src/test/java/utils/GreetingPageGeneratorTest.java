package utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreetingPageGeneratorTest {

  @Test
  void defaultText() {
    PageGenerator pageGenerator = new GreetingPageGenerator();

    assertTrue(
        pageGenerator.html().contains("Hello, world!"),
        "html String에 인사 메세지가 없거나 Test Case와 다릅니다.\n"
            + "html 내용: \n"
            + pageGenerator.html()
    );
  }

  @Test
  void emptyText() {
    PageGenerator pageGenerator = new GreetingPageGenerator("");

    assertTrue(
        pageGenerator.html().contains("Hello, world!"),
        "html String에 인사 메세지가 없거나 Test Case와 다릅니다.\n"
            + "html 내용: \n"
            + pageGenerator.html()
    );
  }

  @Test
  void blankText() {
    PageGenerator pageGenerator = new GreetingPageGenerator("    ");

    assertTrue(
        pageGenerator.html().contains("Hello, world!"),
        "html String에 인사 메세지가 없거나 Test Case와 다릅니다.\n"
            + "html 내용: \n"
            + pageGenerator.html()
    );
  }

  @Test
  void textForSomebody() {
    PageGenerator pageGenerator = new GreetingPageGenerator("Chikorita");

    assertTrue(
        pageGenerator.html().contains("Hello, Chikorita!"),
        "html String에 인사 메세지가 없거나 Test Case와 다릅니다.\n"
            + "html 내용: \n"
            + pageGenerator.html()
    );
  }
}
