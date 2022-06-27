import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @Test
    void plus() {
        Calculator calculator = new Calculator();

        assertEquals(1, calculator.compute("1 + 0"));
        assertEquals(6, calculator.compute("2 + 4"));
    }
    @Test
    void minus() {
        Calculator calculator = new Calculator();

        assertEquals(3, calculator.compute("10 - 7"));
        assertEquals(3, calculator.compute("5 - 2"));
    }
    @Test
    void times() {
        Calculator calculator = new Calculator();

        assertEquals(15, calculator.compute("3 * 5"));
        assertEquals(8, calculator.compute("2 * 4"));
    }
    @Test
    void divide() {
        Calculator calculator = new Calculator();

        assertEquals(2, calculator.compute("5 / 2"));
        assertEquals(1, calculator.compute("10 / 10"));
    }
}

