import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HexadecimalTest {
  @Test
  void decimalNuberUnder16() {
    Hexadecimal hexadecimal = new Hexadecimal();

    assertEquals("0",hexadecimal.compute(0));
    assertEquals("1",hexadecimal.compute(1));
    assertEquals("F",hexadecimal.compute(15));
  }

}