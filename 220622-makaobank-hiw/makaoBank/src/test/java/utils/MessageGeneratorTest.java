package utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MessageGeneratorTest {

  @Test
  void defaultText() {
    MessageGenerator testMessageGenerator = new MessageGenerator();

    assertEquals("Hello, world!", testMessageGenerator.text());
  }

  @Test
  void emptyText() {
    MessageGenerator testMessageGenerator = new MessageGenerator("");

    assertEquals("Hello, world!", testMessageGenerator.text());
  }

  @Test
  void blankText() {
    MessageGenerator testMessageGenerator = new MessageGenerator("    ");

    assertEquals("Hello, world!", testMessageGenerator.text());
  }

  @Test
  void textForSomebody() {
    MessageGenerator testMessageGenerator = new MessageGenerator("Chikorita");

    assertEquals("Hello, Chikorita!", testMessageGenerator.text());
  }
}
