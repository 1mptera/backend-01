import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

  @Test
  void zeroTest() {
    Calculator testApplication = new Calculator();

    assertEquals(0, testApplication.process("0 + 0"));
  }

  @Test
  void firstNumberTest() {
    Calculator testApplication = new Calculator();

    assertEquals(3, testApplication.process("3 + 0"));
    assertEquals(7, testApplication.process("7 + 0"));
    assertEquals(12, testApplication.process("12 + 0"));
  }

  @Test
  void numbersTest() {
    Calculator testApplication = new Calculator();

    assertEquals(8, testApplication.process("3 + 5"));
    assertEquals(10, testApplication.process("7 + 3"));
    assertEquals(40, testApplication.process("12 + 28"));
  }

  @Test
  void plusTest() {
    Calculator testApplication = new Calculator();

    assertEquals(10, testApplication.process("6 + 4"));
    assertEquals(27, testApplication.process("15 + 12"));
    assertEquals(111111110, testApplication.process("11111119 + 99999991"));
  }

  @Test
  void minusTest() {
    Calculator testApplication = new Calculator();

    assertEquals(-2, testApplication.process("3 - 5"));
    assertEquals(4, testApplication.process("7 - 3"));
    assertEquals(-16, testApplication.process("12 - 28"));
  }
}
