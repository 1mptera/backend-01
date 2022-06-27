// 1. static main, non-static run
// 2. Calculator 구조를 미리 짜 보기
//  1) 입력을 받는다. 식(expression) 형태는 숫자 + 연산자(operator) + 숫자(각 사이 공백 있음)
//  2) 입력받은 식을 처리한다.
//  3) 결과값을 출력한다.

import java.util.Scanner;

public class Calculator {
    private String expression;

    public static void main(String[] args) {
        Calculator application = new Calculator();
        application.run();
    }

    public void run() {
        getExpression();

        int result = compute(expression);

        resultOfComputingExpression(result);
    }

    public void getExpression() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input expression: ");
        expression = scanner.nextLine();
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

    public void resultOfComputingExpression(int result) {
        System.out.println("Result: " + result);
    }
}
