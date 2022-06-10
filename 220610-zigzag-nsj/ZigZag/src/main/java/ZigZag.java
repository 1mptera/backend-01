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

    String inputSentence = scanner.nextLine();

    System.out.print("행의 수를 입력해주세요: ");

    int row = scanner.nextInt();

    // 처리
   
    String zigzagShape = process(inputSentence);

    // 출력
    System.out.println(zigzagShape);
  }

  public String process(String inputSentence) {

    String firstLine = "";
    String secondLine = "";
    String thirdLine = "";

    for (int i = 0; i < inputSentence.length(); i += 4) {
      firstLine += inputSentence.charAt(i);
    }

    for (int i = 1; i < inputSentence.length(); i += 2) {
      secondLine += inputSentence.charAt(i);
    }

    for (int i = 2; i < inputSentence.length(); i += 4) {
      thirdLine += inputSentence.charAt(i);
    }

    String zigzagShape = firstLine + secondLine + thirdLine;

    return zigzagShape;
  }
}

