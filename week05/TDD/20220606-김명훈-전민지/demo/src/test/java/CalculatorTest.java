import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class CalculatorTest {
    @Test
        void simpleTest() {
        Calculator calculator = new Calculator();
        assertEquals(0, calculator.compute("0 + 0"));
        assertEquals(1, calculator.compute("1 + 0"));
        assertEquals(2, calculator.compute("2 + 0"));
    }

    @Test
    void plus() {
        Calculator calculator = new Calculator();
        assertEquals(2, calculator.compute("1 + 1"));
    }

    @Test
    void minus() {
        Calculator calculator = new Calculator();
        assertEquals(2, calculator.compute("3 - 1"));
    }
}