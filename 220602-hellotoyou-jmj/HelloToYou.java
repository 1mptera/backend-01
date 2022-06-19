// 0. static main method, non-static run method를 각각 선언해준다.
// 1. 구현하려고 하는 기능(이름을 입력받아 확인 버튼을 누르면 "Hello, 입력한 이름!" 이라는 문구를 GUI로 구현하기 위해 기본 틀이 되는 JFrame 세팅
// 2. 윈도우 프레임 내에 기본 문구를 출력하기 위하여 JLabel 사용
//   -> 해당 문구의 초기값은 "Hello, World!" 이나 추후 이름을 입력받을 수 있는 시점에서는 입력 버튼을 누르면 "Hello, 입력받은 이름!" 문구 출력
// 3. 이름을 입력받기 위해서 JTextField 사용
//   -> textField가 기존 label을 덮어쓰는(?) 상황이 발생하므로 프레임 자체의 레이아웃 조절을 통하여 해결
// 4. 입력받은 이름을 'World'에 대입시키는 동작을 생성하기 위해 JButton 활용, 적절한 기능 추가해줌
// 5. 수련 회고
//   -> 메인 메서드가 static인 이유, 내가 따로 선언하는 run 메서드가 non-static인 이유, 추출한 메서드를 private->public으로 바꿔주는 이유
//      위 내용들에 대해 아직 명확하게 인지가 되지 않았다. (위와 같이 하는 이유에 대하여 나의 언어로 명확히 기술할 수 없었음)
//      따로 기억해 두었다가 이해할 수 있는 시점이 올 때 놓치지 말고 인지하기
//   -> frame.setVisible(); 의 위치가 어디여야 적절할까? 모~든 코드 마지막? 아니면 frame 세팅단계의 마지막?
//      위 명령어 아래로 JLabel을 선언하고 문구를 입력했더니 화면에 문구 출력되지 않음. 아마 코드 마지막으로 들어가는게 적절할 것으로 보임
//   -> JButton의 Lambda 내부 코드 작성이 항상 어려움(Hellotoyou, Calculator 등)
//      for문 관련 블로그 글 썼던 것 처럼 4주차 과제 예시를 가지고 람다 공부해야할 듯...
//   -> 코드작성 시 한 칸 띄우는 것을 어디에다 해야할지 헷갈린다. 46번줄, 48번줄 코드도 서로 붙여놓은 다음, 통으로 한 칸을 띄워주는게 더 나을까..?

import javax.swing.*;
import java.awt.*;

public class HelloToYou {
    private String name = "World";

    public static void main(String[] args) {
        HelloToYou application = new HelloToYou();
        application.run();
    }

    public void run() {
        JFrame frame = new JFrame("Hello to you");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        frame.setSize(400, 300);

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
