import java.util.Scanner;

public class Hexadecimal {
  private String hexadecimal = "";

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
    hexadecimal = compute(inputNumber);

    // 출력
    System.out.println("16진수: " + hexadecimal);
  }

  public String compute(int inputNumber) {
    String symbolTable = "0123456789ABCDEF";
    hexadecimal = "";
    String tempHexadecimal = "";

    if (inputNumber < 16) {
      return String.valueOf(symbolTable.charAt(inputNumber));
    }

    if (inputNumber >= 16) {
      int quotient = 1;
      int remainder = 0;

      for (int i = 0; 0 < quotient; i += 1) {
        quotient = inputNumber / 16;
        remainder = inputNumber % 16;

        tempHexadecimal += String.valueOf(symbolTable.charAt(remainder));

        inputNumber = quotient;
      }

      for (int i = tempHexadecimal.length(); i > 0; i -= 1) {
        hexadecimal += String.valueOf(tempHexadecimal.charAt(i - 1));
      }
      return hexadecimal;
    }
    return "범위에 맞는 값을 입력해주세요(자연수)";
  }
}
