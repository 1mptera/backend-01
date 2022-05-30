// 뭘 만드냐? 창을 만들어서 프로그램만들기
// hello, world라는 문구를 출력하고
// 자신의 이름을 넣을 수 있는 칸을 만들고
// 확인을 누를 수 있는 버튼도 만들어야함
// 버튼을 누르면 액션이 있으면 event가 일어나서
// hello, 입력한거 라는 문구가 출력됨?


// todo
// 일단 창을 만들어보자


import javax.swing.*;
import java.awt.*;

public class Helloworld {
    public static void main(String[] args){

        JFrame frame = new JFrame("Hello,world");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        JLabel label = new JLabel("Hello");
        frame.add(label);

        frame.setLayout(new FlowLayout());

        JTextField textField = new JTextField(10);


        JButton button = new JButton("확인");
        button.addActionListener(event -> {
            label.setText("Hello, "+textField.getText());
        });

        frame.add(textField);
        frame.add(button);

        frame.setVisible(true);


    }
}
