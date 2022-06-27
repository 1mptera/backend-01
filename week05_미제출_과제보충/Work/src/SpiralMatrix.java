import java.util.Scanner;

public class SpiralMatrix {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("배열의 한변 길이: ");
    int length = scanner.nextInt();

    int[][] spiralArray = new int[length][length];

    int start = 0;
    int end = length - 1;

    int number = 0;

    while (start <= end) {
      // 오른쪽 끝으로
      for (int i = start; i <= end; i += 1) {
        spiralArray[start][i] = number;
        number += 1;
      }

        for (int i = start + 1; i <= end; i += 1) {
          spiralArray[i][end] = number;
          number += 1;
        }


        for (int i = end - 1; i >= start; i -= 1) {
          spiralArray[end][i] = number;
          number += 1;
        }


        for (int i = end - 1; i >= start + 1; i -= 1) {
          spiralArray[i][start] = number;
          number += 1;
        }
      
      start += 1;
      end -= 1;
    }
    for (int i = 0; i < spiralArray.length; i += 1) {
      for (int j = 0; j < spiralArray.length; j += 1) {
        System.out.print(spiralArray[i][j] + "\t");
      }
      System.out.println();
    }
  }
}
