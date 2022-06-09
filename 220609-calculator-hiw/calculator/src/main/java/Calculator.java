// 프로그램의 목적: 계산식을 입력받아 계산 결과를 출력한다.
//
// 프로그램의 구성
// - 입력: 사용자로부터 "숫자1 연산자 숫자2" 형태의 문자열을 입력받음
// - 처리: 계산식을 계산하여 결과를 저장
// - 출력: 저장한 결과를 출력

import java.util.Scanner;

public class Calculator {
  public static void main(String[] args) {
    Calculator application = new Calculator();
    application.run();
  }

  public void run() {
    String expression = input();

    int result = process(expression);

    print(result);
  }

  public String input() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("식을 입력해 주세요. (형태: '숫자1 연산자 숫자2') ");

    return scanner.nextLine();
  }

  public int process(String expression) {
    String[] text = expression.split(" ");

    int number1 = Integer.parseInt(text[0]);
    int number2 = Integer.parseInt(text[2]);
    String operator = text[1];

    return switch (operator) {
      case "+" -> number1 + number2;
      case "-" -> number1 - number2;
      case "*" -> number1 * number2;
      case "/" -> number1 / number2;
      default -> 0;
    };
  }

  public void print(int result) {
    System.out.println("결과: " + result);
  }
}
