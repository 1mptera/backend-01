import java.util.Scanner;

public class Hexadecimal {
    public static void main(String[] args) {
        // 준비
        Scanner scanner = new Scanner(System.in);

        // 입력
        System.out.print("십진수를 입력하세요: ");
        int decimal = scanner.nextInt();

        // 처리
        String hexadecimalNumber = "0123456789ABCDEF";
        int quotient = 0;

        String hexadecimal = "";
        while (decimal / 16 > 0) {
            quotient = decimal / 16;
            for (int i = 0; i < 16; i += 1) {
                if (decimal % 16 == i) {
                    hexadecimal += hexadecimalNumber.charAt(i);
                }
            }
            decimal = quotient;
        }

        if (decimal < 16) {
            for (int i = 0; i < 16; i += 1) {
                if (decimal % 16 == i) {
                    hexadecimal += hexadecimalNumber.charAt(i);
                }
            }

        }

        String reversedHexadecimal = "";
        for (int i = hexadecimal.length() - 1; i >= 0; i -= 1) {
            reversedHexadecimal = reversedHexadecimal + hexadecimal.charAt(i);
        }

        // 출력
        System.out.println("16 진수: " + reversedHexadecimal);
    }
}
