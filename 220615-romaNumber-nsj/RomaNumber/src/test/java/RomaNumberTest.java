import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomaNumberTest {
  @Test
  void eachArabiaNumber() {
    RomaNumber romaNumber = new RomaNumber();

    assertEquals(1, romaNumber.process("I"));
    assertEquals(5, romaNumber.process("V"));
    assertEquals(10, romaNumber.process("X"));
    assertEquals(50, romaNumber.process("L"));
    assertEquals(100, romaNumber.process("C"));
    assertEquals(500, romaNumber.process("D"));
    assertEquals(1000, romaNumber.process("M"));

  }
}

