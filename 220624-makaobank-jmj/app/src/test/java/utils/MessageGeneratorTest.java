package utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MessageGeneratorTest {
  @Test
  void message() {
    MessageGenerator messageGenerator = new MessageGenerator();

    assertEquals("Hello, world!", messageGenerator.text());
  }

  @Test
  void nameWithAshal() {
    MessageGenerator messageGenerator = new MessageGenerator("Ashal");

    assertEquals("Hello, Ashal!", messageGenerator.text());
  }

  @Test
  void inputEmptyName() {
    MessageGenerator messageGenerator = new MessageGenerator("");

    assertEquals("Hello, world!", messageGenerator.text());
  }

  @Test
  void inputBlankName() {
    MessageGenerator messageGenerator = new MessageGenerator("  ");

    assertEquals("Hello, world!", messageGenerator.text());
  }

}