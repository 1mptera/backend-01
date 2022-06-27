import java.util.Scanner;

public class SpiralMatrix {
  public static void main(String[] args) {
    // 준비
    Scanner scanner = new Scanner(System.in);

    // 입력
    System.out.print("배열의 한변 길이: ");
    int size = scanner.nextInt();

    // 처리
    int[][] spiralMatrix = new int[size][size];

    int number = 0;
    int minColumn = 0;
    int maxColumn = size - 1;
    int minRow = 0;
    int maxRow = size - 1;

    while (number < size * size) {
      for (int i = minColumn; i <= maxColumn; i += 1) {
        spiralMatrix[minRow][i] = number;
        number += 1;
      }

      for (int i = minRow + 1; i <= maxRow; i += 1) {
        spiralMatrix[i][maxColumn] = number;
        number += 1;
      }

      for (int i = maxColumn - 1; i >= minColumn; i -= 1) {
        spiralMatrix[maxRow][i] = number;
        number += 1;
      }

      for (int i = maxRow - 1; i >= minRow + 1; i -= 1) {
        spiralMatrix[i][minColumn] = number;
        number += 1;
      }

      minColumn += 1;
      minRow += 1;
      maxColumn -= 1;
      maxRow -= 1;
    }

    // 출력
    for (int i = 0; i < spiralMatrix.length; i += 1) {
      for (int j = 0; j < spiralMatrix.length; j += 1) {
        System.out.print(spiralMatrix[i][j] + "\t");
      }
      System.out.println();
    }
  }
}
