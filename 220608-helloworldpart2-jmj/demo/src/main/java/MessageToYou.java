import java.util.Scanner;

public class MessageToYou {
    public static void main(String[] args) {
        MessageToYou messageToYou = new MessageToYou();
        messageToYou.run();
    }

    public void run() {
        // 입력
        Scanner scanner = new Scanner(System.in);

        System.out.print("What's your name? ");
        String name = scanner.nextLine();

        // 처리
        MessageProvider messageProvider = new MessageProvider();
        messageProvider.message();

        // 출력
        System.out.println(messageProvider.message());
    }
}
