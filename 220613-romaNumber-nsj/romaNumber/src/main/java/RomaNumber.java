import java.util.Scanner;

public class RomaNumber {
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
    if(romaNumber.equals("I")) {
      return 1;
    }

    if(romaNumber.equals("L")) {
      return 50;
    }

    return 0;
  }
}

