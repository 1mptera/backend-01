

import java.util.Scanner;

public class HexaDecimal {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.print("10진수를 입력하세요: ");

    int number = scanner.nextInt();

    String hexaDecimalNumberIndex = "0123456789ABCDEF";
    String hexaDecimal = "";

    if (number == 0) {
      hexaDecimal = hexaDecimal + hexaDecimalNumberIndex.charAt(0);
    }

    while (number > 0) {

      int remainder = number % 16;

      char remainderHexaDecimal = hexaDecimalNumberIndex.charAt(remainder);

      hexaDecimal = hexaDecimal + remainderHexaDecimal;

      number /= 16;
    }

    System.out.print("16진수 " + hexaDecimal);
  }
}
