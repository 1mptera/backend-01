import javax.swing.*;

public class TransactionsPanel extends JPanel {
    private Account account;

    TransactionsPanel(Account createdAccount) {
        this.account = createdAccount;

        JLabel label = new JLabel("거래 내역 확인");
        this.add(label);
    }
}
