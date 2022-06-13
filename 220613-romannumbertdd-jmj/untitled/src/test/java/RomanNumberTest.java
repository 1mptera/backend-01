import org.junit.jupiter.api.Test;

import javax.annotation.processing.AbstractProcessor;

import static org.junit.jupiter.api.Assertions.*;

class RomanNumberTest {
  @Test
  void returnArabicNumber() {
    RomanNumber romanNumber = new RomanNumber();
    assertEquals(1, romanNumber.process("I"));
    assertEquals(5, romanNumber.process("V"));
  }
}
