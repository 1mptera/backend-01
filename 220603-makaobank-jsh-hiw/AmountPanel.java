import javax.swing.*;

public class AmountPanel extends JPanel {
    private Account account;

    AmountPanel(Account currentAccount) {
        this.account = currentAccount;

        JLabel label = new JLabel("잔액: " + account.getAmount() + "원");

        this.add(label);
    }
}
