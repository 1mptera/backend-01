import javax.swing.*;
import java.awt.*;

public class HelloToYou {
    public static void main(String[] args) {
        HelloToYou application = new HelloToYou();
        application.run();
    }

    public void run() {
        JFrame frame = new JFrame("Hello To You");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        frame.setSize(300,400);

        JLabel label = new JLabel("Hello To You");
        frame.add(label);

        JTextField textField = new JTextField(10);
        frame.add(textField);

        JButton button = new JButton("okay");
        button.addActionListener(event -> {
            String name = textField.getText();
            label.setText("Hello, " + name + "!");
        });
        frame.add(button);

        frame.setVisible(true);
    }
}
