package utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MessageGeneratorTest {
    @Test
    void defaultText() {
      MessageGenerator messageGenerator = new MessageGenerator();

      assertEquals("Hello, World!", messageGenerator.text());
    }

    @Test
    void textWithAshal() {
      MessageGenerator messageGenerator = new MessageGenerator("Ashal");

      assertEquals("Hello, Ashal!", messageGenerator.text());
    }

    @Test
    void textWithJoker() {
      MessageGenerator messageGenerator = new MessageGenerator("Joker");

      assertEquals("Hello, Joker!", messageGenerator.text());
    }
  @Test
  void textWithEmpty() {
    MessageGenerator messageGenerator = new MessageGenerator("");

    assertEquals("Hello, World!", messageGenerator.text());
  }
  @Test
  void textWithBlank() {
    MessageGenerator messageGenerator = new MessageGenerator("    ");

    assertEquals("Hello, World!", messageGenerator.text());
  }
}