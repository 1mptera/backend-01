//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Random;
import java.util.Scanner;

public class BaseBallGame {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    int[] answers = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};


    int strike;
    int ball;
    for(int i = 0; i < 20; ++i) {
      int x = random.nextInt(10);
      strike = random.nextInt(10);
      ball = answers[x];
      answers[x] = answers[strike];
      answers[strike] = ball;
    }

    for(int i = 0; i < answers.length; ++i) {
      System.out.print(answers[i] + " ");
    }

    for(int i = 0; i < 3; ++i) {
      System.out.println();
    }

    boolean playing = true;

    while(playing) {
      System.out.print("Guess numbers: ");
      int[] inputNumbers = new int[3];

      for(strike = 0; strike < 3; ++strike) {
        inputNumbers[strike] = scanner.nextInt();
      }

      strike = 0;
      ball = 0;

      for(int i = 0; i < 3; ++i) {
        for(int j = 0; j < 3; ++j) {
          if (answers[i] == inputNumbers[j]) {
            if (i == j) {
              ++strike;
            } else {
              ++ball;
            }
          }
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
