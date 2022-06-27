import java.util.Scanner;

public class RomanNumber {
  private String symbolTable = "IVXLCDM";

  public static void main(String[] args) {
    RomanNumber application = new RomanNumber();
    application.run();
  }

  public void run() {
    String inputNumber = requestNumber();

    int arabicNumber = compute(inputNumber);

    displayProcessedNumber(arabicNumber);
  }

  public String requestNumber() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("로마 숫자: ");
    String inputNumber = scanner.next();
    return inputNumber;
  }

  public int compute(String inputNumber) {
    int amount = 0;

    for (int i = 0; i < inputNumber.length(); i += 1) {
      char symbol = inputNumber.charAt(i);
      boolean isLessThan = false;

      if (i + 1 < inputNumber.length()) {
        char nextSymbol = inputNumber.charAt(i + 1);
        int index1 = symbolTable.indexOf(symbol);
        int index2 = symbolTable.indexOf(nextSymbol);
        isLessThan = index1 < index2;
      }

      int matchingValue = 0;

      if (symbol == 'I') {
        matchingValue = 1;
      }

      if (symbol == 'V') {
        matchingValue = 5;
      }

      if (symbol == 'X') {
        matchingValue = 10;
      }

      if (symbol == 'L') {
        matchingValue = 50;
      }

      if (symbol == 'C') {
        matchingValue = 100;
      }

      if (symbol == 'D') {
        matchingValue = 500;
      }

      if (symbol == 'M') {
        matchingValue = 1000;
      }

      if (isLessThan) {
        matchingValue *= -1;
      }

      amount += matchingValue;
    }

    return amount;
  }

  public void displayProcessedNumber(int arabicNumber) {
    System.out.print("아라비아 숫자: " + arabicNumber);
  }
}

