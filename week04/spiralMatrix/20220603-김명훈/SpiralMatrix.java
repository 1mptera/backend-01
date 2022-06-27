import java.util.Scanner;

public class SpiralMatrix {
  public static void main(String[] args) {
    //스캐너 준비 입력받기
    Scanner scanner = new Scanner(System.in);
    System.out.print("배열의 한변 길이 : ");
    int lenghtOfSide = scanner.nextInt();


    //연산 -> 3부터 순차적으로 그려보기 ( 총 3*3 9개 ,8까지 나옴)
    // 3일때 출력  0 1 2 줄바꿈 7 8 3 줄바꿈 6 5 4
    // 1 2 3
    int[][] matrix = new int[lenghtOfSide][lenghtOfSide];
    for (int i = 1; i <= lenghtOfSide; i += 1) {
      matrix[1][i] = i;
    }
    for (int i = 1; i <= lenghtOfSide;i+=1)
         {matrix[i][3] = lenghtOfSide+i-1;
  }
    for (int i =1; i <=lenghtOfSide;i +=1) {
      matrix[3][i] =
    }

  }
