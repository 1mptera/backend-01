// 숫자 아구 게임 예시
// 4 8 6 숫자 3개 선택 시
// 4 8 6 = 3 strike
// 4 8 0 = 2 strike
// 8 4 2 = 2 ball
// 8 6 4 = 3 ball
// 4 6 0 = 1 strike 1 ball
// 0 0 0 = No counts!

import java.util.Random;
import java.util.Scanner;

public class BaseballGame {
  public static void main(String[] args) {
    // 준비
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    // 정답 준비
    int[] answers = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

      for (int i = 0; i < 20; i += 1) {
        int x = random.nextInt(10);
        int y = random.nextInt(10);

        int temp = answers[x];
        answers[x] = answers[y];
        answers[y] = temp;
      }

      for (int i = 0; i < answers.length; i += 1) {
        System.out.print(answers[i] + " ");
      }

      for (int i = 0; i < 3; i += 1) {
        System.out.println();
      }
    // 메인 루프

    boolean playing = true;

    while (playing) {
      System.out.print("Guess numbers: ");

      int[] inputNumbers = new int[3];
      for (int i = 0; i < 3; i += 1) {
        inputNumbers[i] = scanner.nextInt();
      }

      int strike = 0;
      int ball = 0;

      for (int i = 0; i < 3; i += 1) {
        for (int j = 0; j < 3; j += 1) {
          if (answers[i] != inputNumbers[j]) {
            continue;
          }

          if (i == j) {
            strike += 1;
            continue;
          }

          ball += 1;
        }
      }

      if (strike > 0) {
        System.out.println("Strike : " + strike);
      }

      if (ball > 0) {
        System.out.println("Ball : " + ball);
      }

      if (strike == 0 && ball == 0) {
        System.out.println("No Counts");
      }

      if (strike == 3) {
        break;
      }
    }
    System.out.println("You win!");
  }
}
