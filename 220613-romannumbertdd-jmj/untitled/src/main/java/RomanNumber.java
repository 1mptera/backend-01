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
    arabicNumberTable = new int[]{1, 5, 10, 50, 100, 500, 1000};

    // 입력
    System.out.print("로마 숫자: ");
    inputNumber = scanner.next();

    // 처리
    int arabicNumber = 0;


    // 출력
    System.out.println("아라비아 숫자: " + arabicNumber);
  }

  public int process(String inputNumber) {
    if (inputNumber.equals("I")) {
      return 1;
    }

    if (inputNumber.equals("V")) {
      return 5;
    }

    if (inputNumber.equals("X")) {
      return 10;
    }

    if (inputNumber.equals("L")) {
      return 50;
    }

    if (inputNumber.equals("C")) {
      return 100;
    }

    if (inputNumber.equals("D")) {
      return 500;
    }

    if (inputNumber.equals("M")) {
      return 1000;
    }

    return 0;
  }
}
