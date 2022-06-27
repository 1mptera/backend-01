package utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class GreetingPageGeneratorTest {

  @Test
  void defaultMessage() {
    PageGenerator pageGenerator = new GreetingPageGenerator();

    assertTrue(pageGenerator.html().contains("Hello, world!"));
  }

  @Test
  void nameWithAshal() {
    PageGenerator pageGenerator = new GreetingPageGenerator("Ashal");

    assertTrue(pageGenerator.html().contains("Hello, Ashal!"));
  }

  @Test
  void nameWithBlank() {
    PageGenerator pageGenerator = new GreetingPageGenerator("    ");

    assertTrue(pageGenerator.html().contains("Hello, world!"));
  }

  @Test
  void nameWithEmpty() {
    PageGenerator pageGenerator = new GreetingPageGenerator("");

    assertTrue(pageGenerator.html().contains("Hello, world!"));
  }
}