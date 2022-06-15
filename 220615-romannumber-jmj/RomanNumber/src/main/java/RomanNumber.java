import java.util.Scanner;

public class RomanNumber {
  public static void main(String[] args) {
    RomanNumber application = new RomanNumber();
    application.run();
  }

  public void run() {
    // 준비
    Scanner scanner = new Scanner(System.in);
    String symbolTable = "IVXLCDM";

    // 입력
    System.out.print("로마 숫자: ");
    String inputNumber = scanner.next();

    // 처리
    int arabicNumber = compute(inputNumber);

    // 출력
    System.out.print("아라비아 숫자: " + arabicNumber);
  }

  public int compute(String inputNumber) {
    return 0;
  }
}
