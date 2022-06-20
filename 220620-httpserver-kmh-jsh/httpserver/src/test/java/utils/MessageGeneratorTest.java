package utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MessageGeneratorTest {
    @Test
    void defaultText() {
      MessageGenerator messageGenerator = new MessageGenerator();

      assertEquals("Hello, World!", messageGenerator.text());
    }
}