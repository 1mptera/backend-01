import java.util.Scanner;

public class HelloWorld {
    private MessageProvider messageProvider;

    public static void main(String[] args) {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.run();
    }

    private void run() {
        messageProvider = new MessageProvider();

        System.out.println(messageProvider.message());
    }
}
