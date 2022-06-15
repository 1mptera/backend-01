import java.util.Scanner;

public class SpiralMatrix {
  public static void main(String[] args) {
    SpiralMatrix application = new SpiralMatrix();
    application.run();
  }

  public void run() {
    // 준비
    Scanner scanner = new Scanner(System.in);

    // 입력
    System.out.print("배열의 한 변 길이: ");
    int size = scanner.nextInt();

    // 처리
    String result = compute(size);

    // 출력
    System.out.println("나선형 배열:" );
    System.out.println(result);
  }

  public String compute(int size) {
    return "결과 없음";
  }
}
