import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuinaryNumberTest {

    @Test
    void process() {
        QuinaryNumber quinaryNumber = new QuinaryNumber();

        assertEquals("1022" ,quinaryNumber.process(137));
        assertEquals("221340" ,quinaryNumber.process(7720));
        assertEquals("223444444" ,quinaryNumber.process(999999));
    }
}

