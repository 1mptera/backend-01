

import java.util.Scanner;

public class SelfNumber {



  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("정수를 입력해주세요");
    int number = scanner.nextInt();
    int[] numberArray = new int[number];


    for(int i = 0; i < numberArray.length; ++i) {
      i = constructor(i);
      numberArray[i] = i;
    }

    boolean selfNumber = true;

    for(int i = 0; i < numberArray.length; ++i) {
      if (numberArray[i] == number) {
        selfNumber = false;
        break;
      }
    }

    if (selfNumber) {
      System.out.print("셀프넘버입니다");
    }

    if (!selfNumber) {
      System.out.print("셀프넘버가 아닙니다");
    }

  }

  public static int constructor(int i) {
    int sum;
    for(sum = 0; i != 0; i /= 10) {
      sum = i + i % 10;
    }

    return sum;
  }
}
