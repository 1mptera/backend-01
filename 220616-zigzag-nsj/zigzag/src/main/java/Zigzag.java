import java.util.Scanner;

public class Zigzag {
  public static void main(String[] args) {
    Zigzag application = new Zigzag();
    application.run();
  }

  public void run() {
    // 입력
    Scanner scanner = new Scanner(System.in);

    System.out.println("문장을 입력해주세요 : ");
    String sentence = scanner.nextLine();

    System.out.print("행의 수를 입력해주세요 : ");
    int rowNumber = scanner.nextInt();

    // 처리
    String zigzagMessage = process(sentence, rowNumber);

    // 출력
    System.out.print("지그재그 메시지 : " + zigzagMessage);
  }

  public String process(String sentence, int rowNumber) {

    return null;
  }
}
