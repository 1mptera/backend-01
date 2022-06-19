// 프로그램의 수행 과정
// - 입력을 받는다: ex 1 + 1, 2 + 2
// - 받은 입력을 처리해서 결과를 만든다.
// - 결과를 출력한다.
//
// 처리 과정에 대한 테스트코드를 작성한다.
// 테스트코드는 red -> green -> refactoring 과정을 통해 작성한다.
// 소스코드가 테스트를 통과하면 더 높은 수준의 테스트코드를 작성하고, 테스트를 통과할 수 있도록 소스코드를 개선한다.

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Calculator application = new Calculator();
        application.run();
    }

    private void run() {
        // input
        String expression = inputExpression();

        // process
        String result = compute(expression);
        //String exceptResult = checkException(expression);

        // output
        printResult(result);
    }

    /*private String checkException(String expression) {
        String[] word = expression.split(" ");

        return "다시 입력해주세요.";
    }*/

    public String compute(String expression) {
        String[] word = expression.split(" ");

        if (word.length != 3) {
            return "다시 입력해주세요.";
        }

        String operator = word[1];

        int x = Integer.parseInt(word[0]);
        int y = Integer.parseInt(word[2]);

        int result = switch (operator) {
            case "+" -> x + y;
            case "-" -> x - y;
            case "*" -> x * y;
            case "/" -> x / y;
            default -> 0;
        };

        return Integer.toString(result);
    }

    public String inputExpression() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("식을 입력해주세요 ");
        String expression = scanner.nextLine();
        return expression;
    }

    public void printResult(String result) {
        System.out.println(result);
    }
}
