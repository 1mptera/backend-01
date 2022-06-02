import javax.swing.*;

public class HelloWorld {
    private JFrame frame;

    public void run() {
        initFrame();
        initLabel();

        frame.setVisible(true);
    }

    private void initFrame() {
        frame = new JFrame("New Window");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 100);
    }

    private void initLabel() {
        JLabel label = new JLabel("Hello, world!");
        label.setHorizontalAlignment(JLabel.CENTER);
        frame.add(label);
    }

    public static void main(String[] args) {
        HelloWorld application = new HelloWorld();
        application.run();
    }
}
