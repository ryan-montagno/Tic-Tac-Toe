import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Square extends JButton implements ActionListener {

    public Square() {
        this.setText("X");
        this.setBackground(Color.lightGray);
        this.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.setText("O");
    }
}
