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
}