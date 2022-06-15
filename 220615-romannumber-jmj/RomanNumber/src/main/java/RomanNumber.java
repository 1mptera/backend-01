import java.util.Scanner;

public class RomanNumber {
  public static void main(String[] args) {
    RomanNumber application = new RomanNumber();
    application.run();
  }

  public void run() {
    // 준비
    Scanner scanner = new Scanner(System.in);
    String symbolTable = "IVXLCDM";

    // 입력
    System.out.print("로마 숫자: ");
    String inputNumber = scanner.next();

    // 처리
    int arabicNumber = compute(inputNumber);

    // 출력
    System.out.print("아라비아 숫자: " + arabicNumber);
  }

  public int compute(String inputNumber) {
    if (inputNumber.length() == 1) {
      return switch (inputNumber) {
        case "I" -> 1;
        case "V" -> 5;
        case "X" -> 10;
        case "L" -> 50;
        case "C" -> 100;
        case "D" -> 500;
        case "M" -> 1000;
        default -> 0;
      };
    };

    if (inputNumber.length() > 1) {
      int amount = 0;

      for (int i = 0; i < inputNumber.length(); i += 1) {
        char symbol = inputNumber.charAt(i);

        if (symbol == 'I') {
          amount += 1;
        }

        if (symbol == 'V') {
          amount += 5;
        }

        if (symbol == 'X') {
          amount += 10;
        }

        if (symbol == 'L') {
          amount += 50;
        }

        if (symbol == 'C') {
          amount += 100;
        }

        if (symbol == 'D') {
          amount += 500;
        }

        if (symbol == 'M') {
          amount += 1000;
        }
      }
      return amount;

    }
    return 0;
  }
}
