
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
        boolean win=false;


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
                    checkWin();
                }
            }
        }


        //first turn will be played by 'x' for now, will implement first turn options later
//        public void firstTurn(){
//
//        }

        public void checkWin(){
            //check if a player won
            for(int i=0;i<8;i++) {
                String winLine=null;
                switch (i) {
                    case 0:
                        winLine = buttonList[0].getText() + buttonList[1].getText() + buttonList[2].getText();
                        break;
                    case 1:
                        winLine = buttonList[3].getText() + buttonList[4].getText() + buttonList[5].getText();
                        break;
                    case 2:
                        winLine = buttonList[6].getText() + buttonList[7].getText() + buttonList[8].getText();
                        break;
                    case 3:
                        winLine = buttonList[0].getText() + buttonList[3].getText() + buttonList[6].getText();
                        break;
                    case 4:
                        winLine = buttonList[1].getText() + buttonList[4].getText() + buttonList[7].getText();
                        break;
                    case 5:
                        winLine = buttonList[2].getText() + buttonList[5].getText() + buttonList[8].getText();
                        break;
                    case 6:
                        winLine = buttonList[0].getText() + buttonList[4].getText() + buttonList[8].getText();
                        break;
                    case 7:
                        winLine = buttonList[2].getText() + buttonList[4].getText() + buttonList[6].getText();
                        break;
                }

                if(winLine.equals("XXX")){
                    System.out.print("Player X won!");
                }
                if(winLine.equals("OOO")){
                    System.out.print("Player O won!");
                }
            }



        }


        //if x wins, direct to play again page which says player x won
//        public void xWon(){
//
//        }
        //if o wins, direct to play again page which says player o won
//        public void oWon(){
//
//        }
    }

