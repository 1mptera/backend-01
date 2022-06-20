import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomaNumberTest {
  private RomaNumber romaNumber;

  @Test
  void eachArabiaNumber() {
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
  void sumArabiaNumber() {
    romaNumber = new RomaNumber();

    assertEquals(60, romaNumber.process("LX"));
    assertEquals(601, romaNumber.process("DCI"));
  }

  @Test
  void finalArbiaNumber() {
    romaNumber = new RomaNumber();

    assertEquals(190, romaNumber.process("CXC"));
    assertEquals(1954, romaNumber.process("MCMLIV"));
    assertEquals(246, romaNumber.process("CCXLVI"));

  }

  @Test
  void exceptRomaNumber() {
    romaNumber = new RomaNumber();

    assertEquals(0, romaNumber.process("A"));
    assertEquals(0, romaNumber.process("B"));
    assertEquals(0, romaNumber.process("E"));
  }
}

