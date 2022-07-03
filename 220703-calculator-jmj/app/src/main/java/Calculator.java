// 사용자 시나리오
// 1) 1을 누르고 3을 누름  -> currentNumber = 13, accumulator = 0, currentOperator = ""
// 2) + 누름 -> currentNumber = 0 , accumulator = 13, currentOperator = "+"
// 3) 7을 누름 - > currentNumber = 7, accumulator = 13, currentOperator = "+";
// 4) "="을 누름 -> currentNumber = 0, accumulator = 13 + 7, currentOperator = "="
// 4-1) "+"을 누름 -> currentNumber = 0, accumulator = 20, currentOperator ="+"

import org.checkerframework.checker.units.qual.C;

import javax.swing.*;
import java.awt.*;

public class Calculator {

  // GUI 요소
  private JTextField textField;
  private JPanel panel;

  // 핵심 프로그램 요소 -> 객체가 되었음!
  private CoreCalculator coreCalculator;

  // Entry point => 객체와 무관하게 따로 존재. 뭐가 어쨌든 시작은 돼야 하니까.
  public static void main(String[] args) {
    Calculator application = new Calculator();
    application.run();
  }

  public void run() {
    coreCalculator = new CoreCalculator();

    JFrame frame = new JFrame("Calculator");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(400, 600);

    textField = new JTextField(10);
    updateDisplay(coreCalculator.getCurrentNumber());
    textField.setEditable(false);
    textField.setHorizontalAlignment(JTextField.RIGHT);
    frame.add(textField, BorderLayout.PAGE_START);

    panel = new JPanel();
    panel.setLayout(new GridLayout(4, 3));
    frame.add(panel);

    initNumberButtons();
    initOperatorButtons();

    frame.pack();
    frame.setVisible(true);
  }

  public void initNumberButtons() {
    for (int i = 0; i < 10; i += 1) {
      int number = (i + 1) % 10;
      JButton button = new JButton(Integer.toString(number));
      button.addActionListener(event -> {
        coreCalculator.addNumber(number);
        updateDisplay(coreCalculator.getCurrentNumber());
      });
      panel.add(button);
    }
  }

  public void initOperatorButtons() {
    for (String operator : coreCalculator.OPERATORS) {
      JButton button = new JButton(operator);
      button.addActionListener(event -> {
        coreCalculator.calculate();
        coreCalculator.updateOperator(operator);
        updateDisplay(coreCalculator.getAccumulator());
      });
      panel.add(button);
    }
  }

  public void updateDisplay(long number) {
    textField.setText(Long.toString(number));
  }
}
