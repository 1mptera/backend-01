import java.util.Scanner;
public class SprialMatrix {
  public static void main(String[] args) {
    //스캐너 준비 입력받기
    Scanner scanner = new Scanner(System.in);
    int lenghtOfSide = scanner.nextInt();

    //연산 -> 3부터 순차적으로 그려보기 ( 총 3*3 9개 ,8까지 나옴)
    // 3일때 출력  0 1 2 줄바꿈 7 8 3 줄바꿈 6 5 4
    // 1 2 3
    int[][] matrix1 = new int [2][2];
    int[][] matrix2 = new int [3][3];
    System.out.println(matrix1);
    System.out.println(matrix2);
  }

}
