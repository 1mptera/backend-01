import java.util.Scanner;

public class PrimeNumber {
    private String result = "소수";
    private int inputNumber;

    public static void main(String[] args) {
        PrimeNumber application = new PrimeNumber();
        application.run();
    }

    public void run() {
        // 입력
        int inputNumber = getInputNumber();

        // 처리
        processInputNumber(inputNumber);

        // 출력
        System.out.println(result);
    }

    public int getInputNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("n: ");
        inputNumber = scanner.nextInt();
        return inputNumber;
    }

    public String processInputNumber(int inputNumber) {
        int quotient = 0;
        int remainder = 0;

        if (inputNumber == 1) {
            result = "소수 아님";
            return result;
        }

        if (inputNumber == 2) {
            result = "소수";
            return result;
        }
        return result;
    }
}
