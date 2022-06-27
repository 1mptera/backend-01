import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Calculator application = new Calculator();
        application.run();
    }

    private void run() {
        String expression = input();

        int result = process(expression);

        print(result);
    }

    public String input() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("식을 입력해주세요 (형식: 숫자 연산자 숫자): ");

        return scanner.nextLine();
    }

    public int process(String expression) {
        String[] text = expression.split(" ");

        int firstNumber = Integer.parseInt(text[0]);
        int secondNumber = Integer.parseInt(text[2]);

        return switch (text[1]) {
            case "+" -> firstNumber + secondNumber;
            case "-" -> firstNumber - secondNumber;
            case "*" -> firstNumber * secondNumber;
            case "/" -> firstNumber / secondNumber;
            default -> 0;
        };
    }

    public void print(int result) {
        System.out.println("결과: " + result);
    }
}
