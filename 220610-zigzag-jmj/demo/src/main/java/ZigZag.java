import java.util.Scanner;

public class ZigZag {
  public static void main(String[] args) {
    ZigZag application = new ZigZag();
    application.run();
  }

  public void run() {
    // 준비
    Scanner scanner = new Scanner(System.in);

    // 입력
    System.out.println("문장을 입력해주세요 :");
    String sentence = scanner.nextLine();

    System.out.print("행의 수를 입력해주세요 : ");
    int rowNumber = scanner.nextInt();

    // 처리
    String[] words = sentence.split("");
    String result = "";

    String processedWords = "";
    int i = 0;

    while (i < rowNumber) {
      processedWords += words[i];
      i += 1;
    }

    // 출력
    System.out.println("지그재그 메시지: " +"\n" + result);

  }
}
