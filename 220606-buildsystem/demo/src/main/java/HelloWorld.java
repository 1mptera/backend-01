//main -> run
// run hello, world


public class HelloWorld {
    public static void main(String[] args) {
        HelloWorld application = new HelloWorld();
        application.run();
    }

    public void run() {
        MessageProvider messageProvider = new MessageProvider();
        messageProvider.message();

        System.out.println("Hello, world! (application)");
    }
}
