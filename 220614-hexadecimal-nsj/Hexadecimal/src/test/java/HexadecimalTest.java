import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HexadecimalTest {
  private Hexadecimal hexadecimal;

  @Test
  void compute() {
    hexadecimal = new Hexadecimal();

    assertEquals("0", hexadecimal.compute(0));
    assertEquals("C", hexadecimal.compute(12));
    assertEquals("A", hexadecimal.compute(10));
    assertEquals("80", hexadecimal.compute(128));
    assertEquals("396", hexadecimal.compute(918));
    assertEquals("404", hexadecimal.compute(1028));
    assertEquals("131D", hexadecimal.compute(4893));
    assertEquals("4B54", hexadecimal.compute(19284));
    assertEquals("2CDC4", hexadecimal.compute(183748));
  }
}

