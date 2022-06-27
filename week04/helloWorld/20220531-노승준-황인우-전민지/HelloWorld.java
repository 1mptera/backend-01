//목표: GUI로 hello world!를 출력한다.

import javax.swing.*;

public class HelloWorld {
    public static void main(String[] args) {
        HelloWorld application = new HelloWorld();
        application.run();
    }

    public void run() {
        JFrame frame = new JFrame("Hello World!");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        JLabel label = new JLabel("Hello World");
        frame.add(label);

        frame.setVisible(true);
    }
}
