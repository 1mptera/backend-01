import java.util.Scanner;

public class Hexadecimal {
  public static void main(String[] args) {
    Hexadecimal application = new Hexadecimal();
    application.run();
  }

  public void run() {
    //스캐너 준비 및 입력
    Scanner scanner = new Scanner(System.in);

    System.out.print("십진수를 입력해주세요: ");

    int decimalNumber = scanner.nextInt();

    //처리
    String hexadecimal = Hexadecimal.proccess(decimalNumber);

    //출력
   // System.out.print("16 진수: " + hexadecimalNumber);
  }

  private static String proccess(int decimalNumber) {
    return null;
  }
}
