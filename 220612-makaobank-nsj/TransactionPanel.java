import javax.swing.*;
import java.awt.*;

public class TransactionPanel extends JPanel {
  TransactionPanel(Account account) {
    this.setLayout(new GridLayout(1 + account.getTransactionsSize(), 1));

    this.add(new JLabel("거래 내역"));

    for(String transaction : account.getTransactions()) {
      this.add(new JLabel(transaction));
    }
  }
}
