import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zigzag {
  private String sentence;
  private int rows;

  private int wordIndex = 0;

  public static void main(String[] args) {
    Zigzag application = new Zigzag();
    application.run();
  }

  public void run() {
    getInput();

    String result = process();

    printResult(result);
  }

  public void getInput() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("문장을 입력해주세요: ");

    this.sentence = scanner.nextLine();

    System.out.print("행의 수를 입력해주세요: ");

    this.rows = scanner.nextInt();
  }

  public String process() {
    //List<char> 배열 생성
    List<List<Character>> lists = makeLists(rows);

    while (checkWordIndex()) {
      putWordUpToDown(lists);
      putWordDiagonallyUpward(lists);
    }

    return result(lists);
  }

  public List<List<Character>> makeLists(int numberOfRows) {
    List<List<Character>> lists = new ArrayList<>();

    for (int i = 0; i < numberOfRows; i += 1) {
      List<Character> list = new ArrayList<>();

      lists.add(list);
    }

    return lists;
  }

  public boolean checkWordIndex() {
    return wordIndex < sentence.length();
  }

  public void putWordUpToDown(List<List<Character>> lists) {
    for (int i = 0; i < rows; i += 1) {
      if (!checkWordIndex()) {
        break;
      }

      char word = sentence.charAt(wordIndex);

      lists.get(i).add(word);

      wordIndex += 1;
    }
  }

  public void putWordDiagonallyUpward(List<List<Character>> lists) {
    for (int i = rows - 2; i >= 1; i -= 1) {
      if (!checkWordIndex()) {
        break;
      }

      char word = sentence.charAt(wordIndex);

      for (int j = rows - 1; j >= 0; j -= 1) {
        if (j != i) {
          lists.get(j).add(' ');
        }

        if (j == i) {
          lists.get(j).add(word);
        }
      }

      wordIndex += 1;
    }
  }

  public String result(List<List<Character>> lists) {
    String result = "";

    for (List<Character> list : lists) {
      for (Character word : list) {
        if (word == ' ') {
          continue;
        }

        result += word;
      }
    }

    return result;
  }

  public void printResult(String result) {
    System.out.println("지그재그 메세지: " + result);
  }
}
