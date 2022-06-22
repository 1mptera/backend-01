package utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class GreetingPageGeneratorTest {
  @Test
  void creation() {
    PageGenerator pageGenerator = new GreetingPageGenerator();
    String html = pageGenerator.html();
    assertTrue(html.contains("Hello, world!"));
  }

  @Test
  void nameWithAshal() {
    PageGenerator pageGenerator = new GreetingPageGenerator("Ashal");
    String html = pageGenerator.html();
    assertTrue(html.contains("Hello, Ashal!"));
  }

  @Test
  void nameWithEmpty() {
    PageGenerator pageGenerator = new GreetingPageGenerator("");
    String html = pageGenerator.html();
    assertTrue(html.contains("Hello, world!"));
  }

  @Test
  void nameWithBlank() {
    PageGenerator pageGenerator = new GreetingPageGenerator("    ");
    String html = pageGenerator.html();
    assertTrue(html.contains("Hello, world!"));
  }
}
