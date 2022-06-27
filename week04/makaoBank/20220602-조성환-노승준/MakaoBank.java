// main run
// 메뉴버튼 송금, 잔액조회, 거래내역을 만들기 위해, JButton

import javax.swing.*;
import java.awt.*;

public class MakaoBank {
    private JFrame frame;
    private JPanel contentPanel;
    public static long money = 1000;

    public static void main(String[] args) {
        MakaoBank application = new MakaoBank();
        application.run();

    }

    private void run() {
        frame = new JFrame("MakaoBank");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 600);

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
        panel.add(cretaeTransactionsButton());
    }

    public JButton createAmountButton() {
        JButton button = new JButton("잔액 조회");
        button.addActionListener(event -> {
            JPanel amountPanel = new AmountPanel();
            showContentPanel(amountPanel);
        });
        return button;
    }

    private JButton createTransferButton() {
        JButton button = new JButton("송금");
        button.addActionListener(event -> {
            JPanel TransferPanel = new TransferPanel();
            showContentPanel(TransferPanel);
        });
        return button;
    }

    private JButton cretaeTransactionsButton() {
        JButton button = new JButton("거래내역");
        button.addActionListener(event -> {
            JPanel transactionsPanel = new TransactionsPanel();
            showContentPanel(transactionsPanel);
        });
        return button;

    }

    private void showContentPanel(JPanel amountPanel) {
        contentPanel.removeAll();
        contentPanel.add(amountPanel);
        contentPanel.setVisible(false);
        contentPanel.setVisible(true);
        frame.setVisible(true);
    }

    public void initContentPanel() {
        contentPanel = new JPanel();
        frame.add(contentPanel);
    }
}
