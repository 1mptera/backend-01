import java.util.Scanner;

public class RomaNumber {
  private int eachArabiaNumber = 0;

  public static void main(String[] args) {
    RomaNumber application = new RomaNumber();
    application.run();
  }

  public void run() {
    // 준비
    Scanner scanner = new Scanner(System.in);

    // 입력
    System.out.print("로마 숫자 : ");
    String romaNumber = scanner.nextLine();

    // 처리
    int arabiaNumber = process(romaNumber);

    // 출력
    System.out.print("아라비아 숫자 : " + arabiaNumber);
  }

  public int process(String romaNumber) {
    int sumArabiaNumber = 0;

    String[] romaNumberList = romaNumber.split("");

    for (int i = 0; i < romaNumberList.length; i += 1) {
      eachArabiaNumber = romaNumberConversion(romaNumberList[i]);

    }
    
    return eachArabiaNumber;
  }

  public int romaNumberConversion(String romaNumber) {
    return switch (romaNumber) {
      case "I" -> eachArabiaNumber = 1;
      case "V" -> eachArabiaNumber = 5;
      case "X" -> eachArabiaNumber = 10;
      case "L" -> eachArabiaNumber = 50;
      case "C" -> eachArabiaNumber = 100;
      case "D" -> eachArabiaNumber = 500;
      case "M" -> eachArabiaNumber = 1000;
      default -> eachArabiaNumber = 0;
    };

  }
}

