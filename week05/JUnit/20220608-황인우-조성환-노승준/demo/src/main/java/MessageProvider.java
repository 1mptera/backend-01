public class MessageProvider {
    private String text;

    MessageProvider() {
        this.text = "Hello, world!";
    }

    MessageProvider(String input) {
        this.text = "Hello, " + input + "!";
    }

    public String message() {
        return text;
    }
}
