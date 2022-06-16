import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HexadecimalTest {

  @Test
  void testProgramRun() {
    Hexadecimal hexadecimal = new Hexadecimal();
    assertEquals("0", hexadecimal.compute(0));
  }

  @Test
  void inputSingleDigit() {
    Hexadecimal hexadecimal = new Hexadecimal();
    assertEquals("1", hexadecimal.compute(1));
    assertEquals("5", hexadecimal.compute(5));
    assertEquals("9", hexadecimal.compute(9));
  }
}