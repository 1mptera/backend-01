import java.util.Scanner;

public class Quinary {
    public static void main(String[] args) {
        Quinary application = new Quinary();
        application.run();
    }

    public void run() {
        int decimalNumber = input();

        int result = process(decimalNumber);

        print(result);
    }

    public int input() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input: ");

        return scanner.nextInt();
    }

    public int process(int decimalNumber) {
        int dividend = decimalNumber;
        final int DIVISOR = 5;

        int quinaryNumber = 0;
        int digitCount = 0;

        while (dividend > 0) {
            int remainder = makeOneQuinaryDigit(dividend, DIVISOR);

            quinaryNumber += addQuinaryDigit(digitCount, remainder);

            dividend /= DIVISOR;
            digitCount += 1;
        }

        return quinaryNumber;
    }

    public int makeOneQuinaryDigit(int dividend, int DIVISOR) {
        return dividend % DIVISOR;
    }

    public int addQuinaryDigit(int digitCount, int remainder) {
        return (int) Math.pow(10, digitCount) * remainder;
    }

    public void print(int result) {
        System.out.println("5진수: " + result);
    }
}
