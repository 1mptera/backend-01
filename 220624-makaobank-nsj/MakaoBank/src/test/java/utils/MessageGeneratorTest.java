package utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MessageGeneratorTest {
  @Test
  void defaultText() {
    MessageGenerator messageGenerator = new MessageGenerator();

    assertEquals("Hello, world!", messageGenerator.text());
  }

  @Test
  void textWithName() {
    MessageGenerator messageGenerator = new MessageGenerator("ashal");

    assertEquals("Hello, ashal!", messageGenerator.text());
  }

  @Test
  void textWithEmpty() {
    MessageGenerator messageGenerator = new MessageGenerator("");

    assertEquals("Hello, world!", messageGenerator.text());
  }

  @Test
  void textWithBlank() {
    MessageGenerator messageGenerator = new MessageGenerator("  ");

    assertEquals("Hello, world!", messageGenerator.text());
  }
}