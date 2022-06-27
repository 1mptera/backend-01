import java.util.Scanner;

public class Calculator {
  public static void main(String[] args) {
    Calculator application = new Calculator();
    application.run();
  }

  public void run() {
    System.out.println("Input expression: ");
    Scanner scanner = new Scanner(System.in);

    String expression = scanner.nextLine();

    String[] words = expression.split(" ");

    //계산
    int result = compute(expression);


    //출력
    System.out.println("Result: " + result);


  }

  public int compute(String expression) {
    return 0;
  }
}
