import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @Test
    void plusTest() {
        Calculator calculator = new Calculator();
        assertEquals(0, calculator.compute("0 + 0"));
        assertEquals(1, calculator.compute("1 + 0"));
        assertEquals(6, calculator.compute("4 + 2"));
    }

    @Test
    void minusTest() {
        Calculator calculator = new Calculator();
        assertEquals(0, calculator.compute("0 - 0"));
        assertEquals(3, calculator.compute("5 - 2"));
        assertEquals(-5, calculator.compute("1 - 6"));
    }

    @Test
    void timesTest() {
        Calculator calculator = new Calculator();
        assertEquals(0, calculator.compute("0 * 0"));
        assertEquals(2, calculator.compute("1 * 2"));
        assertEquals(8, calculator.compute("1 * 8"));
    }

    @Test
    void divideTest() {
        Calculator calculator = new Calculator();
        assertEquals(3, calculator.compute("6 / 2"));
        assertEquals(4, calculator.compute("8 / 2"));
        assertEquals(5, calculator.compute("5 / 1"));
    }
}
