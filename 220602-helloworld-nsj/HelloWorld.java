// - 창을 생성하기 위해, JFrame을 사용한다
// - 창의 x버튼을 누르면 꺼지게 하기 위해, DefaultCloseOperation 을 통해서 설정한다.
// - 창의 사이즈를 조정하기 위해, setSize 를 통해서 설정한다.
// - 텍스트를 창 안에 표현하기 위해, JLabel을 사용한다.

import javax.swing.*;

public class HelloWorld {
    public static void main(String[] args) {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.run();
    }

    public void run() {
        JFrame frame = new JFrame("Hello, World");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        JLabel label = new JLabel("Hello");
        frame.add(label);

        frame.setVisible(true);
    }
}