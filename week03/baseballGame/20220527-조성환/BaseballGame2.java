import java.util.Random;
import java.util.Scanner;

public class BaseballGame2 {
    public static void main(String[] args) {
        // 준비
        Scanner scanner = new Scanner(System.in);

        Random random = new Random();

        int[] numbers = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        for (int i = 0; i < 20; i += 1) {
            int x = random.nextInt(10);
            int y = random.nextInt(10);
            int temp = numbers[x];
            numbers[x] = numbers[y];
            numbers[y] = temp;
        }

        for (int i = 0; i < 4; i += 1) {
            System.out.print(numbers[i] + " ");
        }

        System.out.println();

        int strike = 0;
        int ball = 0;

        int[] answers = new int[4];
        boolean playing = true;
        //처리  스트라이크가 3개면  you win 입력을 해야함
        while (playing) {
            // input
            strike = 0;
            ball = 0;

            System.out.print("Guess number: ");

            for (int i = 0; i < answers.length; i += 1) {
                answers[i] = scanner.nextInt();
            }

            for (int i = 0; i < answers.length; i += 1) {
                for (int j = 0; j < answers.length; j += 1) {
                    if (numbers[i] != answers[j]) {
                        continue;
                    }
                    if (i == j) {
                        strike += 1;
                        continue;
                    }
                    ball += 1;
                }
            }

            if(ball == 4) {
                playing= false;
            }

            if (strike != 0) {
                System.out.println(strike + " strike");
            }

            if (ball != 0) {
                System.out.println(ball + " ball");
            }

            if (strike == 0 && ball == 0) {
                System.out.println("No count!");
            }
        }

        //출력  you win 입력을 해야함
        System.out.println("You win! ");
    }
}
