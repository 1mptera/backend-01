import javax.swing.*;
import java.awt.*;

public class TransactionsPanel extends JPanel {
  TransactionsPanel(Account account) {
    this.setLayout(new GridLayout(1 + account.transactionSize(), 1));

    JLabel titleLabel = new JLabel("거래 내역");
    this.add(titleLabel);

    for (String transaction : account.transactions()) {
      JLabel label = new JLabel(transaction);
      this.add(label);
    }
  }
}
