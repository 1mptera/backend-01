import java.util.Arrays;
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
    int columnNumber = scanner.nextInt();

    // 처리
    String zigzagMessage = process(sentence, columnNumber);

    // 출력
    System.out.print("지그재그 메시지 : " + zigzagMessage);
  }

  public String process(String sentence, int columnNumber) {

    String[][] zigzag = new String[columnNumber][sentence.length()];

    String result = "";

    int column = 0;
    int row = 0;
    int index = 0;

    zigzag[column][row] = String.valueOf(sentence.charAt(index));

    column += 1;
    index += 1;

    while (index != sentence.length()) {
      for (int i = 0; i < columnNumber - 1; i += 1) {
        if (index == sentence.length()) {
          break;
        }
        zigzag[column][row] = String.valueOf(sentence.charAt(index));

        index += 1;
        column += 1;
      }

      column -= 1;

      for (int i = 0; i < columnNumber - 1; i += 1) {
        if (index == sentence.length()) {
          break;
        }
        column -= 1;
        row += 1;

        zigzag[column][row] = String.valueOf(sentence.charAt(index));

        index += 1;
      }

      column += 1;
    }

    for (int i = 0; i < columnNumber; i += 1) {
      for (int j = 0; j < row + 1; j += 1) {
        result += zigzag[i][j];
      }
    }

    result = result.replace("null", "");

    return result;
  }
}

