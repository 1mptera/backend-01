import java.util.Scanner;

public class RomanNumber {
  public static void main(String[] args) {
    // 준비
    Scanner scanner = new Scanner(System.in);

    // 입력
    System.out.print("로마 숫자: ");
    String inputNumber = scanner.next();

    // 처리
    String romanNumberSystem = "IVXLCDM";
    int arabicNumber= 0;

    for(int i = 0; i < inputNumber.length(); i += 1) {
      char symbol = inputNumber.charAt(i);

      boolean isLessThan = false;

      if (i + 1 < inputNumber.length()) {
        char nextSymbol = inputNumber.charAt(i + 1);
        int index1 = romanNumberSystem.indexOf(symbol);
        int index2 = romanNumberSystem.indexOf(nextSymbol);
        isLessThan = index1 < index2;
      }

      int number = 0;

      if(symbol == 'I') {
        number = 1;
      }

      if(symbol == 'V') {
        number = 5;
      }

      if(symbol == 'X') {
        number = 10;
      }

      if(symbol == 'L') {
        number = 50;
      }

      if(symbol == 'C') {
        number = 100;
      }

      if(symbol == 'D') {
        number = 500;
      }

      if(symbol == 'M') {
        number = 1000;
      }

      if(isLessThan) {
        number *= -1;
      }

      arabicNumber += number;
    }

    // 출력
    System.out.println("아라비아 숫자: " + arabicNumber);
  }
}
