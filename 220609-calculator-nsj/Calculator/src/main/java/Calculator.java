// Calculator
// - 계산할 식을 입력 받는다.
// - 식은 (숫자 연산자 숫자) 형태로 입력한다.
// - 입력받은 식을 계산해주는 compute 메서드를 작성한다.

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Calculator application = new Calculator();
        application.run();
    }

    private void run() {
        String expression = inputExpression();

        int result = compute(expression);

        displayResult(result);
    }

    public String inputExpression() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input Expression : ");

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

    public void displayResult(int result) {
        System.out.println("Result : " + result);
    }
}

