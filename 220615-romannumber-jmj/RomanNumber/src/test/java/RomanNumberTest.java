import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanNumberTest {
  @Test
  void workingTest() {
    RomanNumber romanNumber = new RomanNumber();
    assertEquals(0,romanNumber.compute("0"));
  }
}
