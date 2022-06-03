// 짝 프로그래밍 상호 합의사항
// 각 코드들의 원활한 이해를 위해 주석을 달아주자
// 코드를 작성하면서 주기적으로 진행 방향을 확인하고 서로 일치시킨다.
//
//마카오뱅크 간단한 기능이 있는 은행앱만들기
// 송금 , 잔액조회, 거래내역 기능추가
// 잔액조회를 누르면 금액을 보여줌
// 송금을 하면 송금하기 버튼이랑 금액을 입력할 수 있는 Textfield창을 만들고 송금금액만큼 잔액에서 차감을 해야함
// 거래내역보기를 누르면 그때까지의 송금 내역을 보여줌
//
// Swing 구성
// 프레임
// 패널이 두개: 상단 패널에는 송금, 잔액조회, 거래내역보기 버튼이 읶소
// 아래 패널은 버튼을 눌렀을 때 원래 있던 패널을 지우고 해당 기능 패널을 만들어서 띄움

import javax.swing.*;
import java.awt.*;

public class MakaoBank {
    private JFrame frame;
    private JPanel contentPanel;
    private JPanel buttonsPanel;
    private Account account = new Account();

    public static void main(String[] args) {
        MakaoBank application = new MakaoBank();        //MakaoBank 객체 생성 런 메소드로 실행되는 객체분리
        application.run();


    }

    public void run() {
        frame = new JFrame("MakaoBank"); // 마카오뱅크 창을 만들어주자
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // x키를 누르면 프로그램이 종료됨
        frame.setLayout(new FlowLayout());
        frame.setSize(350, 600);

        initMenu();
        initContentPanel();
        frame.setVisible(true);


    }

    public void initMenu() {
        //버튼 패널 생성
        buttonsPanel = new JPanel();
        buttonsPanel.setLayout(new FlowLayout());// 패널내부에 레이아웃 설정
        frame.add(buttonsPanel); // 프레임에 메뉴패널을 더해줬다.

        // 버튼을 생성해서 패널에 추가함.
        buttonsPanel.add(createAmountButton()); // 버튼을 생성하는 방법을 메서드로 분리함 왜 why 각각 기능이 다르기 떄문에 관심사의 분리리
        buttonsPanel.add(createTransferButton());
        buttonsPanel.add(createTransactionsButton());
    }

    public void initContentPanel() {
        contentPanel = new JPanel();  //컨텐츠가 들어가기 위한 패널 생성.
        frame.add(contentPanel); // 프레임에 컨텐츠패널을 추가.
    }



    public JButton createAmountButton() {
        JButton button = new JButton("잔액조회");  // 잔액조회버튼 생성
        button.addActionListener(event -> {      // 잔액조회버튼을 눌렀을때 프로그램이 할 행동은
            AmountPanel amountPanel = new AmountPanel(account);    //컨텐트패널에 추가될 어마운트패널을 생성
            contentPanel.removeAll();
            contentPanel.add(amountPanel);   //컨텐트 패널에 추가
            contentPanel.setVisible(false);
            contentPanel.setVisible(true);

        });
        return button;
    }

    public JButton createTransferButton() {
        JButton button = new JButton("송금");
        button.addActionListener(event -> {
            TransferPanel transferPanel = new TransferPanel(account);    //컨텐트패널에 추가될 어마운트패널을 생성
            contentPanel.removeAll();
            contentPanel.add(transferPanel);   //컨텐트 패널에 추가
            contentPanel.setVisible(false);
            contentPanel.setVisible(true);

        });
        return button;
    }

    public JButton createTransactionsButton() {
        JButton button = new JButton("거래내역");
        button.addActionListener(event -> {

        });
        return button;
    }
}
