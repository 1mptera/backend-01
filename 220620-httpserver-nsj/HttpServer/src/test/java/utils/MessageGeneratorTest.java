package utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MessageGeneratorTest {
  @Test
  void defaultTest() {
    MessageGenerator messageGenerator = new MessageGenerator();

    assertEquals("Hello, World!", messageGenerator.text());
  }

  @Test
  void WithTest() {
    MessageGenerator messageGenerator = new MessageGenerator("Ashal");

    assertEquals("Hello, Ashal!", messageGenerator.text());
  }
}