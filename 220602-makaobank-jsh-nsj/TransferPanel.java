import javax.swing.*;
import java.awt.*;

public class TransferPanel extends JPanel {
    private final JTextField textField;

    TransferPanel() {
         textField = new JTextField(10);
        textField.getText();
        this.add(textField);

        JButton button = new JButton("송금하기");
        this.add(button);
        button.addActionListener(event -> { // 금액을 하고 버튼을 누르면 잔액조회에 입력한만큼 값이 뺴져야하고 거래 내역에 입력한 값이 나오와함
            MakaoBank.money -= Long.parseLong(textField.getText());
        });
    }
}
