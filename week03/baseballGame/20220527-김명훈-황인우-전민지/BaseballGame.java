//- `Guess numbers:` 라는 메세지를 출력하고 같은 줄에 0 부터 9까지 숫자 중 세개를 입력받는다.
//- 입력한 숫자 중 하나가 정답의 숫자 중 하나와 일치하고 같은 위치에 있으면 `Strike`로 취급한다.
//- 입력한 숫자 중 하나가 정답의 숫자 중 하나와 일치하지만 다른 위치에 있으면 `Ball`로 취급한다.
//- 한 번 입력받을 때 마다 세개의 숫자를 모두 검사한 뒤 `Strike` 와 `Ball` 의 개수 정보를 알려준다.
//- 만약 입력받은 모든 수가 `Strike` 혹은 `Ball` 에 해당하지 않는다면 `No count` 메세지를 출력한다.
//- `Strike` 의 개수가 3 이면 `You win` 메세지를 출력하고 프로그램을 종료한다.
//- 3 Strike가 아니라면 라면 메인 루프를 반복한다.
// 2 8 6 이 정답일때
// 1 2 3 -> 1 ball
// 1 4 5 -> no count
// 2 6 7 -> 1 strike 1 ball
// 2 7 6 -> 2 strike
// 2 8 6 -> 3 strike

import java.util.Random;
import java.util.Scanner;
public class BaseballGame {
    public static void main(String[] args) {
        // 0. pre
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int[] numbers = new int[]{1,2,3,4,5,6,7,8,9};

        for (int i = 0; i < 3; i += 1) {
            int index1 = random.nextInt(9);
        }

        numbers[0]

        int answer1;
        int answer2;
        int answer3;
        int strikeCount = 0;
        int ballCount = 0;

        // main loop

        while (strikeCount != 3) {


            // 1. input
            System.out.print("Guess numbers: ");

            int userNumber1 = scanner.nextInt();
            int userNumber2 = scanner.nextInt();
            int userNumber3 = scanner.nextInt();


            // 2. process
            strikeCount = 0;
            ballCount = 0;

            if (answer1 == userNumber1) {
                strikeCount += 1;
            }
            if (answer2 == userNumber2) {
                strikeCount += 1;
            }
            if (answer3 == userNumber3) {
                strikeCount += 1;
            }

            if (answer1 == userNumber2 || answer1 == userNumber3) {
                ballCount += 1;
            }
            if (answer2 == userNumber1 || answer2 == userNumber3) {
                ballCount += 1;
            }
            if (answer3 == userNumber1 || answer3 == userNumber2) {
                ballCount += 1;
            }

            // 3. output
            if (ballCount == 0 && strikeCount == 0) {
                System.out.println("No Count");
            }
            if (ballCount == 0 && strikeCount != 0) {
                System.out.println(strikeCount +" strike");
            }
            if (strikeCount == 0 && ballCount != 0) {
                System.out.println(ballCount + " ball");
            }
            if (strikeCount >=1 && ballCount >=1) {
                System.out.println(strikeCount + " strike");
                System.out.println(ballCount + " ball");
            }


        }

        System.out.println("You win!!");

    }
}
