// 나선형 배열 : 배열의 둘레를 바깥에서 안쪽으로 돌면서 숫자를 하나씩 증가시켜가며 배치하는 배열을 뜻한다.

// 한 변의 길이를 입력받는다.
// (바깥쪽 둘레) 오른쪽 방향으로 (입력받은 수의 길이) 만큼 증가시킨다.
// (바깥쪽 둘레) 아래 방향으로 (입력받은 수 - 1의 길이) 만큼 증가시킨다.
// (바깥쪽 둘레) 왼쪽 방향으로 (입력받은 수 - 1의 길이) 만큼 중가시킨다.
// (바깥쪽 둘레) 위쪽 방향으로 (입력받은 수 - 2의 길이) 만큼 증가시킨다.
// -- 한 사이클

// (안쪽 둘레) 오른쪽 방향으로 (입력받은 수의 길이 -2의 길이) 만큼 증가시킨다.
// (안쪽 둘레) 아래 방향으로 (입력받은 수의 길이 -3의 길이) 만큼 증가시킨다.
// (안쪽 둘레) 왼쪽 방향으로 (입력받은 수의 길이 -3의 길이) 만큼 증가시킨다.
// (안쪽 둘레) 위쪽 방향으로 (입력받은 수의 길이 -4의 길이) 만큼 증가시킨다.

// 찾은 규칙성 -> 오른쪽 방향에서 아래 방향으로 변할 때 증가시키는 수의 길이가 -1이 된다.
//          -> 왼쪽 방향에서 위쪽 방향으로 변할 때 증가시키는 수의 길이가 -1이 된다.
// 반복은 증가시킨 수가 입력받은 수의 제곱 - 1 이 나오면 멈춘다.

// 출력할때 첫 줄 출력하고 두번째 줄 처음으로 돌아가는것이 아닌 마지막위치에서 아래 방향으로 출력을 어떻게 해야 하는지 의문
// 방향을 바꾸는 방법이 필요
// 배열의 "범위"를 넘어서거나 "공란"이면 방향을 바꿔나가면서 풀어보세요 -> 배열을 사용해야 하는거 같다.

// - 시도해볼 방법
// (입력받은 수의 제곱 - 1) 까지의 수를 배열에 넣고 출력할때 배열에서 꺼내오는 식으로 접근

import java.util.Scanner;

public class Spiralmatrix {
    public static void main(String[] args) {
        // 준비
        Scanner scanner = new Scanner(System.in);

        // 입력
        System.out.print("배열의 한변 길이 : ");
        int oneSideLength = scanner.nextInt();

        // 처리
        int increasingNumber = 0;
        double endNumber = Math.pow(oneSideLength, 2);
        int minusLength = oneSideLength;

        while (increasingNumber != endNumber) {
            // 오른쪽 방향
            for (int i = 0; i < minusLength; i += 1) {
                System.out.print(increasingNumber);
                System.out.print("\t");
                increasingNumber += 1;
                if (increasingNumber == endNumber) {
                    break;
                }
            }
            System.out.println();
            minusLength -= 1;

            // 아래 방향
            for (int i = 0; i < minusLength; i += 1) {
                System.out.print(increasingNumber);
                System.out.print("\t");
                increasingNumber += 1;
                if (increasingNumber == endNumber) {
                    break;
                }
            }
            System.out.println();

            // 왼쪽 방향
            for (int i = 0; i < minusLength; i += 1) {
                System.out.print(increasingNumber);
                System.out.print("\t");
                increasingNumber += 1;
                if (increasingNumber == endNumber) {
                    break;
                }
            }
            System.out.println();
            minusLength -= 1;

            // 위쪽 방향
            for (int i = 0; i < minusLength; i += 1) {
                System.out.print(increasingNumber);
                System.out.print("\t");
                increasingNumber += 1;
                if (increasingNumber == endNumber) {
                    break;
                }
            }
            System.out.println();
        }

        // 원하는 수 까지 출력완료
        // 방향만 바꾸면 된다.
    }
}
