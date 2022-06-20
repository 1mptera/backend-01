import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomaNumberTest {
  private RomaNumber romaNumber;

  @Test
  void oneConversion() {
    romaNumber = new RomaNumber();

    assertEquals(1, romaNumber.process("I"));
    assertEquals(5, romaNumber.process("V"));
    assertEquals(10, romaNumber.process("X"));
    assertEquals(50, romaNumber.process("L"));
    assertEquals(100, romaNumber.process("C"));
    assertEquals(500, romaNumber.process("D"));
    assertEquals(1000, romaNumber.process("M"));
  }

  @Test
  void twoConversion() {
    romaNumber = new RomaNumber();

    assertEquals(4, romaNumber.process("IV"));
    assertEquals(7, romaNumber.process("VII"));
    assertEquals(60, romaNumber.process("LX"));
  }

  @Test
  void totalConversion() {
    romaNumber = new RomaNumber();

    assertEquals(190, romaNumber.process("CXC"));
    assertEquals(1954, romaNumber.process("MCMLIV"));
  }
}
