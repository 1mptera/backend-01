import javax.swing.*;
import java.awt.*;
//3 buttons -> account , transfer , transaction
// -> 3 buttons -> 1 panel -> flowlayout  unnecessary
// frame =  3 buttons
// 3 buttons -> panel -> borderlayout.page start
//- >  pager
// button 1 -> panel 1
// button 2 -> panel 2
// button 3 -> panel 3
// button -> label, button , textfield  (build)
//

public class MakaoBank {
    private JFrame frame;
    private JPanel contentPanel;

    private JPanel transferPanel = new TransferPanel();
    private JPanel transactionsPanel = new TransactionsPanel();
    private JButton button1;
    private JButton button2;

    public static void main(String[] args) {
        MakaoBank application = new MakaoBank();
        application.run();
    }

    private void run() {
        frame = new JFrame("Makao Bank");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(new GridLayout(2, 1));

        JPanel panel = new JPanel();

        contentPanel = new JPanel();

        initAmountButton(panel);
        initTransferButton(panel);
        initTransactionsButton(panel);

        frame.add(panel, BorderLayout.PAGE_START);

        frame.setVisible(true);
    }

    private void initTransactionsButton(JPanel panel) {
        JButton button3 = new JButton("거래 내역");
        button1.addActionListener(event -> {
            JPanel transactionsPanel = new TransactionsPanel();

        });
        panel.add(button3);
    }

    private void initTransferButton(JPanel panel) {
        button2 = new JButton("송금");
        button1.addActionListener(event -> {
            JPanel transferPanel = new TransferPanel();

        });
        panel.add(button2);
    }

    private void initAmountButton(JPanel panel) {
        button1 = new JButton("잔액 조회");
        button1.addActionListener(event -> {
            JPanel amountPanel = new AmountPanel();
            contentPanel.add(amountPanel);
            frame.add(contentPanel);
            frame.setVisible(true);
        });
        panel.add(button1);
    }
}
