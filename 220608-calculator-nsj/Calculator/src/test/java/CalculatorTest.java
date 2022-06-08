import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @Test
    void plus() {
        Calculator calculator = new Calculator();

        assertEquals(1, calculator.compute("1 + 0"));
        assertEquals(6, calculator.compute("2 + 4"));
    }
}

