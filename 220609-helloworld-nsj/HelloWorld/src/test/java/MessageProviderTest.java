import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MessageProviderTest {

    @Test
    void defalutMessage() {
        MessageProvider messageProvider = new MessageProvider();

        assertEquals("Hello, World!", messageProvider.message());
    }

    @Test
    void messageToYou() {
        MessageProvider messageProvider = new MessageProvider("seungjun");

        assertEquals("Hello, seungjun!", messageProvider.message());
    }
}

