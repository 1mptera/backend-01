import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ZigZagTest {
  @Test
  void firstLine() {
    ZigZag zigZag = new ZigZag();

    assertEquals("HOAR",zigZag.process("HELLOMEGAPTERA"));
  }

  @Test
  void secondLine() {
    ZigZag zigZag = new ZigZag();

    assertEquals("ELMGPEA",zigZag.process("HELLOMEGAPTERA"));
  }

  @Test
  void thirdLine() {
    ZigZag zigZag = new ZigZag();

    assertEquals("LET",zigZag.process("HELLOMEGAPTERA"));
  }

  @Test
  void zigZag() {
    ZigZag zigZag = new ZigZag();

    assertEquals("HOARELMGPEALET",zigZag.process("HELLOMEGAPTERA"));
  }
}