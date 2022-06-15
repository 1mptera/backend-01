import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanNumberTest {
  @Test
  void simpleTest() {
    RomanNumber romanNumber = new RomanNumber();

    assertEquals(1, romanNumber.convert("I"));
    assertEquals(5, romanNumber.convert("V"));
    assertEquals(10, romanNumber.convert("X"));
    assertEquals(50, romanNumber.convert("L"));
    assertEquals(100, romanNumber.convert("C"));
    assertEquals(500, romanNumber.convert("D"));
    assertEquals(1000, romanNumber.convert("M"));
  }

}