
import org.junit.jupiter.api.Assertions;
        import org.junit.jupiter.api.Test;

class DecimalTest {
    DecimalTest() {
    }

    @Test
    void oneFalse() {
        Decimal decimal = new Decimal();
        Assertions.assertEquals(false, decimal.isPrime(1));
    }

    @Test
    void twoTrue() {
        Decimal decimal = new Decimal();
        Assertions.assertEquals(true, decimal.isPrime(2));
    }

    @Test
    void fourFalse() {
        Decimal decimal = new Decimal();
        Assertions.assertEquals(false, decimal.isPrime(4));
    }

    @Test
    void decimalCheck() {
        Decimal decimal = new Decimal();
        Assertions.assertEquals(false, decimal.isPrime(200));
    }

    @Test
    void decimalCheck2() {
        Decimal decimal = new Decimal();
        Assertions.assertEquals(true, decimal.isPrime(7741));
    }
}
