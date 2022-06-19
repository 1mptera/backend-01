import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @Test
    void plus() {
        Calculator calculator = new Calculator();

        assertEquals(7, calculator.compute("4 + 3"));
    }

    @Test
    void minus() {
        Calculator calculator = new Calculator();

        assertEquals(1, calculator.compute("4 - 3"));
    }

    @Test
    void times() {
        Calculator calculator = new Calculator();

        assertEquals(12, calculator.compute("4 * 3"));
    }

    @Test
    void divide() {
        Calculator calculator = new Calculator();

        assertEquals(1, calculator.compute("4 / 3"));
    }
}