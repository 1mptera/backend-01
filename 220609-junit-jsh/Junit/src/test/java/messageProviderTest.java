import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class messageProviderTest {
    @Test
    void defaultTest() {
        messageProvider messageProvider = new messageProvider();
        assertEquals("Hello, world", messageProvider.message());
    }

    @Test
    void HelloToYou() {
        messageProvider messageProvider = new messageProvider("sunghwan");
        assertEquals("Hello, sunghwan", messageProvider.message());
    }
}