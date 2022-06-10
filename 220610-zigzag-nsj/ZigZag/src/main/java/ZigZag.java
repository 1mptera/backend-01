import java.util.Scanner;

public class ZigZag {
  private String zigzagShape = "";
  private String firstLine = "";
  private String secondLine = "";
  private String thirdLine = "";
  private String fourthLine = "";

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

    if (row == 3) {
      zigzagShape = inputRowThree(inputSentence);
    }

    if (row == 4) {
      zigzagShape = inputRowFour(inputSentence);
    }

    // 출력
    System.out.println(zigzagShape);
  }

  public String inputRowThree(String inputSentence) {
    for (int i = 0; i < inputSentence.length(); i += 4) {
      firstLine += inputSentence.charAt(i);
    }

    for (int i = 1; i < inputSentence.length(); i += 2) {
      secondLine += inputSentence.charAt(i);
    }

    for (int i = 2; i < inputSentence.length(); i += 4) {
      thirdLine += inputSentence.charAt(i);
    }

    zigzagShape = firstLine + secondLine + thirdLine;

    return zigzagShape;
  }

  public String inputRowFour(String inputSentence) {
    for (int i = 0; i < inputSentence.length(); i += 6) {
      firstLine += inputSentence.charAt(i);
    }

    for (int i = 1; i < inputSentence.length(); i += 4) {
      secondLine += inputSentence.charAt(i);

      if (i % 6 == 5) {
        secondLine += inputSentence.charAt(i + 2);
        i += 2;
      }
    }

    for (int i = 2; i < inputSentence.length(); i += 2) {
      if (i == 12) {
        break;
      }

      thirdLine += inputSentence.charAt(i);

      if (i % 6 == 4 && i < 10) {
        thirdLine += inputSentence.charAt(i + 4);
        i += 4;
      }
    }

    for (int i = 3; i < inputSentence.length(); i += 6) {
      fourthLine += inputSentence.charAt(i);
    }

    zigzagShape = firstLine + secondLine + thirdLine + fourthLine;

    return zigzagShape;
  }
}

