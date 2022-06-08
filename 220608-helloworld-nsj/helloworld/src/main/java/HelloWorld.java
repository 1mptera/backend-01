import java.util.Scanner;

public class HelloWorld {
    private MessageProvider messageProvider;

    public static void main(String[] args) {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("이름을 입력해주세요 : ");

        String name = scanner.nextLine();

        messageProvider = new MessageProvider(name);

        System.out.println(messageProvider.message());
    }
}
