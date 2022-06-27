package utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreetingPageGeneratorTest {

  @Test
  void creation() {
    PageGenerator pageGenerator = new GreetingPageGenerator();

    String html = pageGenerator.html();

    assertTrue(html.contains("Hello , world")) ;

  }
  @Test
  void testToYou() {
    PageGenerator pageGenerator = new GreetingPageGenerator("sunghwan");

    String html = pageGenerator.html();

    assertTrue(html.contains("Hello , sunghwan"));

  }
  @Test
  void testBlank() {
    PageGenerator pageGenerator = new GreetingPageGenerator("     ");

    String html = pageGenerator.html();

    assertTrue(html.contains("Hello , world"));

  }
  @Test
  void testBlank2() {
    PageGenerator pageGenerator = new GreetingPageGenerator("");

    String html = pageGenerator.html();

    assertTrue(html.contains("Hello , world"));

  }
}