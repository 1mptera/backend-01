import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void simpleTest() {
        Calculator calculator = new Calculator();
        assertEquals(0, calculator.compute("0 + 0"));
        assertEquals(1, calculator.compute("1 + 0"));
    }

    @Test
    void plusTest() {
        Calculator calculator = new Calculator();
        assertEquals(3, calculator.compute("2 + 1"));
        assertEquals(4, calculator.compute("2 + 2"));
    }

    @Test
    void minusTest() {
        Calculator calculator = new Calculator();
        assertEquals(3, calculator.compute("5 - 2"));
        assertEquals(4, calculator.compute("5 - 1"));

    }

    @Test
    void timesTest() {
        Calculator calculator = new Calculator();
        assertEquals(3, calculator.compute("1 * 3"));
        assertEquals(4, calculator.compute("1 * 4"));

    }
    @Test
    void divideTest() {
        Calculator calculator = new Calculator();
        assertEquals(3, calculator.compute("9 / 3"));
        assertEquals(4, calculator.compute("16 / 4"));

    }
}