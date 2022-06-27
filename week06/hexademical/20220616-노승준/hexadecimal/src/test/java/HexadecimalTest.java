import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HexadecimalTest {
  private Hexadecimal hexadecimal;

  @Test
  void decimalNumberUnder16() {
    hexadecimal = new Hexadecimal();

    assertEquals("0",hexadecimal.compute(0));
    assertEquals("1",hexadecimal.compute(1));
    assertEquals("A",hexadecimal.compute(10));
    assertEquals("F",hexadecimal.compute(15));
  }

  @Test
  void decimalNumberOver16() {
    hexadecimal = new Hexadecimal();

    assertEquals("396", hexadecimal.compute(918));
    assertEquals("131D", hexadecimal.compute(4893));
    assertEquals("2CDC4", hexadecimal.compute(183748));
  }
}

