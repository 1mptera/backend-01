import java.util.Scanner;

public class MessageProvider {
    public static void main(String[] args) {
        System.out.println("Hello, world! (Main in MessageProvider)");
    }

    public String message() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What's your name?: ");

        String name = scanner.nextLine();

        return "Hello, " + name + "!";
    }
}
