// 0. 기존 내용을 복습하기 위해 boilerplate, println()을 활용하여 Hello, World! 문구를 출력한다.
// 1. 새로 배운 Swing 개념을 활용하고 GUI로 가시화 하고자 JFrame을 사용하고 초기 세팅한다.
// 2. println()으로 출력한 문구와 동일한 문구를 GUI로 가시화 하기 위해 JLabel을 사용한다.
// 3. 메소드를 추출해본다.
// 4. 수련 회고
//   -> 3번 요구사항인 '메소드를 추출해본다'의 이유를 달려고 하니 딱히 이유가 생각나지 않았다. 왜 메소드를 추출하냐?! 그저 아샬님이 해서?
//      이유(근거)가 명확하지 않은 관성적인 행동(메소드 추출)이 반복되고 있음을 인지했다. 메소드 추출의 이유를 공부해야겠다.
//      (분명 아샬님이 강의에서 얘기했을걸...? ;;)
//   -> 어제 유의하자고 생각했던 부분들을 놓치지 않아서 좋았다.
//      (1) 맨 마지막줄 한줄 남기기, (2) 추출한 메소드는 public으로 바꾸기, (3) 매 변경사항 발생 시 컴파일/실행 습관 들이기

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
