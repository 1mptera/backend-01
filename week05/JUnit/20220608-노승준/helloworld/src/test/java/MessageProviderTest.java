import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MessageProviderTest {
    @Test
    void message(){
        MessageProvider messageProvider = new MessageProvider("seungjun");
        assertEquals("Hello, seungjun!", messageProvider.message());
    }

    @Test
    void noneMessage(){
        MessageProvider messageProvider = new MessageProvider();
        assertEquals("Hello, World!", messageProvider.message());
    }
}
