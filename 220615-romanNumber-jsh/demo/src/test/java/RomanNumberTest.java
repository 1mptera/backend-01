import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanNumberTest {
  @Test
  void simpleTest() {
    RomanNumber romanNumber = new RomanNumber();

    assertEquals(1, romanNumber.convert("I"));
  }

}