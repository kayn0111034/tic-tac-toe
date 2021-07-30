
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;


    public class TicTacToeRemake implements ActionListener {


        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        JPanel buttonPanel = new JPanel();
        JButton[] buttonList = new JButton[9];
        boolean isPlayer1=true;
        //player 1 = x
        //player 2 = o

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
                buttonList[i].addActionListener(this);
            }
        }
        public static void main (String[]args){
            // TODO Auto-generated method stub
            new TicTacToeRemake();
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            for(int i=0;i<9;i++){
                if(e.getSource()==buttonList[i]){
                    if(isPlayer1==true){
                        buttonList[i].setText("X");
                        isPlayer1=false;
                    }
                    else{
                        buttonList[i].setText("O");
                        isPlayer1=true;
                    }
                }
            }
        }


        //first turn will be played by 'x' for now, will implement first turn options later
//        public void firstTurn(){
//
//        }

//        public void checkWin(){
//
//        }
//
//        public void xWon(int a,int b, int c){
//
//        }
//
//        public void oWon(int a,int b, int c){
//
//        }
    }

