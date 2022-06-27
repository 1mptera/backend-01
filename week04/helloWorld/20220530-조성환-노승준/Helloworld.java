// 뭘 만드냐? 창을 만들어서 프로그램만들기
// hello, world라는 문구를 출력하고
// 자신의 이름을 넣을 수 있는 칸을 만들고
// 확인을 누를 수 있는 버튼도 만들어야함
// 버튼을 누르면 액션이 있으면 event가 일어나서
// hello, 입력한거 라는 문구가 출력됨?


// todo
// 일단 창을 만들어보자
// 객체지향이 뭔가? 절차지향도 있던

import javax.swing.*;
import java.awt.*;

public class Helloworld {
    private static String name = "world";

    public static void main(String[] args) {
        Helloworld helloworld = new Helloworld();
        helloworld.run();
    }

    private static void run() {
        JFrame frame = new JFrame("Hello, world");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setLayout(new GridLayout(3, 1));

        JLabel label = new JLabel(greetingmessage());
        frame.add(label);

        JTextField textField = new JTextField(10);
        frame.add(textField);

        JButton button = new JButton("check");
        button.addActionListener(event -> {
            name = textField.getText();
            label.setText(greetingmessage());
        });
        frame.add(button);

        frame.pack();
        frame.setVisible(true);
    }

    private static String greetingmessage() {
        return "Hello, " + name + "!";
    }
}
