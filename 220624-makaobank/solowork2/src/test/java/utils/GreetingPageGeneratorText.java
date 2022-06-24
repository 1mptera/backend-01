package utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreetingPageGeneratorText {
  @Test
  void helloWorld() {
    PageGenerator pageGenerator = new GreetingPageGenerator();

    assertEquals("Hello,world", pageGenerator.content());
  }

  @Test
  void helloToYou() {
    PageGenerator pageGenerator = new GreetingPageGenerator("sunghwan");

    assertEquals("Hello,sunghwan", pageGenerator.content());

  }
  @Test
  void helloBlank() {
    PageGenerator pageGenerator = new GreetingPageGenerator("");

    assertEquals("Hello,world", pageGenerator.content());

  }
  @Test
  void helloManyBlank() {
    PageGenerator pageGenerator = new GreetingPageGenerator("        ");

    assertEquals("Hello,world", pageGenerator.content());

  }
}