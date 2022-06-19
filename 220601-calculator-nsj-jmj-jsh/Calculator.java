import javax.swing.*;
import java.awt.*;

public class Calculator {
    private static final String[] OPERATORS = new String[]{"+", "-", "*", "/", "="};
    private long currentNumber = 0;
    private long accumulator = 0;
    private String currentOperator = "";
    private JTextField textField;
    private JPanel panel;

    public static void main(String[] args) {
        Calculator application = new Calculator();
        application.run();
    }

    private void run() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        textField = new JTextField(10);
        updateDisplay(currentNumber);
        textField.setEditable(false);
        textField.setHorizontalAlignment(JTextField.RIGHT);
        frame.add(textField, BorderLayout.PAGE_START);

        panel = new JPanel();
        panel.setLayout(new GridLayout(4, 3));

        initNumberButtons();
        initOperatorButtons();

        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }

    public void updateDisplay(Long number) {
        textField.setText(Long.toString(number));
    }

    public void initOperatorButtons() {
        for (String operator : OPERATORS) {
            JButton button = new JButton(operator);
            button.addActionListener(event -> {
                calculate();
                currentOperator = operator;
                updateDisplay(accumulator);
            });
            panel.add(button);
        }
    }

    public void initNumberButtons() {
        for (int i = 0; i < 10; i += 1) {
            long number = (i + 1) % 10;
            JButton button = new JButton(Long.toString(number));
            button.addActionListener(event -> {
                displayNumber(number);
                updateDisplay(currentNumber);
            });
            panel.add(button);
        }
    }

    public void displayNumber(Long number) {
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
        currentNumber = 0;
    }
}
