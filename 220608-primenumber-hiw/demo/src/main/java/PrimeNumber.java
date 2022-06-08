import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        PrimeNumber codingDojang = new PrimeNumber();
        codingDojang.run();
    }

    public void run() {
        int input = getInput();

        String result = process(input);

        printResult();
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



        if (!isPrimeNumber) {
            return "소수 아님";
        }
        return "소수";
    }

    public void printResult() {

    }
}
