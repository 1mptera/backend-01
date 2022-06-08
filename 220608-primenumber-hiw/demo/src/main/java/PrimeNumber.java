import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        PrimeNumber codingDojang = new PrimeNumber();
        codingDojang.run();
    }

    public void run() {
        int input = getInput();

        String result = process(input);

        printResult(result);
    }

    public int getInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("n: ");

        return scanner.nextInt();
    }

    public String process(int input) {
        boolean isPrimeNumber = true;

        if (input == 1) {
            isPrimeNumber = false;
        }

        int quotient = input;

        for (int i = 2; i < input; i += 1) {
            int remainder = modular(quotient, i);

            if (remainder == 0) {
                isPrimeNumber = false;
                break;
            }
        }

        if (!isPrimeNumber) {
            return "소수 아님";
        }
        return "소수";
    }

    public int modular(int quotient, int divisor) {
        return quotient % divisor;
    }

    public void printResult(String text) {
        System.out.println(text);
    }
}
