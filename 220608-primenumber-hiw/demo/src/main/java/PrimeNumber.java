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
        return "";
    }

    public void printResult() {

    }
}
