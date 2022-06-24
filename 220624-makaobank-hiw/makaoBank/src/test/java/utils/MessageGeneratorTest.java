package utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreetingPageGeneratorTest {
  @Test
  void defaultText() {
    PageGenerator pageGenerator = new GreetingPageGenerator();

    assertTrue(pageGenerator.html().contains("Hello, world!"));
  }

  @Test
  void emptyText() {
    PageGenerator pageGenerator = new GreetingPageGenerator("");

    assertTrue(pageGenerator.html().contains("Hello, world!"));
  }

  @Test
  void blankText() {
    PageGenerator pageGenerator = new GreetingPageGenerator("   ");

    assertTrue(pageGenerator.html().contains("Hello, world!"));
  }

  @Test
  void textForSomebody() {
    PageGenerator pageGenerator = new GreetingPageGenerator("Chikorita");

    assertTrue(pageGenerator.html().contains("Hello, Chikorita!"));
  }
}