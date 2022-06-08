// 입력은 식(Expression) -> (숫자 연산자 숫자) 형식으로 받는다.
// expression -> (1 + 1 => right) (1+1 => wrong)
// 입력받은 식은 "compute" 메서드로 계산을 한 뒤 출력한다.

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Calculator application = new Calculator();
        application.run();
    }

    private void run() {
        String expression = InputExpression();

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

    public String InputExpression() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input Expression : ");

        String expression = scanner.nextLine();

        return expression;
    }

    public void displayResult(int result) {
        System.out.println(result);
    }
}

