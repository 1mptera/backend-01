import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MessageProviderTest {

    @Test
    void messageWithoutConstructorTest() {
        MessageProvider messageProvider = new MessageProvider();

        assertEquals("Hello, Johto!", messageProvider.message());
    }

    @Test
    void messageWithConstructorTest() {
        MessageProvider messageProvider = new MessageProvider("Chikorita");

        assertEquals("Hello, Pikachu!", messageProvider.message());
    }
}
