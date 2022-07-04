// 사용자 시나리오
// 1) 1 누르고 3 = currentNumber = 13, accumulator = 0, currentOperator = ""
// 2) + 누르기 = currentNumber = 0, accumulator = 13, currentOperator = "+"
// 3) 7 누르기 = currentNumber = 7, accumulator 13, currentOperator = "+"
// 4) "=" 누르기 = currentNumber =0 accumulator 13 + 7, currentOperator = "="
// 4) "+" 누르기 = currentNumber = 0, accumulator = 20, currentOperator "+"

import javax.swing.*;
import java.awt.*;

public class Calculator {
  private JPanel panel;
  private JTextField textField;

  private long currentNumber = 0;
  private long accumulator = 0;
  private String currentOperator = "";

  public static void main(String[] args) {
    Calculator application = new Calculator();
    application.run();
  }

  public void run() {
    JFrame frame = new JFrame("Calculator");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(400, 600);

    textField = new JTextField(10);
    textField.setText("0");
    textField.setEditable(false);
    textField.setHorizontalAlignment(JTextField.RIGHT);
    frame.add(textField, BorderLayout.PAGE_START);

    panel = new JPanel();
    panel.setLayout(new GridLayout(4, 3));
    frame.add(panel);

    initNumberButton();
    initOperatorButton();

    frame.pack();
    frame.setVisible(true);
  }

  public void initNumberButton() {
    for (int i = 0; i < 10; i += 1) {
      int number = (i + 1) % 10;
      JButton button = new JButton(Integer.toString(number));
      button.addActionListener(event -> {
        addNumber(number);
        updateDisplay(currentNumber);
      });
      panel.add(button);
    }
  }

  public void initOperatorButton() {
    String[] operators = new String[]{"+", "-", "*", "/", "="};
    for (String operator : operators) {
      JButton button = new JButton(operator);
      button.addActionListener(event -> {

        calculate();

        currentOperator = operator;
        currentNumber = 0;
        updateDisplay(accumulator);
      });
      panel.add(button);
    }
  }

  public void updateDisplay(long number) {
    textField.setText(Long.toString(number));
  }

  public void addNumber(int number) {
    currentNumber *= 10;
    currentNumber += number;
  }

  public void calculate() {
    switch (currentOperator) {
      case "+" -> accumulator += currentNumber;
      case "-" -> accumulator -= currentNumber;
      case "*" -> accumulator *= currentNumber;
      case "/" -> accumulator /= currentNumber;
      case "" -> accumulator = currentNumber;
    }
  }
}
