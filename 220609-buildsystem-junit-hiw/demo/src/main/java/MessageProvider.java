public class MessageProvider {
    private final String NAME;

    MessageProvider() {
        this.NAME = "World";
    }

    MessageProvider(String name) {
        this.NAME = name;
    }

    public String message() {
        return "Hello, " + NAME + "!";
    }
}
