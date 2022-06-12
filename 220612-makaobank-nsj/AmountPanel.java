import javax.swing.*;
import java.awt.*;

public class AmountPanel extends JPanel {
  private final Account account;
  AmountPanel(Account account) {
    this.account = account;

    setLayout(new GridLayout(2, 1));

    this.add(new JLabel(accountNumber()));
    this.add(new JLabel(amount()));
  }

  private String amount() {
    return "잔액: " + account.getAmount() + "원";
  }

  private String accountNumber() {
    return "계좌번호: " + account.getNumber();
  }

}
