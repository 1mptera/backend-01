import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HexadecimalTest {

  @Test
  void processTestZero() {
    Hexadecimal testApplication = new Hexadecimal();

    String hexadecimal = testApplication.process(0);

    assertEquals("0", hexadecimal);
  }

  @Test
  void processTestOneHexadecimal() {
    Hexadecimal testApplication = new Hexadecimal();

    String hexadecimal1 = testApplication.process(12);
    assertEquals("C", hexadecimal1);

    String hexadecimal2 = testApplication.process(10);
    assertEquals("A", hexadecimal2);
  }
}
