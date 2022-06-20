import java.util.Scanner;

public class RomanNumber {
  public static void main(String[] args) {
    // 준비
    Scanner scanner = new Scanner(System.in);
    String symbolTable = "IVXLCDM";

    // 입력
    System.out.print("로마 숫자: ");
    String inputNumber = scanner.next();

    // 처리
    int arabicNumber = 0;
    boolean isLessThan = false;

    for (int i = 0; i < inputNumber.length(); i += 1) {
      char symbol = inputNumber.charAt(i);

      if (i + 1 < inputNumber.length()) {
        char nextSymbol = inputNumber.charAt(i + 1);
        int index1 = symbolTable.indexOf(symbol);
        int index2 = symbolTable.indexOf(nextSymbol);
        isLessThan = index1 < index2;
      }

      int value = 0;

      if (symbol == 'I') {
        value = 1;
      }

      if (symbol == 'V') {
        value = 5;
      }

      if (symbol == 'X') {
        value = 10;
      }

      if (symbol == 'L') {
        value = 50;
      }

      if (symbol == 'C') {
        value = 100;
      }

      if (symbol == 'D') {
        value = 500;
      }

      if (symbol == 'M') {
        value = 1000;
      }

      if (isLessThan) {
        value *= -1;
      }

      arabicNumber += value;
    }

    // 출력
    System.out.println("아라비아 숫자: " + arabicNumber);
  }
}
