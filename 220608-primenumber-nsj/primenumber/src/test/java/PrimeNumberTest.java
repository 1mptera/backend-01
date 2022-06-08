import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimeNumberTest {
    @Test
    void process() {
        PrimeNumber primeNumber = new PrimeNumber();

        assertEquals("소수 아님", primeNumber.process(1));
        assertEquals("소수 아님", primeNumber.process(200));
        assertEquals("소수", primeNumber.process(17));
        assertEquals("소수", primeNumber.process(7741));
    }

}