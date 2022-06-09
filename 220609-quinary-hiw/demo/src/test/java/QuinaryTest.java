import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuinaryTest {
    @Test
    void zeroResultTest() {
        Quinary testApplication = new Quinary();

        assertEquals(0, testApplication.process(0));
    }

    @Test
    void makeOneQuinaryDightTest() {
        Quinary testApplication = new Quinary();

        assertEquals(3, testApplication.makeOneQuinaryDigit(3, 5));
        assertEquals(2, testApplication.makeOneQuinaryDigit(7, 5));
    }

    @Test
    void addQuinaryDigitTest() {
        Quinary testApplication = new Quinary();

        assertEquals(30, testApplication.addQuinaryDigit(1, 3));
        assertEquals(2000, testApplication.addQuinaryDigit(3, 2));
    }

    @Test
    void singleDigitResultTest() {
        Quinary testApplication = new Quinary();

        assertEquals(2, testApplication.process(2));
    }

    @Test
    void doubleDigitResultTest() {
        Quinary testApplication = new Quinary();

        assertEquals(10, testApplication.process(5));
    }

    @Test
    void codingDojangExampleTest() {
        Quinary testApplication = new Quinary();

        assertEquals(1022, testApplication.process(137));
        assertEquals(221340, testApplication.process(7720));
        assertEquals(223444444, testApplication.process(999999));
    }
}
