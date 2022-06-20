

import java.util.Scanner;

public class Diamond {
  public Diamond() {
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("도형의 크기를 입력해 주세요(10 미만의 자연수) : ");

    int size;
    for(size = scanner.nextInt(); size <= 0 || size >= 10; size = scanner.nextInt()) {
      System.out.print("다시 입력해주세요");
    }

    int i;
    int k;
    for(i = 0; i < size; ++i) {
      for(k = 0; k < size - 1 - i; ++k) {
        System.out.print(" ");
      }

      for(k = 0; k < i * 2 + 1; ++k) {
        System.out.print("*");
      }

      System.out.println();
    }

    for(i = 0; i < size - 1; ++i) {
      for(k = 0; k < i + 1; ++k) {
        System.out.print(" ");
      }

      for(k = 0; k < size + 2 - i * 2; ++k) {
        System.out.print("*");
      }

      System.out.println();
    }

  }
}
