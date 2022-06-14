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

  }

}