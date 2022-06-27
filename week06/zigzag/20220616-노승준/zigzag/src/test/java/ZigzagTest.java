import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ZigzagTest {

  @Test
  void firstPattern() {
   Zigzag zigzag = new Zigzag();

    assertEquals("HEL", zigzag.process("HEL", 3));
    assertEquals("ABC", zigzag.process("ABC", 3));
    assertEquals("ABCD", zigzag.process("ABCD", 4));
    assertEquals("AEBDFC", zigzag.process("ABCDEF", 3));
    assertEquals("MPAIGEATRIHRNGESI", zigzag.process("MEGAPTERAISHIRING", 3));

  }
}

