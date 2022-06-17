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

    int result = transformSpiral(length);

    System.out.println("니선형 배열 " + result);

  }

  public int transformSpiral(int length) {

    int[] spiralArray = new int[length];

    for (int i = 0; i < spiralArray.length; i += 1) {
      if (spiralArray.length == 1) {
        return 0;
      }
      if (spiralArray.length == 2) {
        return 1;
      }
      if (spiralArray.length == 3) {
        return 2;
      }
      if (spiralArray.length == 4) {
        return 3;
      }

    }
    return 0;
  }
}