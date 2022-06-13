// 1. static main, non-static run 메소드 각각 선언
// 2. run 메소드에 로마숫자 변환 프로그램 비즈니스 로직 작성
//  - 준비 -> 입력 -> 처리 -> 출력 기본 프로세스 설정 후 test

import java.util.Scanner;

public class RomanNumber {
  public static void main(String[] args) {
    RomanNumber application = new RomanNumber();
    application.run();
  }

  public void run() {
    // 준비
    Scanner scanner = new Scanner(System.in);
    String romanNumberTable = "IVXLCDM";

    // 입력
    System.out.print("로마 숫자: ");
    String inputNumber = scanner.next();

    // 처리
    int arabicNumber = 0;

    // 출력
    System.out.println("아라비아 숫자: " + arabicNumber);
  }
}
