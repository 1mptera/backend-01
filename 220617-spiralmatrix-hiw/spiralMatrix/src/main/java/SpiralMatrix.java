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
    int rowIndex = 0;
    int columnIndex = 0;
    String direction = "RIGHT";

    while (puttingNumber <= MAX_VALUE) {
      System.out.println("row: " + rowIndex + ", column: " + columnIndex +
          ", num: " + puttingNumber);

      spiralMatrix[rowIndex][columnIndex] = puttingNumber;

      puttingNumber += 1;

      switch (direction) {
        case "RIGHT" -> columnIndex += 1;
        case "DOWN" -> rowIndex -= 1;
        case "LEFT" -> columnIndex -= 1;
        case "UP" -> rowIndex += 1;
      }

      if (columnIndex == length - 1) {
        direction = "DOWN";
      }
      else if (rowIndex == length - 1) {
        direction = "LEFT";
      }
      else if (columnIndex == 0) {
        direction = "UP";
      }
    }

    print(spiralMatrix, length);

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
}
