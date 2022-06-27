package utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class GreetingPageGeneratorTest {

  @Test
  void defaultMessage() {
    PageGenerator testPageGenerator = new GreetingPageGenerator();

    assertTrue(testPageGenerator.html().contains("Hello, world!"));
  }

  @Test
  void emptyMessage() {
    PageGenerator testPageGenerator = new GreetingPageGenerator("");

    assertTrue(testPageGenerator.html().contains("Hello, world!"));
  }

  @Test
  void blankMessage() {
    PageGenerator testPageGenerator = new GreetingPageGenerator("   ");

    assertTrue(testPageGenerator.html().contains("Hello, world!"));
  }

  @Test
  void MessageForSomebody() {
    PageGenerator testPageGenerator = new GreetingPageGenerator("Chikorita");

    assertTrue(testPageGenerator.html().contains("Hello, Chikorita!"));
  }
}
