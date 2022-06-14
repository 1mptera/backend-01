// 16진수 만들기
// 10진수 -> 16진수
// 10이상의 숫자는 변환 규칙에 따라 알파벳 기호로 표시
// 10진수 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15
// 16진수 0 1 2 3 4 5 6 7 8 9  A  B  C  D  E  F

import java.util.Scanner;

public class Hexadecimal {
  public static void main(String[] args) {
    Hexadecimal application = new Hexadecimal();
    application.run();
  }

  public void run() {
    // 준비
    Scanner scanner = new Scanner(System.in);

    // 입력
    System.out.print("십진수를 입력해주세요 : ");
    int decimalNumber = scanner.nextInt();

    // 처리
    String hexadecimalNumber = compute(decimalNumber);

    // 출력
    System.out.print("16 진수 : " + hexadecimalNumber);
  }

  public String compute(int decimalNumber) {
    return null;
  }
}

