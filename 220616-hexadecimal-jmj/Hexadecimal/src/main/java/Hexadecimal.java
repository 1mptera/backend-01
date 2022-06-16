// 1. static main, non-static run 메소드 생성
// 2. run method에 준비-입력-처리-출력 기본 구조 생성
// 3. 사용자에게 입력받은 숫자(inputNumber) 프로세스 과정이 담긴 compute 메소드 생성
// 4. 최소한의 구조가 작동하는지 확인하기 위하여 테스트 실행

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
    System.out.print("십진수를 입력해주세요: ");
    int inputNumber = scanner.nextInt();

    // 처리
    String hexadecimal = "";
    hexadecimal = compute(inputNumber);

    // 출력
    System.out.println("16진수: " + hexadecimal);
  }

  public String compute(int inputNumber) {
    return "";
  }
}
