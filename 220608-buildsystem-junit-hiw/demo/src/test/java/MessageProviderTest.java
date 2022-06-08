import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class MessageProviderTest {
    @Test
    void messageTest() {
        MessageProvider messageProvider = new MessageProvider();

        assertEquals("Hello, Chikorita!", messageProvider.message());
    }
}