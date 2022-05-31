// 0. 기본 윈도우 세팅
// 1. JTextField로 숫자가 출력되는 화면을 만들기
// -> 에디터블 불가하게
// -> 첫 화면이 "0"이면서 글씨가 오른쪽 정렬
// -> 레이아웃 조절을 통해 크기를 조절
// 2. 버튼을 만들자 0 ~ 9 순서는 1 ~ 9 하고 0
// -> JPanel을 먼저 설정해주고, 그 안에 버튼이 배치가 되는 방향.
// -> 버튼을 만들고 누르면 Textfield의 숫자가 누른 숫자로 변경이 되도록 하자
// -> 1을 누르고 3을 누르면 13이 나오도록 하자
// -> 버튼의 배치는 4행 3열로 하자
// 3. 연산자(operator) 해결
//  -> +, - *, / =
//  -> 각 기능들이 기능을 하도록(버튼을 눌렀을 때)
//  -> 사용자 시나리오
//  -> 3을 누르면 currentNumber = 3  operator = ""
//  -> +를 누르면 accumulator = 3이 들어가고 currentNumber = 0  operator = "+"
//  -> 5를 누르면 accumulator = 3, currentNumber = 5  operator = "+"
//  -> =을 누르면 accumulator = 3 + 5 = 8, currentNumber = 0  operator = "="
//    -> *를 누르면 accumulator = 8, currentNumber = 0  operator = "*"
//    -> 2를 누르면 accumulator = 8, currentNumber = 2  operator = "*"
//    -> 3을 누르면 accumulator = 8, currentNumber = 23  operator = "*"
//    -> -를 누르면 accumulator = 8 * 23 = 184, currentNumber = 0  operator = "-"

import javax.swing.*;
import java.awt.*;

public class Calculator {
    private long currentNumber = 0;
    private long accumulator = 0;
    private String currentOperator = "";
    private JPanel panel;
    private JTextField textField;

    public static void main(String[] args) {
        Calculator application = new Calculator();
        application.run();
    }

    private void run() {
        JFrame frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        textField = new JTextField();
        textField.setText("0");
        textField.setHorizontalAlignment(JTextField.RIGHT);
        textField.setEditable(false);
        frame.add(textField, BorderLayout.PAGE_START);

        panel = new JPanel();

        panel.setLayout(new GridLayout(4, 3));

        initNumberButton();
        initOperatorButton();

        frame.add(panel);   // 추후 생략 가능여부 추가확인 하기
        frame.pack();
        frame.setVisible(true);
    }

    private void initNumberButton() {
        for (int i = 0; i < 10; i += 1) {
            int number = (i + 1) % 10;
            JButton numberButton = new JButton(Integer.toString(number));
            numberButton.addActionListener(event -> {
                currentNumber *= 10;
                String clickedNumber = numberButton.getText();
                currentNumber += Integer.parseInt(clickedNumber);
                textField.setText(Long.toString(currentNumber));
            });

            panel.add(numberButton);
        }
    }

    public void initOperatorButton() {
        String[] operatorButtons = new String[]{"+", "-", "*", "/", "="};

        for (String operatorButton : operatorButtons) {
            JButton button = new JButton(operatorButton);

            panel.add(button);
        }
    }
}
