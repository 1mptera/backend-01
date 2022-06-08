import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MessageProviderTest {
    @Test
    void simpleTest() {
        MessageProvider messageProvider = new MessageProvider();
        assertEquals("Hello, world!", messageProvider.message());
    }
}
