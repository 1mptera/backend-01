import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HexadecimalTest {

  @Test
  void testProgramRun() {
    Hexadecimal hexadecimal = new Hexadecimal();
    assertEquals("", hexadecimal.compute(0));
  }
}