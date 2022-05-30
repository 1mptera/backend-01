// 1. static main, non-static run
// 2. Swing - > window
// 3. 프레임안에 입력창(텍스트필드) (1) 에디터블하지 않은 것으로 생성, (2) 초기값 0, (3) layout 잡아주고, (4) 글씨를 오른쪽 정렬
// 4. 숫자 패드 버튼 (1~9 ,0) 생성 >> 반복문 통해서 버튼 10개 생성
// 5. 버튼 클릭시 텍스트 필드안에 숫자 생성
// 6. 연산작업 + - / *  = 버튼 생성
// 7. 연산작업의 버튼 작동 입력
// 8. 결과값 출력

import javax.swing.*;
import java.awt.*;

public class Calculator {
    public static void main(String[] args) {
        Calculator application = new Calculator();
        application.run();
    }

    public void run() {
        JFrame frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextField textField = new JTextField(10);

        textField.setText("0");
        textField.setHorizontalAlignment(JTextField.RIGHT);
        textField.setEditable(false);
        frame.add(textField, BorderLayout.PAGE_START);

        JPanel panel = new JPanel(new GridLayout(4,3));

        for (int i = 0; i < 10; i += 1) {
            // 1~9, 0
            // JButton button = new JButton(Integer.toString(i % 10));
            // button.addActionListener(event -> {
            //     int number = button[i];
            //     textField.setText(number);
            // });
            int number = (i + 1) % 10;
            JButton button = new JButton(Integer.toString(number));
            button.addActionListener(event -> {
                textField.setText(button.getText());
            });
            panel.add(button);
        }
        frame.add(panel);

        frame.pack();

        frame.setVisible(true);
    }
}