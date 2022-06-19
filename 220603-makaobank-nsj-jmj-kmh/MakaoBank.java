// 0. 스태틱 메인, 논스태틱 런
// 1. Swing -> windows setting
// button 3 make
// 버튼을 눌렀을때 안에 내용이 잘 나오게 한다.
// contentPanel

import javax.swing.*;
import java.awt.*;

public class MakaoBank {
    private Account account = new Account();
    private JFrame frame;
    private JPanel contentPanel;

    public static void main(String[] args) {
        MakaoBank application = new MakaoBank();
        application.run();
    }

    public void run() {
        frame = new JFrame("Makao Bank");
        frame.setSize(500, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        initMenu();
        initContentPanel();

        frame.setVisible(true);
    }

    public void initMenu() {
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        frame.add(panel, BorderLayout.PAGE_START);

        panel.add(createAmountButton());
        panel.add(createTransferButton());
        panel.add(createTransactionsButton());
    }

    public JButton createAmountButton() {
        JButton button = new JButton("잔액 조회");
        button.addActionListener(event -> {
            JPanel amountPanel = new AmountPanel(account);
            showContentPanel(amountPanel);
        });
        return button;
    }

    private JButton createTransferButton() {
        JButton button = new JButton("송금");
        button.addActionListener(event -> {
            JPanel transferPanel = new TransferPanel(account);
            showContentPanel(transferPanel);
        });
        return button;
    }

    private JButton createTransactionsButton() {
        JButton button = new JButton("거래 내역");
        button.addActionListener(event -> {
            JPanel transactionsPanel = new TransactionsPanel();
            showContentPanel(transactionsPanel);
        });
        return button;
    }

    public void initContentPanel() {
        contentPanel = new JPanel();
        frame.add(contentPanel);
    }

    public void showContentPanel(JPanel amountPanel) {
        contentPanel.removeAll();
        contentPanel.add(amountPanel);
        contentPanel.setVisible(false);
        contentPanel.setVisible(true);
        frame.setVisible(true);
    }
}
