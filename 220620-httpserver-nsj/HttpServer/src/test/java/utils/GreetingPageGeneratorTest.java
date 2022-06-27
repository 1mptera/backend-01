package utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GreetingPageGeneratorTest {
  @Test
  void defaultTest() {
    PageGenerator PageGenerator = new GreetingPageGenerator();

    assertEquals("Hello, World!", PageGenerator.html());
  }

  @Test
  void WithTest() {
    PageGenerator PageGenerator = new GreetingPageGenerator("Ashal");

    assertEquals("Hello, Ashal!", PageGenerator.html());
  }
}