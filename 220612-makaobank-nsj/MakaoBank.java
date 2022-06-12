import javax.swing.*;
import java.awt.*;

public class MakaoBank {
  private JFrame frame;
  private JPanel contentPanel;

  public static void main(String[] args) {
    MakaoBank application = new MakaoBank();
    application.run();
  }

  public void run() {
    frame = new JFrame("Makao Bank");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(500,600);

    initMenu();
    initContentPanel();

    frame.setVisible(true);
  }

  public void initMenu() {
    JPanel panel = new JPanel();
    panel.setLayout(new FlowLayout());
    frame.add(panel, BorderLayout.PAGE_START);

    panel.add(creatAmountButton());
    panel.add(createTransferButton());
    panel.add(createTransactionButton());
  }

  public JButton creatAmountButton() {
    JButton button = new JButton("잔액 조회");
    button.addActionListener(event -> {
      JPanel amountPanel = new AmountPanel();
      showContentPanel(amountPanel);
    });
    return button;
  }

  public JButton createTransferButton() {
    JButton button = new JButton("송금");
    button.addActionListener(event -> {
      JPanel transferPanel = new TransferPanel();
      showContentPanel(transferPanel);
    });
    return button;
  }

  public JButton createTransactionButton() {
    JButton button = new JButton("거래 내역");
    button.addActionListener(event -> {
      JPanel transactionsPanel = new TransactionPanel();
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
    frame.setVisible(true);
  }
}
