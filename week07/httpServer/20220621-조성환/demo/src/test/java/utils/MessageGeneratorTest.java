package utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MessageGeneratorTest {
  @Test
  void defaultTest() {
    MessageGenerator messageGenerator = new MessageGenerator();

    assertEquals("Hello, world!" , messageGenerator.text());
  }
  @Test
  void hellosunghwan() {
    MessageGenerator messageGenerator = new MessageGenerator("sunghwan");

    assertEquals("Hello, sunghwan!" , messageGenerator.text());
  }
  @Test
  void TestIsBlank() {
    MessageGenerator messageGenerator = new MessageGenerator("    ");

    assertEquals("Hello, world!" , messageGenerator.text());
  }

}