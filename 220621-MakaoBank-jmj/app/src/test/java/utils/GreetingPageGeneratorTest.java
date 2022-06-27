package utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class GreetingPageGeneratorTest {

  @Test
  void defaultName() {
    PageGenerator pageGenerator = new GreetingPageGenerator();

    assertTrue(pageGenerator.html().contains("Hello, world!"));
  }

  @Test
  void inputNameAshal() {
    PageGenerator pageGenerator = new GreetingPageGenerator("Ashal");

    assertTrue(pageGenerator.html().contains("Hello, Ashal!"));
  }

  @Test
  void emptyName() {
    PageGenerator pageGenerator = new GreetingPageGenerator("");

    assertTrue(pageGenerator.html().contains("Hello, world!"));
  }

  @Test
  void blankName() {
    PageGenerator pageGenerator = new GreetingPageGenerator("   ");

    assertTrue(pageGenerator.html().contains("Hello, world!"));
  }
}
