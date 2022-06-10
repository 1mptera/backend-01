import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ZigZagTest {
  @Test
  void firstLine() {
    ZigZag zigZag = new ZigZag();

    assertEquals("HOAR",zigZag.inputRowThree("HELLOMEGAPTERA"));
  }

  @Test
  void secondLine() {
    ZigZag zigZag = new ZigZag();

    assertEquals("ELMGPEA",zigZag.inputRowThree("HELLOMEGAPTERA"));
  }

  @Test
  void thirdLine() {
    ZigZag zigZag = new ZigZag();

    assertEquals("LET",zigZag.inputRowThree("HELLOMEGAPTERA"));
  }

  @Test
  void inputRowThree() {
    ZigZag zigZag = new ZigZag();

    assertEquals("HOARELMGPEALET",zigZag.inputRowThree("HELLOMEGAPTERA"));
  }

  @Test
  void inputRowFour() {
    ZigZag zigZag = new ZigZag();

    assertEquals("HEREMGEALOATLP",zigZag.inputRowFour("HELLOMEGAPTERA"));
  }
}