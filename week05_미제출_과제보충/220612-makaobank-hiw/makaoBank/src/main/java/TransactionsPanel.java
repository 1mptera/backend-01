import javax.swing.*;
import java.awt.*;
import java.util.List;

public class TransactionsPanel extends JPanel {
  TransactionsPanel(Account account) {
    List<String> transactionsList = account.getTransactionsList();

    this.setLayout(new GridLayout(transactionsList.size(), 1));

    for (String transaction : transactionsList) {
      JLabel label = new JLabel(transaction);
      this.add(label);
    }
  }
}
