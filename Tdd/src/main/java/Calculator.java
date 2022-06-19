import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.run();
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("식을 입력해주세요 ");

        String expression = scanner.nextLine();

        int result = compute(expression);

        System.out.print(result);
    }

    public int compute(String expression) {
        String[] words = expression.split(" ");

        int x = Integer.parseInt(words[0]);
        int y = Integer.parseInt(words[2]);

        String operator = words[1];


        return switch (operator) {
            case "+" -> x + y;
            case "-" -> x - y;
            case "*" -> x * y;
            case "/" -> x / y;
            default -> 0;

        };
    }
}
