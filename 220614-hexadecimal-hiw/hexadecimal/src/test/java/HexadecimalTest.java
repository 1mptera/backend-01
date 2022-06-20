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

  @Test
  void processTestMoreThanTwoDigits() {
    Hexadecimal testApplication = new Hexadecimal();

    String hexadecimal1 = testApplication.process(128);
    assertEquals("80", hexadecimal1);

    String hexadecimal2 = testApplication.process(918);
    assertEquals("396", hexadecimal2);
  }

  @Test
  void processTestAllTestCases() {
    Hexadecimal testApplication = new Hexadecimal();

    int[] testCases = new int[]{1028, 4893, 19284, 183748};
    String[] answers = new String[]{"404", "131D", "4B54", "2CDC4"};

    for (int i = 0; i < testCases.length; i += 1) {
      assertEquals(answers[i], testApplication.process(testCases[i]));
    }
  }
}
