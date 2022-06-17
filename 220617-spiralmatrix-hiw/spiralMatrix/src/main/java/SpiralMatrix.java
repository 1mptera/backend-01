import java.util.Scanner;

public class SpiralMatrix {
  public static void main(String[] args) {
    SpiralMatrix application = new SpiralMatrix();
    application.run();
  }

  public void run() {
    int length = input();

    int[][] spiralMatrix = process(length);

    print(spiralMatrix, length);
  }

  public int input() {
    Scanner scanner = new Scanner(System.in);

    int length = 0;

    while (length <= 0) {
      System.out.print("배열의 한 변 길이: ");

      length = scanner.nextInt();

      if (length <= 0) {
        System.out.println("잘못된 입력입니다. 다시 입력하세요.");
      }
    }

    return length;
  }

  public int[][] process(int length) {
    int[][] spiralMatrix = new int[length][length];

    final int MAX_VALUE = length * length - 1;
    int puttingNumber = 0;

    while (puttingNumber <= MAX_VALUE) {
      spiralMatrix[0][0] = puttingNumber;

      puttingNumber += 1;
    }

    return spiralMatrix;
  }

  public void print(int[][] spiralMatrix, int length) {
    for (int i = 0; i < length; i += 1) {
      for (int j = 0; j < length; j += 1) {
        System.out.print(spiralMatrix[i][j] + "\t");
      }

      System.out.println();
    }
  }

  /*@Override
  public boolean equals(Object other) {
    int[][] otherTwoDimensionalArray = (int[][]) other;

    boolean isEqualTo = true;

    for (int i = 0; i < ; i += 1) {
      for (int j = 0; j < ; j += 1) {
        if ( != otherTwoDimensionalArray[i][j]) {
          isEqualTo = false;

          break;
        }
      }

      if (!isEqualTo) {
        break;
      }
    }

    return isEqualTo;
  }*/
}
