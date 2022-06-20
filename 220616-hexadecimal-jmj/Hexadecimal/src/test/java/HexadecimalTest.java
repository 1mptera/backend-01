import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HexadecimalTest {

  @Test
  void testProgramRun() {
    Hexadecimal hexadecimal = new Hexadecimal();
//    assertEquals("0", hexadecimal.compute(0));
  }

  @Test
  void inputSingleDigit() {
    Hexadecimal hexadecimal = new Hexadecimal();
    assertEquals("1", hexadecimal.compute(1));
    assertEquals("5", hexadecimal.compute(5));
    assertEquals("9", hexadecimal.compute(9));
  }

  @Test
  void betweenTenToFifteen() {
    Hexadecimal hexadecimal = new Hexadecimal();
    assertEquals("F", hexadecimal.compute(15));
    assertEquals("A", hexadecimal.compute(10));
    assertEquals("C", hexadecimal.compute(12));
  }

  @Test
  void inputDoubleDigits() {
    Hexadecimal hexadecimal = new Hexadecimal();
    assertEquals("1E", hexadecimal.compute(30));
    assertEquals("3A", hexadecimal.compute(58));
    assertEquals("5B", hexadecimal.compute(91));
  }

  @Test
  void inputDigitsInExamples() {
    Hexadecimal hexadecimal = new Hexadecimal();
    assertEquals("131D", hexadecimal.compute(4893));
    assertEquals("4B54", hexadecimal.compute(19284));
    assertEquals("2CDC4", hexadecimal.compute(183748));
  }
}