import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameBoard extends JFrame {

    //Array of buttons which makes up the game board
    private TButton[] buttons = new TButton[9];
    private int roundCounter;
    private Boolean player;
    
    public int getRoundCounter() {
        return roundCounter;
    };
    public void incrementRoundCounter() {
        roundCounter++;
    }
    public Boolean getPlayer() { return player; }
    public void setPlayer(Boolean player) { this.player = player; }

    //Creates the main panel for the game. A grid of buttons (buttons array)
    public JPanel createGameBoard(GameBoard gameBoard) {
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 3));

        for (int i = 0; i < 9; i++) {
            buttons[i] = new TButton(i, "-");
            buttons[i].addActionListener(new TurnListener(gameBoard, buttons[i]));
            panel.add(buttons[i]);
        }

        return panel;
    }


    //JFrame Constructor
    public GameBoard() {

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(750, 750);
        this.setLocationRelativeTo(null);
        this.setResizable(true);
        this.roundCounter = 0;
        this.player = true;

        this.add(createGameBoard(this));

        this.setVisible(true);

    }



    public class TurnListener implements ActionListener {

        private GameBoard gameBoard;
        private TButton button;

        public TurnListener(GameBoard gameBoard, TButton button) {

            this.gameBoard = gameBoard;
            this.button = button;

        }

        //Game Logic. On click, checks current player and sets the square accordingly.
        //Increments round counter and ends the game after 9 rounds (9 squares)
        @Override
        public void actionPerformed(ActionEvent e) {
            if(this.gameBoard.getPlayer()) {
                button.setText("X");
                gameBoard.setPlayer(false);
            } else {
                button.setText("O");
                gameBoard.setPlayer(true);
            }

            this.gameBoard.incrementRoundCounter();

            if(this.gameBoard.getRoundCounter() > 9) {
                this.gameBoard.dispose();
            }
        }
    }

    public class TButton extends JButton {

        private int id;

        public int getId() {
            return id;
        }
        public void setID(int id) {
            this.id = id;
        }

        public TButton(int id, String text) {

            this.id = id;
            this.setText(text);

        }

    }

    public Boolean checkWinner(TButton button, TButton[] buttons) {

        int buttonID = button.getId();
        switch(buttonID) {
            case 0:
                for (int i = 0; i < 9; i++) {
                    if(buttons[i].getText().equals("-")) {
                        break;
                    }
                }
                return true;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
        }
        return false;
    }




}
