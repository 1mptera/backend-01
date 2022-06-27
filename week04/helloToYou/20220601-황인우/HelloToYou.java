import javax.swing.*;
import java.awt.*;

public class HelloToYou {
    public static void main(String[] args) {
        JFrame frame = new JFrame("New Window");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        frame.setSize(400, 100);
        frame.setLocation(200, 200);

        JLabel label = new JLabel("Hello, world!");
        frame.add(label);

        JTextField textField = new JTextField(10);
        frame.add(textField);

        JButton button = new JButton("확인");
        button.addActionListener(event -> {
            String name = textField.getText();
            label.setText("Hello, " + name + "!");
        });
        frame.add(button);

        frame.setVisible(true);
    }
}
