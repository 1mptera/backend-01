import java.util.Random;
import java.util.Scanner;

public class SlotMachine {
  public static void main(String[] args) {
    // 준비
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    // 메인 루프
    double credit = 5000;
    double got = 0;

    while (true) {
      // 게임 의사 질문
      System.out.println("Want to play? 1. Yes, 2. No");
      int userAnswer = scanner.nextInt();

      // 원하지 않을 시 바로 종료
      if (userAnswer != 1) {
        goodByeMessage();
        break;
      }

      // 원할 경우 진행
      credit -= 1000;

      // 1. 슬롯 숫자 3개 세팅
      int[] slotNumbers = new int[3];
      for (int i = 0; i < 3; i += 1) {
        slotNumbers[i] = random.nextInt(10);
      }

      // 2. 금액 산정
      int sevenCount = 0;
      int halfCount = 0;

      for (int i = 0; i < slotNumbers.length; i += 1) {
        if (slotNumbers[i] == 7) {
          sevenCount += 1;
        }

        if (slotNumbers[i] == 4 || slotNumbers[i] == 8 || slotNumbers[i] == 9) {
          halfCount += 1;
        }
      }

      double basisGot = 1000 * (slotNumbers[0] + slotNumbers[1] + slotNumbers[2]) / 20;

      if (sevenCount == 0 && halfCount == 0) {
        got = basisGot;
      }

      if (sevenCount != 0 || halfCount != 0) {
        got = basisGot * Math.pow(4, sevenCount) * Math.pow(0.5, halfCount);
      }

      credit += got;

      // 3. 결과 출력
      System.out.println(slotNumbers[0] + " . " + slotNumbers[1] + " . "
          + slotNumbers[2]);
      System.out.println("Got: " + got);
      System.out.println("Credit: " + credit);

      if (credit >= 10000) {
        System.out.println("Winner!!");
        goodByeMessage();
        break;
      }

      if (credit <= 1000) {
        System.out.println("Need credit? Go home!");
        goodByeMessage();
        break;
      }
    }
  }

  public static void goodByeMessage() {
    System.out.println("Bye Bye~");
  }
}
