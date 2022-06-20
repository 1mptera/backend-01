import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimeNumberTest {

    @Test
    void inputNumber1() {
        PrimeNumber primeNumber = new PrimeNumber();
        assertEquals("소수 아님", primeNumber.processInputNumber(1));
    }

    @Test
    void inputNotPrimeNumberExcept1() {
        PrimeNumber primeNumber = new PrimeNumber();
        assertEquals("소수", primeNumber.processInputNumber(2));
    }
}
