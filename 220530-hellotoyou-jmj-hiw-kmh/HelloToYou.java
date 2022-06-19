import javax.swing.*;
import java.awt.*;

public class HelloToYou {
    private String name = "World";

    public static void main(String[] args) {
        HelloToYou application = new HelloToYou();
        application.run();
    }

    public void run() {
        JFrame frame = new JFrame(greetingMessage());

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new FlowLayout());

        JLabel label = new JLabel(greetingMessage());
        frame.add(label);

        JTextField textField = new JTextField(10);
        frame.add(textField);

        JButton button = new JButton("확인");
        button.addActionListener(event -> {
            name = textField.getText();
            label.setText(greetingMessage());
        });
        frame.add(button);

        frame.setVisible(true);
    }

    public String greetingMessage() {

        return "Hello, " + name + "!";
    }
}