

import java.util.Scanner;

public class SavingCalculator {


  public static void main(String[] args) {
    SavingCalculator application = new SavingCalculator();
    application.run();
  }

  public void run() {

    Scanner scanner = new Scanner(System.in);

    System.out.print("월 접립액을 설정해주세요(원): ");

    int amount = scanner.nextInt();

    System.out.print("적금 기간을 설정해주세요(년): ");

    int year = scanner.nextInt();

    System.out.print("연 이자율을 설정해주세요(%): ");

    double interestRest = scanner.nextDouble();

    int month = year * 12;

    int totalAmount = amount * month;

    double monthInterest = interestRest / 100.0 / 12.0;


    int afterTaxTotalAmount;

    for (afterTaxTotalAmount = 0; month > 0; month-=1) {
      amount = (int) ((double) amount * (1.0 + monthInterest));
      afterTaxTotalAmount += amount;
    }

    int afterTax = (int) ((double) (afterTaxTotalAmount - totalAmount) * 0.846);
    System.out.println("원금합계 " + totalAmount);
    System.out.println("세후이자 " + afterTax);
    System.out.println("세후 총 수령액 " + afterTaxTotalAmount);
  }
}
