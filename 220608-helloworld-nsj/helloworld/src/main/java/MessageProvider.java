public class MessageProvider {
    private String name;

    public MessageProvider() {
        this.name = "World";
    }

    public MessageProvider(String name) {
        this.name = name;
    }

    public String message() {
        return "Hello, " + name + "!";
    }
}
