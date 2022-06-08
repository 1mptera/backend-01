import java.util.Map;

public class HelloWorld {
    public static void main(String[] args) {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.run();
    }

    public void run() {
        MessageProvider messageProvider = new MessageProvider();
        System.out.println(messageProvider.message());
    }
}
