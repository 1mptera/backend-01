import javax.swing.*;
import java.awt.*;

public class TransferPanel extends JPanel {
  TransferPanel(Account account) {
    this.setLayout(new FlowLayout());

    JTextField textField = new JTextField(15);
    this.add(textField);

    JButton button = new JButton("송금하기");
    button.addActionListener(event -> {
      long transferredAmount = Integer.parseInt(textField.getText());
      account.transfer(transferredAmount);
    });
    this.add(button);
  }
}
