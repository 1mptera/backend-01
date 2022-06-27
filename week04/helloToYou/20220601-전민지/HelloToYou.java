// 0. 각 변경 단계마다 컴파일/실행 습관
// 1. static main, non-static run method
// 2. JFrame 기본 세팅
// 3. JLabel 생성, 세팅
// 4. JTextField 생성, 세팅
// 5. 마지막 삽입 컨트롤(textField)만 나타나는 현상 layout 조절 통해 해결하기
// 6. JButton 생성, ActionListener 추가하여 버튼 클릭시 액션 설정하기(람다 이해하기)
// 7. 멤버변수 생성과 중복 제거 해보기
// 수련회고
//  -> initButton이라는 메소드를 추출해서 따로 만들어봤는데 잘 작동해서 다행
//  -> 멤버변수가 4개까지 늘어났는데 문제가 없는걸까? 아직 프로그램이 작아서 문제는 없어보임
//  -> 추출한 메소드 private -> public으로 바꿔주는 것 잊지 말기

import javax.swing.*;
import java.awt.*;

public class HelloToYou {
    private String name = "World";
    private JLabel label;
    private JTextField textField;
    private JFrame frame;

    public static void main(String[] args) {
        HelloToYou application =new HelloToYou();
        application.run();
    }

    public void run() {
        frame = new JFrame("Hello to you");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        frame.setSize(400, 300);

        label = new JLabel(greetingMessage());
        frame.add(label);

        textField = new JTextField(10);
        frame.add(textField);

        initButton();

        frame.setVisible(true);
    }

    public void initButton() {
        JButton button = new JButton("확인");
        button.addActionListener(event -> {
            name = textField.getText();
            label.setText(greetingMessage());
        });
        frame.add(button);
    }

    public String greetingMessage() {
        return "Hello, " + name + "!";
    }
}
