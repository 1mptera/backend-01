import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MessageProviderTest {

    @Test
    void message() {
        MessageProvider messageProvider = new MessageProvider("Seungjun");
        assertEquals("Hello, world!", messageProvider.message());
    }
}