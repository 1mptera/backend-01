import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

  @Test
  void zeroTest() {
    Calculator testApplication = new Calculator();

    assertEquals(0, testApplication.process("0 + 0"));
  }
}