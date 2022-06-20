package utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MessageGeneratorTest {

  @Test
  void defaultMessage() {
    MessageGenerator testMessageGenerator = new MessageGenerator();

    assertEquals("Hello, world!", testMessageGenerator.text());
  }

  @Test
  void emptyMessage() {
    MessageGenerator testMessageGenerator = new MessageGenerator("   ");

    assertEquals("Hello, world!", testMessageGenerator.text());
  }

  @Test
  void MessageForSomebody() {
    MessageGenerator testMessageGenerator = new MessageGenerator("Pikachu");

    assertEquals("Hello, Pikachu!", testMessageGenerator.text());
  }
}
