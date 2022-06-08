import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class MessageProviderTest {
    @Test
    void messageTest() {
        MessageProvider messageProvider = new MessageProvider("Chikorita");

        assertEquals("Hello, Chikorita!", messageProvider.message());
    }
}
