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
    assertEquals("5C", hexadecimal.compute(92));
  }

  @Test
  void inputNumberOver100() {
    Hexadecimal hexadecimal = new Hexadecimal();
    assertEquals("80", hexadecimal.compute(128));
    assertEquals("396", hexadecimal.compute(918));
    assertEquals("404", hexadecimal.compute(1028));
    assertEquals("131D", hexadecimal.compute(4893));
    assertEquals("4B54", hexadecimal.compute(19284));
    assertEquals("2CDC4", hexadecimal.compute(183748));
  }
}
