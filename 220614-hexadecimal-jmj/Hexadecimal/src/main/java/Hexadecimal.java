import java.util.Scanner;

public class Hexadecimal {
  public static void main(String[] args) {
    Hexadecimal application = new Hexadecimal();
    application.run();
  }

  public void run() {
    // 준비
    Scanner scanner = new Scanner(System.in);
    String symbolTable = "ABCDEF";

    // 입력
    System.out.print("십진수를 입력해주세요: ");
    int inputNumber = scanner.nextInt();

    // 처리
    String hexadecimal = "";

    // 출력
    System.out.println("16진수: " + hexadecimal);
  }

  public String compute(int inputNumber) {
    return "0";
  }
}
