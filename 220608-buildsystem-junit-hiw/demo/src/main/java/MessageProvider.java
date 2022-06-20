public class MessageProvider {
    private final String NAME;

    MessageProvider() {
        this.NAME = "world";
    }

    MessageProvider(String name) {
        this.NAME = name;
    }

    public String message() {
        return "Hello, " + NAME + "!";
    }
}
