import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @Test
    void verySimpleTest() {
        Calculator calculator = new Calculator();
        assertEquals("1", calculator.compute("1 + 0"));
        assertEquals("19973", calculator.compute("19973 + 0"));
    }

    @Test
    void plusTest() {
        Calculator calculator = new Calculator();
        assertEquals("4", calculator.compute("1 + 3"));
        assertEquals("20000", calculator.compute("19973 + 27"));
    }

    @Test
    void minusTest() {
        Calculator calculator = new Calculator();
        assertEquals("0", calculator.compute("1 - 1"));
        assertEquals("5", calculator.compute("10 - 5"));
    }

    @Test
    void timesTest() {
        Calculator calculator = new Calculator();
        assertEquals("3", calculator.compute("1 * 3"));
        assertEquals("2700", calculator.compute("100 * 27"));
    }

    @Test
    void dividesTest() {
        Calculator calculator = new Calculator();
        assertEquals("10", calculator.compute("10 / 1"));
        assertEquals("2", calculator.compute("20000000 / 10000000"));
    }

    @Test
    void errorTest() {
        Calculator calculator = new Calculator();
        assertEquals("다시 입력해주세요.", calculator.compute("10 /"));
        assertEquals("다시 입력해주세요.", calculator.compute("+ 3"));
        assertEquals("다시 입력해주세요.", calculator.compute("+ -"));

    }
}