import javax.swing.*;
import java.awt.*;

public class MakaoBank {
  private Account account = new Account();

  private JFrame frame;
  private JPanel buttonsPanel;
  private JPanel contentPanel;

  public static void main(String[] args) {
    MakaoBank application = new MakaoBank();
    application.run();
  }

  public void run() {
    initFrame();
    initPanels();
    initButtons();

    showFrame();
  }

  public void initFrame() {
    frame = new JFrame("Makao Bank");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(350, 600);
    frame.setLocation(150, 150);
    frame.setLayout(new FlowLayout());
  }

  public void initPanels() {
    buttonsPanel = new JPanel();
    buttonsPanel.setLayout(new FlowLayout());
    frame.add(buttonsPanel);

    contentPanel = new JPanel();
    frame.add(contentPanel);
  }

  public void initButtons() {
    JButton amountButton = new JButton("잔액 확인");
    amountButton.addActionListener(event -> {
      AmountPanel amountPanel = new AmountPanel(account);
      showContentPanel(amountPanel);
    });
    buttonsPanel.add(amountButton);

    JButton transferButton = new JButton("송금");
    transferButton.addActionListener(event -> {
      TransferPanel transferPanel = new TransferPanel(account);
      showContentPanel(transferPanel);
    });
    buttonsPanel.add(transferButton);

    JButton transactionsButton = new JButton("거래내역 조회");
    transactionsButton.addActionListener(event -> {
      TransactionsPanel transactionsPanel = new TransactionsPanel(account);
      showContentPanel(transactionsPanel);
    });
    buttonsPanel.add(transactionsButton);
  }

  public void showContentPanel(JPanel panel) {
    contentPanel.removeAll();
    contentPanel.add(panel);
    contentPanel.setVisible(false);
    contentPanel.setVisible(true);
  }

  public void showFrame() {
    frame.setVisible(true);
  }
}
