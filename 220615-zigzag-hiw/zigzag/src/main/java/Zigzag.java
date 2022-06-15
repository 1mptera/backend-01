import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zigzag {
  private String sentence = "";
  private int rows = 0;

  public static void main(String[] args) {
    Zigzag application = new Zigzag();
    application.run();
  }

  public void run() {
    input();

    String result = process();

    print(result);
  }

  public void input() {
    Scanner scanner = new Scanner(System.in);

    System.out.println("문장을 입력해주세요: ");
    sentence = scanner.nextLine();

    System.out.println("행의 수를 입력해주세요: ");
    rows = scanner.nextInt();
  }

  public String process() {
    List<List<Character>> lists = new ArrayList<>();

    for (int i = 0; i < rows; i += 1) {
      List<Character> list = new ArrayList<>();

      lists.add(list);
    }

    int charIndex = 0;

    while (charIndex < sentence.length()) {
      for (int i = 0; i < lists.size(); i += 1) {
        lists.get(i).add(sentence.charAt(charIndex));
        charIndex += 1;

        if (charIndex >= sentence.length()) {
          break;
        }
      }

      if (charIndex < sentence.length()) {
        for (int i = lists.size() - 2; i >= 1; i -= 1) {

          for (int j = 0; j < lists.size(); j += 1) {
            if (j == i) {
              lists.get(j).add(sentence.charAt(charIndex));
            }
            if (j != i) {
              lists.get(j).add(' ');
            }
          }

          charIndex += 1;

          if (charIndex >= sentence.length()) {
            break;
          }
        }
      }
    }

    String result = "";

    for (int i = 0; i < lists.size(); i += 1) {
      List<Character> list = lists.get(i);

      for (int j = 0; j < list.size(); j += 1) {
        char word = list.get(j);

        if (word != ' ') {
          result += word;
        }
      }
    }

    return result;
  }

  public void print(String result) {
    System.out.println("지그재그 메세지: " + result);
  }

  //for test
  public void setMembers(String sentence, int rows) {
    this.sentence = sentence;
    this.rows = rows;
  }
}
