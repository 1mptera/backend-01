package utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MessageGeneratorTest {
  @Test
  void defalutText() {
    MessageGenerator messageGenerator = new MessageGenerator();

    assertEquals("Hello, world!", messageGenerator.text());
  }

  @Test
  void textWithName() {
    MessageGenerator messageGenerator = new MessageGenerator("Chikorita");

    assertEquals("Hello, Chikorita!", messageGenerator.text());
  }

  @Test
  void emptyText() {
    MessageGenerator messageGenerator = new MessageGenerator("");

    assertEquals("Hello, World!", messageGenerator.text());
  }

  @Test
  void blankText() {
    MessageGenerator messageGenerator = new MessageGenerator("   ");

    assertEquals("Hello, World!", messageGenerator.text());
  }
}
