import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zigzag {
  private String sentence = "";
  private int rows = 0;
  private int wordIndex = 0;

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
    List<List<Character>> lists = makeLists();

    wordIndex = 0;

    while (wordIndex < sentence.length()) {
      putWordUpToDown(lists);

      if (wordIndex < sentence.length()) {
        putWordDiagonallyUpward(lists);
      }
    }

    return resultSentence(lists);
  }

  public List<List<Character>> makeLists() {
    List<List<Character>> lists = new ArrayList<>();

    for (int i = 0; i < rows; i += 1) {
      List<Character> list = new ArrayList<>();

      lists.add(list);
    }

    return lists;
  }

  public void putWordUpToDown(List<List<Character>> lists) {
    for (List<Character> list : lists) {
      char word = sentence.charAt(wordIndex);

      list.add(word);

      wordIndex += 1;

      if (wordIndex >= sentence.length()) {
        break;
      }
    }
  }

  public void putWordDiagonallyUpward(List<List<Character>> lists) {
    for (int i = lists.size() - 2; i >= 1; i -= 1) {
      for (int j = 0; j < lists.size(); j += 1) {
        if (j == i) {
          char word = sentence.charAt(wordIndex);

          lists.get(j).add(word);
        }

        if (j != i) {
          lists.get(j).add(' ');
        }
      }

      wordIndex += 1;

      if (wordIndex >= sentence.length()) {
        break;
      }
    }
  }

  public String resultSentence(List<List<Character>> lists) {
    String result = "";

    for (List<Character> list : lists) {
      for (char word : list) {
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

  //just for testing
  public void setMembers(String sentence, int rows) {
    this.sentence = sentence;
    this.rows = rows;
  }
}
