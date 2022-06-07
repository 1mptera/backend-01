import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @Test
    void plus() {
        Calculator calculator = new Calculator();
        assertEquals(2, calculator.compute("1 + 1"));
        assertEquals(3, calculator.compute("2 + 1"));
    }

    @Test
    void minus() {
        Calculator calculator = new Calculator();
        assertEquals(0, calculator.compute("1 - 1"));
        assertEquals(1, calculator.compute("2 - 1"));
    }

    @Test
    void times() {
        Calculator calculator = new Calculator();
        assertEquals(8, calculator.compute("4 * 2"));
        assertEquals(18, calculator.compute("2 * 9"));
    }

    @Test
    void divide() {
        Calculator calculator = new Calculator();
        assertEquals(4, calculator.compute("9 / 2"));
        assertEquals(2, calculator.compute("10 / 5"));
    }

    @Test
    void otherSymbol() {
        Calculator calculator = new Calculator();
        assertEquals(0, calculator.compute("3 # 2"));
        assertEquals(0, calculator.compute("0 & 5"));
    }
}