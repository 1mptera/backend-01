public class HelloWorld {
    public static void main(String[] args) {
        HelloWorld application = new HelloWorld();
        application.run();
    }

    public void run() {
        MessageProvider messageProvider = new MessageProvider();

        String text = messageProvider.message();

        System.out.println(text);
        System.out.println("Hello, world! (HelloWorld)");
    }
}
