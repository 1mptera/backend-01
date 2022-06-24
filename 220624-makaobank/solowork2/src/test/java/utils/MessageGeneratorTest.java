package utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MessageGeneratorTest {
  @Test
  void helloWorld() {
    MessageGenerator messageGenerator = new MessageGenerator();

    assertEquals("Hello,world", messageGenerator.text());
  }

  @Test
  void helloToYou() {
    MessageGenerator messageGenerator = new MessageGenerator("sunghwan");

    assertEquals("Hello,sunghwan", messageGenerator.text());

  }
  @Test
  void helloBlank() {
    MessageGenerator messageGenerator = new MessageGenerator("");

    assertEquals("Hello,world", messageGenerator.text());

  }
  @Test
  void helloManyBlank() {
    MessageGenerator messageGenerator = new MessageGenerator("        ");

    assertEquals("Hello,world", messageGenerator.text());

  }
}