import javax.swing.*;
import java.awt.*;

public class TransferPanel extends JPanel {
    private Account account;

    TransferPanel(Account currentAccount) {
        this.account = currentAccount;
        this.setLayout(new GridLayout(2, 1));

        JTextField textField = new JTextField(10);
        this.add(textField);

        JButton button = new JButton("송금하기");
        button.addActionListener(event -> {
            // 송금하기 버튼을 눌렀을때 기존에 있던 잔액에서 텍스트필드에 입력한 금액만큼 잔액에서
            // 차감을 해준다.
            account.transfer(Long.parseLong(textField.getText()));
        });
        this.add(button);
    }
}