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
    System.out.print("배열의 한 변 길이: ");
    int size = scanner.nextInt();

    // 처리
    int [][] spiralMatrix = new int[size][size];
    spiralMatrix = compute(size);

    // 출력
    System.out.println("나선형 배열");
    for (int i = 0; i < spiralMatrix.length; i += 1) {
      for (int j = 0; j < spiralMatrix.length; j += 1) {
        System.out.print(spiralMatrix[i][j] + "\t");
      }
      System.out.println();
    }
  }

  public int[][] compute(int size) {
    int[][] tempMatrix = new int[size][size];
    tempMatrix = new int[][]{{1, 2}, {4, 3}};
    return tempMatrix;
  }
}
