import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MessageProviderTest {
    @Test
    void message() {
        MessageProvider messageProvider = new MessageProvider("Ashal");
        assertEquals("Hello, Ashal!", messageProvider.message());
    }

    @Test
    void defaultMessage() {
        MessageProvider messageProvider = new MessageProvider();
        assertEquals("Hello, World!", messageProvider.message());
    }
}
