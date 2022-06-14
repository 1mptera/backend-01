import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HexadecimalTest {
  @Test
  void inputOnlyOneNumber() {
    Hexadecimal hexadecimal = new Hexadecimal();
    assertEquals("0", hexadecimal.compute(0));
  }
}
