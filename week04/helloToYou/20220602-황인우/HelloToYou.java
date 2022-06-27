import javax.swing.*;
import java.awt.*;

public class HelloToYou {
    //Member Variables
    private JFrame frame;
    private JLabel label;
    private JTextField textField;
    private JButton button;

    private String name = "world";

    //Methods
    public void run() {
        initFrame();
        initLabel();
        initTextField();
        initButton();

        frame.setVisible(true);
    }

    public void initFrame() {
        frame = new JFrame("New Window");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 100);
        frame.setLocation(100, 100);
        frame.setLayout(new FlowLayout());
    }

    public void initLabel() {
        label = new JLabel(getGreetingMessage());
        frame.add(label);
    }

    public void initTextField() {
        textField = new JTextField(15);
        textField.setEditable(true);
        frame.add(textField);
    }

    public void initButton() {
        button = new JButton("인사하기");
        button.addActionListener(event -> {
            name = textField.getText();
            label.setText(getGreetingMessage());
        });
        frame.add(button);
    }

    public String getGreetingMessage() {
        return "Hello, " + name + "!";
    }

    //Main Method
    public static void main(String[] args) {
        HelloToYou application = new HelloToYou();
        application.run();
    }
}
