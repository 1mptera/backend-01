import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @Test
    void oneNumberTest() {
        Calculator calculator = new Calculator();
        assertEquals(1, calculator.process("1 + 0"));
    }

    @Test
    void twoNumbersTest() {
        Calculator calculator = new Calculator();
        assertEquals(3, calculator.process("1 + 2"));
    }

    @Test
    void plusTest() {
        Calculator calculator = new Calculator();
        assertEquals(15, calculator.process("10 + 5"));
    }

    @Test
    void minusTest() {
        Calculator calculator = new Calculator();
        assertEquals(6, calculator.process("12 - 6"));
    }

    @Test
    void timesTest() {
        Calculator calculator = new Calculator();
        assertEquals(63, calculator.process("9 * 7"));
    }

    @Test
    void dividesTest() {
        Calculator calculator = new Calculator();
        assertEquals(9, calculator.process("81 / 9"));
    }
}
