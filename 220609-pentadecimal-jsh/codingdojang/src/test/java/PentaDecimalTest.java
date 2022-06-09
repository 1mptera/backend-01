import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PentaDecimalTest {

    @Test
    void simpleTest() {
        PentaDecimal pentaDecimal = new PentaDecimal();

        assertEquals(0, pentaDecimal.processPentaDecimal(0) );
    }
    @Test
    void remainder() {
        PentaDecimal pentaDecimal = new PentaDecimal();

        assertEquals("1022", pentaDecimal.processPentaDecimal(137) );
    }

}