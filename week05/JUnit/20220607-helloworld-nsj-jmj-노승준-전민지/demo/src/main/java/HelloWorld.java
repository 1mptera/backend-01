import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.run();
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What's your name? ");

        String name = scanner.nextLine();

        MessageProvider messageProvider = new MessageProvider(name);
        
        System.out.println(messageProvider.message());
    }
}
