import java.text.DecimalFormat;
import java.util.Scanner;

public class SavingCalculator {
  public static void main(String[] args) {
    // 준비
    Scanner scanner = new Scanner(System.in);
    DecimalFormat decimalFormat = new DecimalFormat("###,###");

    // 입력
    System.out.println("적금 이자 계산기");

    System.out.println("월 적립액을 입력해주세요(원): ");
    double payment = scanner.nextInt();

    System.out.println("적금 기간을 입력해주세요(년): ");
    int year = scanner.nextInt();

    System.out.println("연 이자율을 입력해주세요(%): ");
    double interestRate = scanner.nextDouble();

    // 처리
    int month = year * 12;
    double totalPrincipal = payment * month;
    double monthlyInterest = interestRate / 100 / 12;
    int totalAmount = 0;

    while (month > 0) {
      payment = payment * (1 + monthlyInterest);
      totalAmount += payment;
      month -= 1;
    }

    double interest = (totalAmount - totalPrincipal) * 0.846;
    String result1 = decimalFormat.format(totalPrincipal);
    String result2 = decimalFormat.format(interest);
    String result3 = decimalFormat.format(totalPrincipal + interest);

    // 출력
    System.out.println("원금합계: " + result1 + "원");
    System.out.println("세후이자: " + result2 + "원");
    System.out.println("세후 총 수령액: " + result3 + "원");
  }
}
