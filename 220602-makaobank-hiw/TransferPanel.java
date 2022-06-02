import javax.swing.*;
import java.awt.*;

public class TransferPanel extends JPanel {
    private Account account;

    private JTextField textField;

    TransferPanel(Account createdAccount) {
        this.account = createdAccount;

        this.setLayout(new GridLayout(3, 1));

        JLabel label = new JLabel("송금액을 입력하세요");
        this.add(label);

        textField = new JTextField(15);
        this.add(textField);

        JButton button = new JButton("확인");
        button.addActionListener(event -> {
            account.transfer(Long.parseLong(textField.getText()));
        });
        this.add(button);
    }
}
