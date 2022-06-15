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
  }
}
