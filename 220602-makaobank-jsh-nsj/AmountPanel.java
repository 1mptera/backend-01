import javax.swing.*;

public class AmountPanel extends JPanel{
    AmountPanel() {
        JLabel label = new JLabel();
        label.setText(MakaoBank.money + "won");
        this.add(label);
    }
}
