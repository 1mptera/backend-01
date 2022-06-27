import javax.swing.*;
import java.awt.*;
import java.util.List;

public class TransactionsPanel extends JPanel {
    private Account account;

    TransactionsPanel(Account currentAccount) {
        this.account = currentAccount;

        // 송금 한 기록이 나오게 거래내역이 저장되 있어야 함 금
        // 저장한 걸 출력
        List<String> currentTransactions = account.getTransactions();
        this.setLayout(new GridLayout(currentTransactions.size(), 1));

        for (String currentTransaction : currentTransactions) {
            JLabel label = new JLabel(currentTransaction);
            this.add(label);
        }

    }

}
