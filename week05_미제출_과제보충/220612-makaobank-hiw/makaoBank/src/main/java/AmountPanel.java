import javax.swing.*;

public class AmountPanel extends JPanel {
  AmountPanel(Account account) {
    JLabel label = new JLabel("잔액: " + account.getAmount() + "원");
    this.add(label);
  }
}
