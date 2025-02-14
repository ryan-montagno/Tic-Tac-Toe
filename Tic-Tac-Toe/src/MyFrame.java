import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {


    private Square[] squares = new Square[9];

    @Override
    public void actionPerformed(ActionEvent e) {
    }

    public MyFrame() {

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(750, 750);
        this.setLocationRelativeTo(null);
        this.setResizable(true);
        this.setLayout(new GridLayout(3, 3));

        for (int i = 0; i < 9; i++) {
            squares[i] = new Square();
            squares[i].addActionListener(this);
            this.add(squares[i]);
        }

        this.setVisible(true);

    }



}
