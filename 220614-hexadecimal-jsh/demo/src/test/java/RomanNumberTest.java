import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanNumberTest {

  @Test
  void simpleTest() {
    RomanNumber romanNumber = new RomanNumber();

    assertEquals(1, romanNumber.convert("I"));
    assertEquals(50, romanNumber.convert("L"));
  }
  @Test
  void over2CharactersTest() {
    RomanNumber romanNumber = new RomanNumber();

    assertEquals(60, romanNumber.convert("LX"));
    assertEquals(150, romanNumber.convert("CL"));
  }

}