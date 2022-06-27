package utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GreetingPageGeneratorTest {

  @Test
  void defaultTest() {
    PageGenerator PageGenerator = new GreetingPageGenerator();

    assertEquals("Hello , world!", PageGenerator.html());
  }

  @Test
  void name() {
    PageGenerator PageGenerator = new GreetingPageGenerator("sunghwan");

    assertEquals("Hello , sunghwan!", PageGenerator.html());
  }
  @Test
  void nameIsBlank() {
    PageGenerator PageGenerator = new GreetingPageGenerator("     ");

    assertEquals("Hello , world!", PageGenerator.html());
  }



}