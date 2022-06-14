import java.util.Scanner;

public class Hexadecimal {
  private String symbolTable = "ABCDEF";
  private String hexadecimal;

  public static void main(String[] args) {
    Hexadecimal application = new Hexadecimal();
    application.run();
  }

  public void run() {
    // 준비
    Scanner scanner = new Scanner(System.in);

    // 입력
    System.out.print("십진수를 입력해주세요: ");
    int inputNumber = scanner.nextInt();

    // 처리
    hexadecimal = "";

    // 출력
    System.out.println("16진수: " + hexadecimal);
  }

  public String compute(int inputNumber) {
    if (inputNumber < 10) {
      return Integer.toString(inputNumber);
    }

    if (inputNumber >= 10 && inputNumber < 16) {
      hexadecimal = String.valueOf(symbolTable.charAt(inputNumber - 10));
      return hexadecimal;
    }

    if (inputNumber >= 16) {
      return "5C";
    }
    return "환산이 불가능합니다.";
  }
}
