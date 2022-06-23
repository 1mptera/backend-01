package utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreetingPageGeneratorTest {
  @Test
  void creation() {
    PageGenerator pageGenerator = new GreetingPageGenerator();
    String html = pageGenerator.html();
    assertTrue(html.contains("Hello, world!"), "문구 문제");
  }

  @Test
  void nameWithAshal() {
    PageGenerator pageGenerator = new GreetingPageGenerator("Ashal");
    String html = pageGenerator.html();
    assertTrue(html.contains("Hello, Ashal!"), "문구 문제");
  }

  @Test
  void withEmptyName() {
    PageGenerator pageGenerator = new GreetingPageGenerator("");
    String html = pageGenerator.html();
    assertTrue(html.contains("Hello, world!"), "문구 문제");
  }

  @Test
  void withBlankName() {
    PageGenerator pageGenerator = new GreetingPageGenerator("  ");
    String html = pageGenerator.html();
    assertTrue(html.contains("Hello, world!"), "문구 문제");
  }
}
