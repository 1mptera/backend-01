import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
  Calculator calculator = new Calculator();

  @Test
  void simpleTest() {
    assertEquals(1, calculator.compute("0 + 1"));
    assertEquals(2, calculator.compute("0 + 2"));
  }
  @Test
  void minus() {
    assertEquals(1, calculator.compute("2 - 1"));
    assertEquals(2, calculator.compute("4 - 2"));
  }
  @Test
  void times() {
    assertEquals(1, calculator.compute("1 * 1"));
    assertEquals(2, calculator.compute("2 * 1"));
  }
  @Test
  void divide() {
    assertEquals(1, calculator.compute("2 / 2"));
    assertEquals(2, calculator.compute("4 / 2"));
  }
}