import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanNumeralsTest {

  @Test
  void convertOneDigit() {
    RomanNumerals testApplication = new RomanNumerals();

    assertEquals(1, testApplication.process("I"));
    assertEquals(5, testApplication.process("V"));
    assertEquals(10, testApplication.process("X"));
    assertEquals(50, testApplication.process("L"));
    assertEquals(100, testApplication.process("C"));
    assertEquals(500, testApplication.process("D"));
    assertEquals(1000, testApplication.process("M"));
  }

  @Test
  void convertTwoDigitsEqualOrGreater() {
    RomanNumerals testApplication = new RomanNumerals();

    assertEquals(2, testApplication.process("II"));
    assertEquals(6, testApplication.process("VI"));
    assertEquals(15, testApplication.process("XV"));
    assertEquals(20, testApplication.process("XX"));
    assertEquals(505, testApplication.process("DV"));
    assertEquals(1001, testApplication.process("MI"));
  }
}