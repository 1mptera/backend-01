// 의도적 수련
// 배열, charAt 사용하지 않기

import java.util.Scanner;

public class Hexadecimal {
  public static void main(String[] args) {
    Hexadecimal application = new Hexadecimal();
    application.run();
  }

  public void run() {
    // 준비
    Scanner scanner = new Scanner(System.in);

    // 입력
    System.out.print("십진수를 입력해주세요 : ");
    int decimalNumber = scanner.nextInt();

    // 처리
    String hexadecimalNumber = compute(decimalNumber);

    // 출력
    System.out.print("16 진수 : " + hexadecimalNumber);
  }

  public String compute(int decimalNumber) {
    StringBuilder hexadecimalResult = new StringBuilder();

    String hexadecimal = conversion(decimalNumber);

    hexadecimalResult.append(hexadecimal);

    return hexadecimalResult.toString();
  }

  public String conversion(int decimalNumber) {

    return switch (decimalNumber) {
      case 0 -> "0";
      case 1 -> "1";
      case 15 -> "F";
      default -> "0";
    };
  }
}
