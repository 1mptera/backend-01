

import java.util.Scanner;

public class Divide {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("a: ");

    int a = scanner.nextInt();

    System.out.print("b: ");

    int b = scanner.nextInt();

    int dividend = b;
    int divisor = a;

    int scale = 1;
    while(scale * divisor * 10 <= b){
      scale *= 10;
    }

    int sum;
    for (sum = 0; dividend >= divisor; scale /= 10) {
      int quotient = dividend / scale / divisor;

      int product = quotient * scale * divisor;

      int remainder = dividend - product;

      if (quotient > 0) {
        sum += quotient * scale + product + remainder;
      }

      dividend -= product;
    }

    System.out.println("합: " + sum);
  }
}
