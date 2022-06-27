package utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreetingPageGeneratorTest {
  @Test
  void message() {
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
  void inputEmptyName() {
    PageGenerator pageGenerator = new GreetingPageGenerator("");
    String html = pageGenerator.html();
    assertTrue(html.contains("Hello, world!"));
  }

  @Test
  void inputBlankName() {
    PageGenerator pageGenerator = new GreetingPageGenerator("  ");
    String html = pageGenerator.html();
    assertTrue(html.contains("Hello, world!"));
  }
}
