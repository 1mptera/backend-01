import javax.swing.*;

public class AmountPanel extends JPanel {
    private Account account;

    AmountPanel(Account account) {
        JLabel label = new JLabel("잔액 : 10000원");

        this.add(label);
    }
}
