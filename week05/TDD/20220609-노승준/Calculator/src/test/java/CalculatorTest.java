import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @Test
    void plusCompute() {
        Calculator calculator = new Calculator();

        assertEquals(1 ,calculator.compute("1 + 0"));
        assertEquals(7 ,calculator.compute("5 + 2"));
    }

    @Test
    void minusCompute() {
        Calculator calculator = new Calculator();

        assertEquals(1 ,calculator.compute("1 - 0"));
        assertEquals(3 ,calculator.compute("5 - 2"));
    }

    @Test
    void timesCompute() {
        Calculator calculator = new Calculator();

        assertEquals(3 ,calculator.compute("1 * 3"));
        assertEquals(10 ,calculator.compute("5 * 2"));
    }

    @Test
    void divideCompute() {
        Calculator calculator = new Calculator();

        assertEquals(2 ,calculator.compute("4 / 2"));
        assertEquals(3 ,calculator.compute("10 / 3"));
    }
}

