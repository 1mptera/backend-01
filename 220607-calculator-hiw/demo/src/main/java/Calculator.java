import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Calculator application = new Calculator();
        application.run();
    }

    public void run() {
        String expression = input();

        int result = process(expression);

        print(result);
    }

    public String input() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("식을 입력해 주세요 (순서: x operator y, 숫자와 연산자 사이는 띄워서)");

        return scanner.nextLine();
    }

    public int process(String expression) {
        String[] words = expression.split(" ");

        int x = Integer.parseInt(words[0]);
        int y = Integer.parseInt(words[2]);

        if (words[1].equals("+")) {
            return x + y;
        }
        if (words[1].equals("-")) {
            return x - y;
        }
        if (words[1].equals("*")) {
            return x * y;
        }
        if (words[1].equals("/")) {
            return x / y;
        }

        return 0;
    }

    public void print(int result) {
        System.out.println("결과: " + result);
    }
}
