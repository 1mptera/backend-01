package utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreetingPageGeneratorTest {
  @Test
  void defaultText() {
    PageGenerator pageGenerator = new GreetingPageGenerator();

    String html = pageGenerator.html();
    assertTrue(html.contains("Hello, world!"));
  }

  @Test
  void textWithName() {
    PageGenerator pageGenerator = new GreetingPageGenerator("ashal");
    String html = pageGenerator.html();

    assertTrue(html.contains("Hello, ashal!"));
  }

  @Test
  void textWithEmptyName() {
    PageGenerator pageGenerator = new GreetingPageGenerator("");

    String html = pageGenerator.html();
    assertTrue(html.contains("Hello, world!"));
  }

  @Test
  void textWithBlankName() {
    PageGenerator pageGenerator = new GreetingPageGenerator("   ");

    String html = pageGenerator.html();
    assertTrue(html.contains("Hello, world!"));
  }
}
