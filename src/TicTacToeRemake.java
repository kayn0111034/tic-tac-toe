
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;


    public class TicTacToeRemake implements ActionListener {


        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        JPanel buttonPanel = new JPanel();
        JButton[] buttonList = new JButton[9];
        boolean player1 = true;

        TicTacToeRemake() {

            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400,400);
            //frame.setPreferredSize(new Dimension(400, 400));
            panel.setBorder(BorderFactory.createLineBorder(Color.black));
            panel.setLayout(new GridLayout(3, 3));
            frame.add(panel, BorderLayout.CENTER);
            frame.setTitle("Tic Tac Toe Remake");
            //frame.pack();
            frame.setVisible(true);


            for(int i=0;i<9;i++){
                buttonList[i]=new JButton();
                panel.add(buttonList[i]);
            }
        }
        public static void main (String[]args){
            // TODO Auto-generated method stub
            new TicTacToeRemake();
        }

        @Override
        public void actionPerformed(ActionEvent e) {

        }
    }

