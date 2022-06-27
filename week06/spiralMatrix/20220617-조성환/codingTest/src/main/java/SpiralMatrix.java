import java.util.Scanner;

public class SpiralMatrix {
  public static void main(String[] args) {
    SpiralMatrix application = new SpiralMatrix();
    application.run();
  }

  public void run() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("배열의 한변의 길이");

    int length = scanner.nextInt();

    int[][] spiralArray = new int[length][length];
    spiralArray = process(length);

    System.out.println("나선형 배열");
    for (int i = 0; i < spiralArray.length; i += 1) {
      for (int j = 0; i < spiralArray.length; j += 1)
        System.out.print(spiralArray[i][j] + "\t");
    }
    System.out.println();
  }

  public int[][] process(int length) {
    int[][] spiralArray = new int[length][length];

    int fianlNumber = length * length -1;


  }
}




