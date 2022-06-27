// 숫자야구게임
//   순서가 있는 숫자를 준비를 하고 > 4 8 3
//   사용자가 3개의 숫자를 입력을 하면
//   strike 냐 ball를 판별을 해줘야함
//   strike 는 숫자랑 위치가 일치
//   ball은  숫자는 일치하는데 위치가 다름
//   3 스트라이크 되면은 유 윈을 출력하고 게임을 종료한다.

// 투 두
// 1. 정답을 준비한다. -> 랜덤을 이용해서
// 2. 스트라이크와 볼을 판별해주는 식을 작성한다. (비즈니스 로직)
// 3. 3 스트라이크가 되면 게임 종료


import java.util.Random;
import java.util.Scanner;

public class BaseballGame {
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

        for (int i = 0; i < 3; i += 1) {
            System.out.print(numbers[i] + " ");
        }

        System.out.println();

        int strike = 0;
        int ball = 0;

        int[] answers = new int[3];

        //처리  스트라이크가 3개면  you win 입력을 해야함
        while (strike != 3) {
            // input
            strike = 0;
            ball = 0;

            System.out.print("Guess number: ");

            for (int i = 0; i < answers.length; i += 1) {
                answers[i] = scanner.nextInt();
            }

            for (int i = 0; i < 3; i += 1) {
                for (int j = 0; j < 3; j += 1) {
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
