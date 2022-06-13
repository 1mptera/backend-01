import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomaNumberTest {
  @Test
  void conversion() {
    RomaNumber romaNumber = new RomaNumber();

    assertEquals(1, romaNumber.process("I"));
    assertEquals(50, romaNumber.process("L"));

  }
}
