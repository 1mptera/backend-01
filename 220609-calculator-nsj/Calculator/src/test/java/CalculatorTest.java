import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @Test
    void compute() {
        Calculator calculator = new Calculator();

        assertEquals(1 ,calculator.compute("1 + 0"));
        assertEquals(7 ,calculator.compute("5 + 2"));
    }
}

