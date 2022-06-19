//MakaoBank 의 구성: 잔액 확인/송금/거래 내역 조회
//창 위편에는 각 기능 버튼이, 아래편에는 기능에 해당되는 패널이 위치함
//각 기능에 해당하는 버튼을 누르면 아래편의 패널이 해당 패널로 교체됨
//잔액 확인: 등록된 계좌의 잔액을 출력
//송금: 텍스트 창에 금액 입력 후 확인 버튼을 누르면 해당 금액만큼 등록된 계좌에서 잔액 차감
//거래 내역 조회:


import javax.swing.*;
import java.awt.*;

public class MakaoBank {
    private Account account;

    private JFrame frame;
    private JPanel buttonsPanel;
    private JPanel contentPanel;

    private JPanel amountPanel;
    private JPanel transferPanel;
    private JPanel transactionsPanel;

    private JButton amountButton;
    private JButton transferButton;
    private JButton transactionsButton;

    public void run() {
        this.account = new Account();

        initFrame();

        initButtonsPanel();
        initContentPanel();

        initButtons();

        frame.setVisible(true);
    }

    public void initFrame() {
        frame = new JFrame("Makao Bank");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        frame.setSize(350, 400);
    }

    public void initButtonsPanel() {
        buttonsPanel = new JPanel();
        buttonsPanel.setLayout(new FlowLayout());
        frame.add(buttonsPanel);
    }

    public void initContentPanel() {
        contentPanel = new JPanel();
        contentPanel.setLayout(new FlowLayout());
        frame.add(contentPanel);
    }

    public void initButtons() {
        amountButton = new JButton("잔액 확인");
        amountButton.addActionListener(event -> {
            amountPanel = new AmountPanel(account);
            contentPanel.removeAll();
            contentPanel.add(amountPanel);

            contentPanel.setVisible(false);
            contentPanel.setVisible(true);
            frame.setVisible(true);
        });
        buttonsPanel.add(amountButton);

        transferButton = new JButton("송금");
        transferButton.addActionListener(event -> {
            transferPanel = new TransferPanel(account);
            contentPanel.removeAll();
            contentPanel.add(transferPanel);

            contentPanel.setVisible(false);
            contentPanel.setVisible(true);
            frame.setVisible(true);
        });
        buttonsPanel.add(transferButton);

        transactionsButton = new JButton("거래 내역 조회");
        transactionsButton.addActionListener(event -> {
            transactionsPanel = new TransactionsPanel(account);
            contentPanel.removeAll();
            contentPanel.add(transactionsPanel);

            contentPanel.setVisible(false);
            contentPanel.setVisible(true);
            frame.setVisible(true);
        });
        buttonsPanel.add(transactionsButton);
    }

    public static void main(String[] args) {
        MakaoBank application = new MakaoBank();
        application.run();
    }
}
