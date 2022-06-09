import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PentanaryTest {
    @Test
    void inputNumberUnder5() {
        Pentanary pentanary = new Pentanary();
        assertEquals(4, pentanary.process(4));
        assertEquals(3, pentanary.process(3));
        assertEquals(0, pentanary.process(0));
    }
}
