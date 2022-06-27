// 목적: control을 가져올 때마다 컴파일 하고 실행해보는 습관을 들인다.
// 1. terminal에서 Hello, world 문구를 System.out.println(); 명령어로 출력하고 컴파일/실행
// 2. Swing-JFrame으로 윈도우 창 생성 후 컴파일/실행
// 3. 창 종료 시 프로그램 실행도 종료되도록 코드 작성 후 컴파일/실행
// 4. window 크기 조정 후 컴파일/실행
// 5. label 작성 후 컴파일/실행
// 6. static main, non-static run method 분리 후 컴파일/실행
// 수련회고
//  -> 요구사항 작성도 수련이 필요함
//  -> 컴파일/실행 과정을 자주 거치니 누락시키는 내용이 생각보다 많다는 것을 알게됨

import javax.swing.*;

public class HelloWorld {
    public static void main(String[] args) {
        HelloWorld application = new HelloWorld();
        application.run();
    }

    public void run() {
        JFrame frame = new JFrame("Hello, World!");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        JLabel label = new JLabel("Hello, World!");
        frame.add(label);

        frame.setVisible(true);
    }
}
