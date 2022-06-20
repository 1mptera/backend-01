import java.util.Scanner;

public class MessageToYou {

    private MessageProvider messageProvider;
    private String name;

    public static void main(String[] args) {
        MessageToYou messageToYou = new MessageToYou();
        messageToYou.run();
    }

    public void run() {
        inputUserName();

        processUserName();

        printUserName();
    }

    public void inputUserName() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What's your name? ");
        name = scanner.nextLine();
    }

    private void processUserName() {
        messageProvider = new MessageProvider(name);
    }

    private void printUserName() {
        System.out.println(messageProvider.message());
    }
}
