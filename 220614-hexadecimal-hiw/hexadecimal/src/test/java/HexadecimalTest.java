import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HexadecimalTest {

  @Test
  void processTestZero() {
    Hexadecimal testApplication = new Hexadecimal();

    String hexadecimal = testApplication.process(0);

    assertEquals("0", hexadecimal);
  }
}
