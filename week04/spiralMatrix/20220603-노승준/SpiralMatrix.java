// - 나선형 배열

// 테두리 바깥쪽
// 오른쪽 방향 1씩 증가 (입력받은 수 만큼)
// 아래 방향 1씩 증가 (입력받은 수 -1 만큼)
// 왼쪽 방향 1씩 증가 (입력받은 수 -1 만큼)
// 위쪽 방향 1씩 증가 (입력받은수 -2 만큼)

// 안쪽
// 다시 오른쪽 방향 1씩 증가 (입력받은 수 -2 만큼)
// 다시 아래쪽 방향 1씩 증가 (입력받은 수 -3 만큼)
// 다시 왼쪽 방향 1씩 증가 (입력받은 수 -3 만큼)
// 다시 위쪽 방향 1씩 증가 (입력받은 수 -4 만큼)
// - 이 과정을  입력받은 수의 제곱 -1이 나타날 때 까지 반복한다

// 숫자의 위치를 나타내기 위해 2차원 배열 사용

import java.util.Scanner;

public class SpiralMatrix {
    public static void main(String[] args) {
        // 준비
        Scanner scanner = new Scanner(System.in);

        // 입력
        System.out.print("배열의 한변 길이 : ");
        int oneSideLength = scanner.nextInt();

        int[][] matrix = new int[oneSideLength][oneSideLength];

        int addNumber = 0;
        int row = 0;
        int column = 0;
        int minusLength = 1;

        // 처리
        double endNumber = Math.pow(oneSideLength, 2) - 1;

        while (addNumber != endNumber) {
            // 오른쪽 방향
            for (int i = 0; i < oneSideLength; i += 1) {
                matrix[row][column] = addNumber;
                addNumber += 1;
                row += 1;
            }

            // 아래쪽 방향
            for (int i = 0; i < oneSideLength - minusLength; i += 1) {
                matrix[row][column] = addNumber;
                addNumber += 1;
                column += 1;
            }

            // 왼쪽 방향
            for (int i = 0; i < oneSideLength - minusLength; i += 1) {
                matrix[row][column] = addNumber;
                addNumber += 1;
                row -= 1;
            }

            minusLength += 1;

            // 위쪽 방향
            for (int i = 0; i < oneSideLength - minusLength; i += 1) {
                matrix[row][column] = addNumber;
                addNumber += 1;
                column -= 1;
            }

        }

        // 출력
        System.out.println("나선형 배열: ");
        for (int i = 0; i < oneSideLength; i += 1) {
            for (int j = 0; j < oneSideLength; j += 1) {
                System.out.print(matrix[i][j]);
                System.out.print("\t");
            }
            System.out.println();
        }
    }
}
