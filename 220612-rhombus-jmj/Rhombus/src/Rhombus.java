import java.util.Scanner;

public class Rhombus {
  public static void main(String[] args) {
    // 준비
    Scanner scanner = new Scanner(System.in);

    // 입력
    System.out.println("도형의 크기를 입력해 주세요(10 미만의 자연수");
    int size = scanner.nextInt();

    // 처리 및 출력
    while (size <= 0 || size >= 10) {
      System.out.println("다시 입력해주세요");
      size = scanner.nextInt();
    }

    for (int i = 0; i < size / 2 + 1; i += 1) {
      for (int j = 0; j < size / 2 - i; j += 1) {
        System.out.print(" ");
      }

      for (int j = 0; j < i * 2 + 1; j += 1) {
        System.out.print("*");
      }
      System.out.println();
    }

    int minusStar = 2;
    for (int i =0; i < size / 2; i += 1) {
      for (int j = 0; j < i + 1; j += 1) {
        System.out.print(" ");
      }

      for (int j = 0; j < size - minusStar; j += 1) {
        System.out.print("*");
      }
      minusStar += 2;

      System.out.println();
    }
  }
}
