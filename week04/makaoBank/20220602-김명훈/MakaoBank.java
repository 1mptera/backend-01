import javax.swing.*;
import java.awt.*;

public class MakaoBank {
  private JFrame frame;

  public static void main(String[] args) {
    MakaoBank application = new MakaoBank();
    application.run();
  }


  public void run() {
    frame = new JFrame("Makao Bank");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(500, 600);

    initMenu();

    frame.setVisible(true);
  }

  public void initMenu() {
    JPanel panel = new JPanel();
    panel.setLayout(new FlowLayout());
    frame.add(panel);
    panel.add(createAmountButton());
    panel.add(createTransferButton());
    panel.add(createTransactionsButton());
//    panel.add(new JButton("송금"));
//    panel.add(new JButton("거래 내역"));


  }

  private JButton createAmountButton() {
    JButton button = new JButton("잔액확인");
    button.addActionListener(event -> {

    });
    return button;
  }
}
