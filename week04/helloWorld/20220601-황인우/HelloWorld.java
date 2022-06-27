import javax.swing.*;

public class HelloWorld {
    public static void main(String[] args) {
        JFrame frame = new JFrame("New Windows");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocation(100, 100);
        frame.setSize(300, 300);

        JLabel label = new JLabel("Hello, world!");
        frame.add(label);

        frame.setVisible(true);
    }
}
