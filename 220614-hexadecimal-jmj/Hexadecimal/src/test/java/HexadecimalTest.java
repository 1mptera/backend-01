import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HexadecimalTest {
  @Test
  void inputNumberUnder10() {
    Hexadecimal hexadecimal = new Hexadecimal();
    assertEquals("0", hexadecimal.compute(0));
    assertEquals("5", hexadecimal.compute(5));
    assertEquals("9", hexadecimal.compute(9));
  }

  @Test
  void inputNumberUnder100() {
    Hexadecimal hexadecimal = new Hexadecimal();
    assertEquals("C", hexadecimal.compute(12));
    assertEquals("A", hexadecimal.compute(10));
//    assertEquals("5C", hexadecimal.compute(92));
  }
}
