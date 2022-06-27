import java.util.Scanner;

public class Decimal {
    public Decimal() {
    }

    public static void main(String[] args) {
        Decimal application = new Decimal();
        application.run();
    }

    public void run() {
        int number = this.inputNumber();
        this.isPrime(number);
        if (this.isPrime(number)) {
            System.out.println("소수");
        }

        if (!this.isPrime(number)) {
            System.out.println("소수 아님");
        }

    }

    private int inputNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("n: ");
        int number = scanner.nextInt();
        return number;
    }

    public boolean isPrime(int number) {
        boolean isPrime = number > 1;

        for(int i = 2; i < number; ++i) {
            if (number % i == 0) {
                isPrime = false;
            }
        }

        return isPrime;
    }
}