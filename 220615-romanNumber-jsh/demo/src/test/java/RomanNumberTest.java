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

  @Test
  void character2over() {
    RomanNumber romanNumber = new RomanNumber();

    assertEquals(2, romanNumber.convert("II"));
    assertEquals(10, romanNumber.convert("VV"));
    assertEquals(20, romanNumber.convert("XX"));
    assertEquals(100, romanNumber.convert("LL"));
    assertEquals(200, romanNumber.convert("CC"));
    assertEquals(1000, romanNumber.convert("DD"));
    assertEquals(2000, romanNumber.convert("MM"));
  }
}