import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Calculator application = new Calculator();
        application.run();
    }

    public void run() {

        String expression = inputExpression();

        int result = compute(expression);

        displayResult(result);
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

    public String inputExpression() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input Expression : ");

        String expression = scanner.nextLine();
        return expression;
    }

    public void displayResult(int result) {
        System.out.println("Result : " + result);
    }
}
