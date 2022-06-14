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
    final String HEXADECIMAL_INDEX = "0123456789ABCDEF";

    int quotient = decimal;

    if (quotient == 0) {
      return "0";
    }

    String hexadecimal = "";

    while (quotient > 0) {
      int remainder = quotient % 16;

      hexadecimal = HEXADECIMAL_INDEX.charAt(remainder) + hexadecimal;

      quotient /= 16;
    }

    return hexadecimal;
  }

  public void print(String hexadecimal) {
    System.out.println("16진수: " + hexadecimal);
  }
}
