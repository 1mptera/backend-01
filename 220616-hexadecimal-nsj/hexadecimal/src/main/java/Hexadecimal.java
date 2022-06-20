// 의도적 수련
// 배열, charAt 사용하지 않기

import java.util.Scanner;

public class Hexadecimal {
  public static void main(String[] args) {
    Hexadecimal application = new Hexadecimal();
    application.run();
  }

  public void run() {
    // 입력
    int decimalNumber = inputDecimalNuber();

    // 처리
    String hexadecimalNumber = compute(decimalNumber);

    // 출력
    displayHexadecimalNumber(hexadecimalNumber);
  }

  public int inputDecimalNuber() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("십진수를 입력해주세요 : ");
    int decimalNumber = scanner.nextInt();

    return decimalNumber;
  }

  public String compute(int decimalNumber) {
    StringBuilder hexadecimalResult = new StringBuilder();

    if(decimalNumber == 0) {
      return "0";
    }

    int quotient = decimalNumber;

    while (quotient != 0) {
      String hexadecimal = conversion(quotient % 16);

      hexadecimalResult.append(hexadecimal);

      quotient /= 16;
    }

    hexadecimalResult.reverse();

    return hexadecimalResult.toString();
  }

  public String conversion(int decimalNumber) {

    return switch (decimalNumber) {
      case 0 -> "0";
      case 1 -> "1";
      case 2 -> "2";
      case 3 -> "3";
      case 4 -> "4";
      case 5 -> "5";
      case 6 -> "6";
      case 7 -> "7";
      case 8 -> "8";
      case 9 -> "9";
      case 10 -> "A";
      case 11 -> "B";
      case 12 -> "C";
      case 13 -> "D";
      case 14 -> "E";
      case 15 -> "F";
      default -> "0";
    };
  }

  public void displayHexadecimalNumber(String hexadecimalNumber) {
    System.out.print("16 진수 : " + hexadecimalNumber);
  }
}

