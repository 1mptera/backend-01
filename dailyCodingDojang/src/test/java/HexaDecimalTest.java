import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HexaDecimalTest {
  @Test
  void simpleTest() {
    HexaDecimal hexaDecimal = new HexaDecimal();

    assertEquals("0", hexaDecimal.compute(0));
    assertEquals("4", hexaDecimal.compute(4));
    assertEquals("6", hexaDecimal.compute(6));
    assertEquals("9", hexaDecimal.compute(9));
  }

  @Test
  void under16Test() {
    HexaDecimal hexaDecimal = new HexaDecimal();

    assertEquals("0", hexaDecimal.compute(0));
    assertEquals("4", hexaDecimal.compute(4));
    assertEquals("A", hexaDecimal.compute(10));
    assertEquals("F", hexaDecimal.compute(15));

  }

}