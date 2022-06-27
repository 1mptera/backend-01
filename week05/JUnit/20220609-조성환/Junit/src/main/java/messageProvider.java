public class messageProvider {
    private final String name;

    public messageProvider(String name) {
        this.name = name;
    }

    public messageProvider() {
        this.name = "world";
    }

    public static void main(String[] args) {
    messageProvider messageProvider = new messageProvider();
    System.out.println(messageProvider.message());
    }

    public String message() {
        return "Hello, " + name;
    }
}