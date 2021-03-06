import java.util.Scanner;

public class SpiralMatrix {
  public static void main(String[] args) {
    SpiralMatrix application = new SpiralMatrix();
    application.run();
  }

  public void run() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("배열의 한변 길이 : ");
    int oneSideLength = scanner.nextInt();

    int[][] matrix = new int[oneSideLength][oneSideLength];

    int row = -1;
    int column = 0;
    int addNumber = 0;
    int changeDirection = 1;
    int minusLength = oneSideLength;
    double lastNumber = Math.pow(oneSideLength, 2);

    while (lastNumber != addNumber) {
      for (int i = 0; i < minusLength; i += 1) {
        row += changeDirection;
        matrix[column][row] = addNumber;
        addNumber += 1;
      }

      minusLength -= 1;

      for (int i = 0; i < minusLength; i += 1) {
        column += changeDirection;
        matrix[column][row] = addNumber;
        addNumber += 1;
      }

      changeDirection *= -1;
    }

    for (int i = 0; i < oneSideLength; i += 1) {
      for (int j = 0; j < oneSideLength; j += 1) {
        System.out.print(matrix[i][j]);
        System.out.print("\t");
      }
      System.out.println();
    }

  }
}

