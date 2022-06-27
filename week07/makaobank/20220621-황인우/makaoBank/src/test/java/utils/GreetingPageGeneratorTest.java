package utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class GreetingPageGeneratorTest {

  @Test
  void defaultText() {
    PageGenerator testPageGenerator = new GreetingPageGenerator();

    assertTrue(testPageGenerator.html().contains("Hello, world!"));
  }

  @Test
  void emptyText() {
    PageGenerator testPageGenerator = new GreetingPageGenerator("");

    assertTrue(testPageGenerator.html().contains("Hello, world!"));
  }

  @Test
  void blankText() {
    PageGenerator testPageGenerator = new GreetingPageGenerator("    ");

    assertTrue(testPageGenerator.html().contains("Hello, world!"));
  }

  @Test
  void textForSomebody() {
    PageGenerator testPageGenerator = new GreetingPageGenerator("Reinhardt");

    assertTrue(testPageGenerator.html().contains("Hello, Reinhardt!"));
  }
}
