import java.util.Scanner;

public class Hexadecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int DIVISOR = 16;

        System.out.print("십진수를 입력해주세요: ");

        int decimalNumber = scanner.nextInt();

        String hexadecimalNumber = "";
        String reversedHexadecimalNumber = "";

        if (decimalNumber == 0) {
            hexadecimalNumber = "0";
        }

        for (; decimalNumber > 0; decimalNumber /= DIVISOR) {
            int remainder = decimalNumber % DIVISOR;

            char decimalToHexadecimal = ' ';

            decimalToHexadecimal = Character.forDigit(remainder, 10);

            if (remainder >= 10) {
                decimalToHexadecimal = (char)('A' + remainder - 10);
            }

            reversedHexadecimalNumber += decimalToHexadecimal;
        }

        for (int i = reversedHexadecimalNumber.length() - 1; i >= 0 ; i -= 1) {
            hexadecimalNumber += reversedHexadecimalNumber.charAt(i);
        }

        System.out.println("16진수: " + hexadecimalNumber);
    }
}
