// 1. static main, non-static run 메소드 각각 선언
// 2. run 메소드에 로마숫자 변환 프로그램 비즈니스 로직 작성
//  - 준비 -> 입력 -> 처리 -> 출력 기본 프로세스 설정 후 test

import java.util.Scanner;

public class RomanNumber {
  private String inputNumber;
  private final String romanNumberTable = "IVXLCDM";
  private int[] arabicNumberTable;

  public static void main(String[] args) {
    RomanNumber application = new RomanNumber();
    application.run();
  }

  public void run() {
    // 준비
    Scanner scanner = new Scanner(System.in);

    // 입력
    System.out.print("로마 숫자: ");
    inputNumber = scanner.next();

    // 처리
    process(inputNumber);

    // 출력
    System.out.println("아라비아 숫자: " + process(inputNumber));
  }

  public int process(String inputNumber) {
    this.inputNumber = inputNumber;
    int arabicNumber = 0;
    boolean isLessThan = false;

    for (int i = 0; i < inputNumber.length(); i += 1) {
      char symbol = inputNumber.charAt(i);

      if (i + 1 < inputNumber.length()) {
        char nextSymbol = inputNumber.charAt(i + 1);
        int index1 = romanNumberTable.indexOf(symbol);
        int index2 = romanNumberTable.indexOf(nextSymbol);
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

    return arabicNumber;
  }
}
