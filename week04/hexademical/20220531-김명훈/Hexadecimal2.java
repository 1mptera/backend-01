import java.util.Scanner;

public class Hexadecimal2 {
    public static void main(String[] args) {
        // 0. 준비
        Scanner scanner = new Scanner(System.in);

        // 1. 입력
        System.out.print("Input: ");
        int decimalNumber = scanner.nextInt();

        // 2. 처리
        int base = 16;
        int scale = 1;
        int hexadecimalNumber = 0;

        while (quotient > 0) {
            int quotient /= base;
            int remainder = quotient % base;

            if

            hexadecimalNumber += remainder * scale;

            scale *= 10;
        }

        // 3. 출력
        System.out.print("16 진수: " + hexadecimalNumber);
    }
}