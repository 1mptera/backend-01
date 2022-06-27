import javax.swing.*;

public class AmountPanel extends JPanel {
    private Account account;

    AmountPanel(Account createdAccount) {
        this.account = createdAccount;

        JLabel label = new JLabel("잔액: " + account.getAmount() + "원");
        this.add(label);
    }
}
