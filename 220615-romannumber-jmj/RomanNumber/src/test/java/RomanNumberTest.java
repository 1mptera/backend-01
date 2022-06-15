import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanNumberTest {
  @Test
  void workingTest() {
    RomanNumber romanNumber = new RomanNumber();
    assertEquals(0, romanNumber.compute("0"));
  }

  @Test
  void singleNumber() {
    RomanNumber romanNumber = new RomanNumber();
    assertEquals(1, romanNumber.compute("I"));
    assertEquals(5, romanNumber.compute("V"));
    assertEquals(10, romanNumber.compute("X"));
  }

  @Test
  void doubleDigitNumber() {
    RomanNumber romanNumber = new RomanNumber();
    assertEquals(2, romanNumber.compute("II"));
    assertEquals(6, romanNumber.compute("VI"));
    assertEquals(60, romanNumber.compute("LX"));
  }
}
