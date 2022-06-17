import java.util.Arrays;
import java.util.Scanner;

public class SpiralMatrix {
  public static void main(String[] args) {
    SpiralMatrix application = new SpiralMatrix();
    application.run();
  }

  public void run() {
    // 입력
    int arrayLength = inputArrayLength();

    // 처리
    int[][] spiralMatrix = process(arrayLength);

    // 출력
    displaySpiralMatrix(arrayLength, spiralMatrix);

  }

  public int inputArrayLength() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("배열의 한변 길이 : ");
    int arrayLength = scanner.nextInt();

    return arrayLength;
  }

  public int[][] process(int arrayLength) {
    int[][] spiralMatrixArray = new int[arrayLength][arrayLength];

    int index = 0;
    int row = -1;
    int column = 0;
    int change = 1;

    int endNumber = (int) Math.pow(arrayLength,2);

    while (index != endNumber) {
      for(int i = 0; i < arrayLength; i += 1) {
        row += change;
        spiralMatrixArray[column][row] = index;
        index += 1;
      }

      arrayLength -= 1;

      for (int i = 0; i < arrayLength; i += 1) {
        column += change;
        spiralMatrixArray[column][row] = index;
        index += 1;
      }

      change *= -1;
    }

    return spiralMatrixArray;
  }

  public void displaySpiralMatrix(int arrayLength, int[][] spiralMatrix) {
    for (int i = 0; i < arrayLength; i += 1) {
      for (int j = 0; j < arrayLength; j += 1) {
        System.out.print(spiralMatrix[i][j]);
        System.out.print("\t");
      }
      System.out.println();
    }
  }
}

