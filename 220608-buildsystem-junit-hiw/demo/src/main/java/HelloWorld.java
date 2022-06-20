import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        HelloWorld application = new HelloWorld();
        application.run();
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What's your name?: ");

        String name = scanner.nextLine();

        MessageProvider messageProvider = new MessageProvider(name);

        String text = messageProvider.message();

        System.out.println(text);
    }
}
