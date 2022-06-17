import java.util.Scanner;

public class SpiralMatrix {
  public static void main(String[] args) {
    SpiralMatrix application = new SpiralMatrix();
    application.run();
  }

  public void run() {
    // 준비
    Scanner scanner = new Scanner(System.in);

    // 입력
    System.out.print("배열의 한변 길이 : ");
    int arrayLength = scanner.nextInt();

    // 처리
    int[][] spiralMatrix = process(arrayLength);

    // 출력

  }

  public int[][] process(int arrayLength) {
    int[][] spiralMatrixArray = new int[arrayLength][arrayLength];

    int index = 0;

    int row = 0;
    int column = 0;

    for(int i = 0; i < arrayLength; i += 1) {
      spiralMatrixArray[column][row] = index;
      row += 1;
      index += 1;
    }

    row -= 1;

    for(int i = 0; i < arrayLength - 1; i += 1) {
      column += 1;
      spiralMatrixArray[column][row] = index;
      index += 1;
    }

    for(int i = 0; i < arrayLength - 1; i += 1) {
      row -= 1;
      spiralMatrixArray[column][row] = index;
      index += 1;
    }

    return spiralMatrixArray;
  }
}

