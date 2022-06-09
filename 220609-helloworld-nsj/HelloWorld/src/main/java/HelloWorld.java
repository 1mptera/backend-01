public class HelloWorld {
    private MessageProvider messageProvider;

    public static void main(String[] args) {
        HelloWorld application = new HelloWorld();
        application.run();
    }

    public void run() {
        messageProvider = new MessageProvider();

        System.out.println("[HelloWorld]");
        System.out.println(messageProvider.message());
    }
}

