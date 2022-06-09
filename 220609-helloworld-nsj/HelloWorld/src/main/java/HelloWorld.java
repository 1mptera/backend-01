import java.util.Scanner;

public class HelloWorld {
    private MessageProvider messageProvider;

    public static void main(String[] args) {
        HelloWorld application = new HelloWorld();
        application.run();
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What`s your name? ");

        String name = scanner.nextLine();

        messageProvider = new MessageProvider(name);

        System.out.println(messageProvider.message());
    }
}

