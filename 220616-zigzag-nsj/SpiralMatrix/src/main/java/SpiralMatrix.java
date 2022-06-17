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

    for(int i = 0; i < arrayLength; i += 1) {
      spiralMatrixArray[0][i] = index;
      index += 1;
    }

    return spiralMatrixArray;
  }
}

