// calculator 계산기 만들기
// input expression 식 입력받기
// compute  계산하기
// result = compute 결과값 출력


import java.util.Scanner;

public class Calculator {
  public static void main(String[] args){
    Calculator calculator = new Calculator();
    calculator.run();
}

  public void run() {
    // ready
    String expression = inputExpression();
    int result = compute(expression);


    // output
    System.out.print(result);

  }

  private String inputExpression() {
    Scanner scanner = new Scanner(System.in);
    // input
    System.out.println("식을 입력해.");
    //process
    String expression = scanner.nextLine();
    return expression;
  }

  public int compute(String expression) {
    String[] words = expression.split(" ");

    int x = Integer.parseInt(words[0]);
    int y = Integer.parseInt(words[2]);
    String operator = words[1];
    return switch (operator) {
      case"+" -> x + y;

      case"-" -> x - y;

      case"*" -> x * y;

      case"/" -> x / y;
      default -> 0;

    };
  }
}
