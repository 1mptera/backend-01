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
        // 준비
        Scanner scanner = new Scanner(System.in);

        // 입력
        System.out.println("Input Expression : ");

        String expression = scanner.nextLine();

        // 처리
        int result = compute(expression);

        // 출력
        System.out.println(result);
    }

    public int compute(String expression) {

        return 0;
    }
}

