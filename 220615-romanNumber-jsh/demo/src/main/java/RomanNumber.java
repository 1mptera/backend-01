import java.util.Scanner;

public class RomanNumber {
  public static void main(String[] args){
    RomanNumber application = new RomanNumber();
    application.run();
  }

  public void run() {
    // 준비, 입력
    Scanner scanner = new Scanner(System.in);

    System.out.print("로마 숫자를 입력해주세요");

    String romanNumber = scanner.nextLine();

    int arabiaNumber = convert(romanNumber);

    System.out.print("아라비아 숫자 : " + arabiaNumber);
  }

  public int convert(String romanNumber) {
    return 1;
  }
}
