import javax.swing.*;
import java.awt.*;

// 1. static main, non-static run
// 2. 마카오뱅크 프로그램을 GUI로 구현하기 위해 JFrame 설정 및 기본 세팅
// 3. 패널을 만들고 그 안에 3개의 버튼(잔액 조회, 송금, 거래내역) 만듦
// 4. 각 버튼을 누르면 해당 버튼에 대한 내용이 컨텐트 패널에서 변경되며 출력될 수 있도록 함
// 5. 각각의 버튼에 대한 컨텐트 패널 제작
// 6. 잔액 관리를 할 수 있는 Account 생성

public class MakaoBank {
  private JFrame frame;
  private JPanel contentPanel;
  private Account account;

  public static void main(String[] args) {
    MakaoBank application = new MakaoBank();
    application.run();
  }

  public void run() {
    account = new Account();

    frame = new JFrame();
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
    panel.add(createTransactionsButton());
  }

  public JButton createAmountButton() {
    JButton button = new JButton("잔액 조회");
    button.addActionListener(event -> {
      AmountPanel amountPanel = new AmountPanel(account);

      showContentPanel(amountPanel);
    });
    return button;
  }

  public JButton createTransferButton() {
    JButton button = new JButton("송금");
    button.addActionListener(event -> {
      TransferPanel transferPanel = new TransferPanel(account);

      showContentPanel(transferPanel);
    });
    return button;
  }

  public JButton createTransactionsButton() {
    JButton button = new JButton("거래 내역");
    button.addActionListener(event -> {
      TransactionsPanel transactionsPanel = new TransactionsPanel(account);

      showContentPanel(transactionsPanel);
    });
    return button;
  }

  public void initContentPanel() {
    contentPanel = new JPanel();
    frame.add(contentPanel);
  }

  public void showContentPanel(JPanel panel) {
    contentPanel.removeAll();
    contentPanel.add(panel);

    contentPanel.setVisible(false);
    contentPanel.setVisible(true);

    frame.setVisible(true);
  }
}
