// main - run


import java.util.Scanner;

public class PentaDecimal {


    public static void main(String[] args) {
        PentaDecimal application = new PentaDecimal();
        application.run();
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input :");
        int number = scanner.nextInt();

        //process

        processPentaDecimal(number);

        String result = processPentaDecimal(number);

        //output

        System.out.print("5진수 : " + result);
    }

    public String processPentaDecimal(int number) {
        String change = "";


        while (number > 0) {
            int remainder = number % 5;
            change = remainder + change;
            number /= 5;
        }
        return change;
    }

}

