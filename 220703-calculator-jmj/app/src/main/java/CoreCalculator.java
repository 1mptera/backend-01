import org.checkerframework.checker.units.qual.A;

public class CoreCalculator {

  // 상수 (일반적으로 static final)
  public static final String[] OPERATORS = new String[]{"+", "-", "*", "/", "="};

  // 프로그램의 핵심 상태
  private long accumulator = 0;
  private long currentNumber = 0;
  private String currentOperator = "";

  // getter!
  public long getCurrentNumber() {
    return currentNumber;
  }

  // getter!
  public long getAccumulator() {
    return accumulator;
  }

  public void addNumber(int number) {
    currentNumber *= 10;
    currentNumber += number;
  }

  public void updateOperator(String operator) {
    currentOperator = operator;
  }

  public void calculate() {
    switch (currentOperator) {
      case "" -> accumulator = currentNumber;
      case "+" -> accumulator += currentNumber;
      case "-" -> accumulator -= currentNumber;
      case "*" -> accumulator *= currentNumber;
      case "/" -> accumulator /= currentNumber;
    }

    currentNumber = 0;
  }
}
