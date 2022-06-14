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
  void test10over() {
    HexaDecimal hexaDecimal = new HexaDecimal();

    assertEquals("A", hexaDecimal.computeHexa(10));
    assertEquals("C", hexaDecimal.computeHexa(12));
    assertEquals("F", hexaDecimal.computeHexa(15));
  }




}