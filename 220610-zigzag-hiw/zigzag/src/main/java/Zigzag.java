import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zigzag {
  private String userInput;
  private int numberOfRows;

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

    this.userInput = scanner.nextLine();

    System.out.print("행의 수를 입력해주세요: ");

    this.numberOfRows = scanner.nextInt();
  }

  public String process() {
    //List<char> 배열 생성
    List<List<Character>> lists = makeLists(this.numberOfRows);

    String result = "";
    int wordIndex = 0;

    while (wordIndex < userInput.length()) {
      putUpToDown();
      putDiagonallyUpward();
    }

    return "";
  }

  public List<List<Character>> makeLists(int numberOfRows) {
    List<List<Character>> lists = new ArrayList<>();

    for (int i = 0; i < numberOfRows; i += 1) {
      List<Character> list = new ArrayList<>();

      lists.add(list);
    }

    return lists;
  }

  public void printResult(String result) {

  }
}
