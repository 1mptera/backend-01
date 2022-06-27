// 1. static main - non-static run
// 2. 계산기. 입력 -> 처리 -> 출력
//  1) 입력. 식(expression): 숫자 + 연산자(operator) + 숫자
//  2) 처리
//  3) 출력

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Calculator application = new Calculator();
        application.run();
    }

    public void run() {
        // 준비
        Scanner scanner = new Scanner(System.in);

        // 입력
        System.out.print("Input expression: ");
        String expression = scanner.nextLine();

        // 처리
        int result = compute(expression);

        // 출력
        System.out.println("Result = " + result);
    }

    public int compute(String expression) {

        String[] words = expression.split(" ");

        int x = Integer.parseInt(words[0]);
        int y = Integer.parseInt(words[2]);
        String operator = words[1];

        if (operator.equals("+")) {
            return x + y;
        }

        if (operator.equals("-")) {
            return x - y;
        }

        return 0;
    }
}

