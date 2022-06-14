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
    String hexadecimal = "";

    int quotient = decimal;

    if (quotient == 0) {
      hexadecimal = "0";
    }

    while (quotient > 0) {
      int remainder = quotient % 16;

      String transferredDigit = switch (remainder) {
        case 10 -> "A";
        case 11 -> "B";
        case 12 -> "C";
        case 13 -> "D";
        case 14 -> "E";
        case 15 -> "F";
        default -> Integer.toString(remainder);
      };

      hexadecimal = transferredDigit + hexadecimal;

      quotient /= 16;
    }

    return hexadecimal;
  }

  public void print(String hexadecimal) {
    System.out.println("16진수: " + hexadecimal);
  }
}
