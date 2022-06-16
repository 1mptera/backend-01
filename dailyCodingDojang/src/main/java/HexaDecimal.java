import java.util.Scanner;

public class HexaDecimal {
  public static void main(String[] args){
    HexaDecimal application = new HexaDecimal();
    application.run();
  }

  public void run() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("십진수를 입력해주세요");
    int number = scanner.nextInt();

    String hexaDecimal = compute(number);

    System.out.print(hexaDecimal);
  }
}
