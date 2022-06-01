//연산자와 숫자를 눌렀을 때 Test Cases
// 3  >> accu: 0             curr: 3        oper: ""
// -  >> accu: 0 + 3 = 3     cur : 0        oper: "-"
// 4  >> acc 3                cur 4         oper: "-"
// +  >> 3-4                  cur 0         oper  "+"
// 2  >> -1                      2            +
// =     -1+2                    0             "="
// *
// 4
// -
// 10
// +
// 3
// =
// 4
// current situation : button clicked -> clicked number >> currentNumber
// operator clicked >> currentNumber->accumulator operator current Number , currentNumber ->0

import javax.swing.*;
import java.awt.*;

public class Calculator {
    private int currentNumber = 0;
    private int accumulator = 0;
    private String currentOperator = "";

    public static void main(String[] args) {
        Calculator application = new Calculator();
        application.run();
    }

    public void run() {
        JFrame frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextField textField = new JTextField(10);
        textField.setHorizontalAlignment(JTextField.RIGHT);
        textField.setText("0");
        textField.setEditable(false);
        frame.add(textField, BorderLayout.PAGE_START);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 3));
        for (int i = 1; i <= 10; i += 1) {
            JButton button = new JButton(Integer.toString(i % 10));
            button.addActionListener(event -> {
                //currentNumber = Integer.parseInt(textField.getText());
                int clickedNumber = Integer.parseInt(button.getText());
                currentNumber = (currentNumber * 10) + clickedNumber;
                textField.setText(Integer.toString(currentNumber));
            });
            panel.add(button);
        }

        final String[] OPERATORS = new String[]{ "+", "-", "*", "/", "=" };
        for (int z = 0; z < OPERATORS.length; z += 1) {
            JButton button = new JButton(OPERATORS[z]);
            button.addActionListener(event -> {
                // current situation : button clicked -> clicked number >> currentNumber
                // operator clicked >> currentNumber->accumulator operator current Number , currentNumber ->0
                if (currentOperator.equals("/")) {
                    accumulator /= currentNumber;
                }
                if (currentOperator.equals("+") || currentOperator.equals("")) {
                    accumulator += currentNumber;
                }
                if (currentOperator.equals("-")) {
                    accumulator -= currentNumber;
                }
                if (currentOperator.equals("*")) {
                    accumulator *= currentNumber;
                }

                textField.setText(Integer.toString(accumulator));

                currentOperator = button.getText();

                currentNumber = 0;


            });
            panel.add(button);
        }

        //첫번째 문제: 연산자를 누르고 숫자를 누르면 새로 누른 숫자만 떠야 되는데 기존 숫자에 쌓임 okay
        //두번째 문제: 숫자 >> >> 숫자 >> 는 을 누르면 숫자 연산자 숫자 계산을 해야되는데 안함
        //세번째 문제: 32 + 1 +까지 하면 353이 나옴

        frame.add(panel);

        frame.pack();

        frame.setVisible(true);
    }
}
