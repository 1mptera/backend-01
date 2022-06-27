import javax.swing.*;
import java.awt.*;

public class AmountPanel extends JPanel {
    AmountPanel() {
        JLabel label = new JLabel("잔액: "+ getAmount() +  "원");
        this.add(label, BorderLayout.AFTER_LINE_ENDS);
    }

    private long getAmount() {
        return 1000;
    }
}
