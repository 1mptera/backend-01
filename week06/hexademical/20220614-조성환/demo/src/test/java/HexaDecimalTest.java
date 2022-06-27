import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HexaDecimalTest {

  @Test
  void simpleTest() {
    HexaDecimal hexaDecimal = new HexaDecimal();

    assertEquals("0", hexaDecimal.computeHexa(0));
    assertEquals("1", hexaDecimal.computeHexa(1));
    assertEquals("2", hexaDecimal.computeHexa(2));
    assertEquals("3", hexaDecimal.computeHexa(3));
    assertEquals("9", hexaDecimal.computeHexa(9));
  }

  @Test
  void testOver10() {
    HexaDecimal hexaDecimal = new HexaDecimal();

    assertEquals("A", hexaDecimal.computeHexa(10));
    assertEquals("C", hexaDecimal.computeHexa(12));
    assertEquals("F", hexaDecimal.computeHexa(15));
  }

  @Test
  void testOver15() {
    HexaDecimal hexaDecimal = new HexaDecimal();

    assertEquals("10", hexaDecimal.computeHexa(16));
    assertEquals("11", hexaDecimal.computeHexa(17));
  }

  @Test
  void testOver100() {
    HexaDecimal hexaDecimal = new HexaDecimal();

    assertEquals("80", hexaDecimal.computeHexa(128));
    assertEquals("396", hexaDecimal.computeHexa(918));
  }
}