import javax.swing.*;
import java.awt.*;

public class Calculator {
    private static int number = 0;
    private static JButton button;

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextField textField = new JTextField();
        textField.setText("0");
        textField.setEditable(false);
        textField.setHorizontalAlignment(JTextField.RIGHT);
        frame.add(textField, BorderLayout.PAGE_START);

        JPanel panel = new JPanel(new GridLayout(4, 3));

        for (int i = 1; i <= 10; i += 1) {
            number = i % 10;
            button = new JButton(String.valueOf(number));
            panel.add(button);
        }

        frame.add(panel);

        frame.pack();

        frame.setVisible(true);
    }
}
