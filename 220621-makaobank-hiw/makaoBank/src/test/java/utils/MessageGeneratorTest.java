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
  void textForSomebody() {
    MessageGenerator testMessageGenerator = new MessageGenerator("Reinhardt");

    assertEquals("Hello, Reinhardt!", testMessageGenerator.text());
  }
}