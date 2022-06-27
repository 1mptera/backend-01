// 16진수 만들기
// 10진수 -> 16진수
// 10이상의 숫자는 변환 규칙에 따라 알파벳 기호로 표시
// 10진수 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15
// 16진수 0 1 2 3 4 5 6 7 8 9  A  B  C  D  E  F

import java.util.Scanner;

public class Hexadecimal {
  public static void main(String[] args) {
    Hexadecimal application = new Hexadecimal();
    application.run();
  }

  public void run() {
    int decimalNumber = inputDecimalNumber();

    String hexadecimalNumber = compute(decimalNumber);

    displayHexadecimal(hexadecimalNumber);
  }

  public int inputDecimalNumber() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("십진수를 입력해주세요 : ");
    int decimalNumber = scanner.nextInt();

    return decimalNumber;
  }

  public String compute(int decimalNumber) {
    String hexadecimal = "0123456789ABCDEF";
    String hexadecimalResult = "";

    if (decimalNumber <= 15) {
      hexadecimalResult = String.valueOf(hexadecimal.charAt(decimalNumber));
    }

    if (decimalNumber > 15) {
      int quotient = decimalNumber;

      while (quotient > 0) {
        hexadecimalResult = hexadecimal.charAt(quotient % 16) + hexadecimalResult;

        quotient /= 16;
      }
    }

    return hexadecimalResult;
  }

  public void displayHexadecimal(String hexadecimalNumber) {
    System.out.print("16 진수 : " + hexadecimalNumber);
  }
}

