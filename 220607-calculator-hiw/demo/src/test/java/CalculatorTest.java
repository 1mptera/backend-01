import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @Test
    void plusTest() {
        Calculator calculator = new Calculator();
        assertEquals(7, calculator.process("5 + 2"));
        assertEquals(20, calculator.process("-4 + 24"));
    }

    @Test
    void minusTest() {
        Calculator calculator = new Calculator();
        assertEquals(2, calculator.process("6 - 4"));
        assertEquals(-26, calculator.process("3 - 29"));

    }

    @Test
    void timesTest() {
        Calculator calculator = new Calculator();
        assertEquals(10, calculator.process("5 * 2"));
        assertEquals(-96, calculator.process("-4 * 24"));
    }

    @Test
    void dividesTest() {
        Calculator calculator = new Calculator();
        assertEquals(2, calculator.process("6 / 3"));
        assertEquals(-10, calculator.process("-30 / 3"));

    }
}