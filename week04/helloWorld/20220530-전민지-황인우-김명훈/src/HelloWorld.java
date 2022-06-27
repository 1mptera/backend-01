// Java -> Swing

import javax.swing.*;
import java.awt.*;

public class HelloWorld {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Hello, World!");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new FlowLayout());

        JLabel label = new JLabel("Hello, World!");
        frame.add(label);

        JTextField textField = new JTextField(10);
        frame.add(textField);

        JButton button = new JButton("확인");
        //button.addActionListener(event -> {

        //});

        frame.setVisible(true);
    }

    private static LayoutManager getLayout(LayoutManager layout) {
        return layout;
    }
}
