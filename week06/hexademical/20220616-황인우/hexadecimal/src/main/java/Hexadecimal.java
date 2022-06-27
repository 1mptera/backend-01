// 문제를 꼬아본다.
// - 10진수를 일단 2진수로 변환한다.
// - 변환된 2진수를 오른쪽 4자리씩 묶어 16진수로 변환한다.


import java.util.Scanner;

public class Hexadecimal {
  public static void main(String[] args) {
    Hexadecimal application = new Hexadecimal();
    application.run();
  }

  public void run() {
    int decimal = input();

    String hexadecimal = process(decimal);

    print(hexadecimal);
  }

  public int input() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("10진수를 입력해주세요: ");

    return scanner.nextInt();
  }

  public String process(int decimal) {
    String binary = decimalToBinary(decimal);

    final String HEXADECIMAL_INDEX = "0123456789ABCDEF";

    int binarySum = 0;
    String hexadecimal = "";

    for (int i = 0; i < binary.length(); i += 1) {
      char oneBinaryDigit = binary.charAt(binary.length() - 1 - i);

      int scale = (int) Math.pow(2, i % 4);

      //binarySum += Character.getNumericValue(oneBinaryDigit) * (2 * scale);


    }

    return binary;
  }

  public String decimalToBinary(int quotient) {
    String binary = "";

    while (quotient > 0) {
      int remainder = quotient % 2;

      binary = remainder + binary;

      quotient /= 2;
    }

    return binary;
  }

  public void print(String hexadecimal) {
    System.out.println("16진수: " + hexadecimal);
  }
}
