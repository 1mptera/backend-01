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
    return "";
  }

  public void print(String result) {
    System.out.println("지그재그 메세지: " + result);
  }
}
