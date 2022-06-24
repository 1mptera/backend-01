package utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreetingPageGeneratorText {
  @Test
  void helloWorld() {
    PageGenerator pageGenerator = new GreetingPageGenerator();

    assertEquals("Hello,world", pageGenerator.html());
  }

  @Test
  void helloToYou() {
    PageGenerator pageGenerator = new GreetingPageGenerator("sunghwan");

    assertEquals("Hello,sunghwan", pageGenerator.html());

  }
  @Test
  void helloBlank() {
    PageGenerator pageGenerator = new GreetingPageGenerator("");

    assertEquals("Hello,world", pageGenerator.html());

  }
  @Test
  void helloManyBlank() {
    PageGenerator pageGenerator = new GreetingPageGenerator("        ");

    assertEquals("Hello,world", pageGenerator.html());

  }
}