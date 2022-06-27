import javax.swing.*;
import java.awt.*;

public class AmountPanel extends JPanel {
    AmountPanel(Account account) {
        setLayout(new GridLayout(2, 1));

        JLabel label1 = new JLabel("계좌번호: " + account.getAccountNumber());
        this.add(label1);

        JLabel label2 = new JLabel("잔액 :" + account.getAmount() + "원");
        this.add(label2);
    }

}
