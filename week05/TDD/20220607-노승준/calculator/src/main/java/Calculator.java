import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Calculator applicaton = new Calculator();
        applicaton.run();
    }

    public void run() {

        String expression = inputExpression();

        int result = compute(expression);

        displayResult(result);

    }

    public void displayResult(int result) {
        System.out.println("Result : " + result);
    }

    public String inputExpression() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input expression : ");

        String expression = scanner.nextLine();

        return expression;
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