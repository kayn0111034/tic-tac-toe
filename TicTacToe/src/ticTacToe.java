import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class ticTacToe implements ActionListener{
	
	private int count=0;
	//private JLabel label;
	private JFrame frame;
	private JPanel panel;
	JButton button1= new JButton();
	JButton button2= new JButton();
	JButton button3= new JButton();
	JButton button4= new JButton();
	JButton button5= new JButton();
	JButton button6= new JButton();
	JButton button7= new JButton();
	JButton button8= new JButton();
	JButton button9= new JButton();
	
	boolean user=true;
	
	public ticTacToe() {
		frame= new JFrame();
		panel= new JPanel();
		//label= new JLabel("Num of Clicks:0");
		//frame.pack();
		frame.setPreferredSize(new Dimension(400,400));
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
		button5.addActionListener(this);
		button6.addActionListener(this);
		button7.addActionListener(this);
		button8.addActionListener(this);
		button9.addActionListener(this);
		
		panel.setBorder(BorderFactory.createLineBorder(Color.black));
		panel.setLayout(new GridLayout(3,3));
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		panel.add(button5);
		panel.add(button6);
		panel.add(button7);
		panel.add(button8);
		panel.add(button9);
		//panel.add(label);
		
		
		frame.add(panel, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Tic Tac Toe");
		frame.pack();
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ticTacToe();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		//count+=1;
		//label.setText("Number of clicks: "+count);
		//optimise this later
		if(e.getSource()==button1 && user==true) {
			button1.setText("X");
			user=false;
		}else if(e.getSource()==button1 && user==false){
			button1.setText("O");
			user=true;
		}else if(e.getSource()==button2 && user==true){
			button2.setText("X");
			user=false;
		}else if(e.getSource()==button2 && user==false){
			button2.setText("O");
			user=true;
		}else if(e.getSource()==button3 && user==true){
			button3.setText("X");
			user=false;
		}else if(e.getSource()==button3 && user==false){
			button3.setText("O");
			user=true;
		}else if(e.getSource()==button4 && user==true){
			button4.setText("X");
			user=false;
		}else if(e.getSource()==button4 && user==false){
			button4.setText("O");
			user=true;
		}else if(e.getSource()==button5 && user==true){
			button5.setText("X");
			user=false;
		}else if(e.getSource()==button5 && user==false){
			button5.setText("O");
			user=true;
		}else if(e.getSource()==button6 && user==true){
			button6.setText("X");
			user=false;
		}else if(e.getSource()==button6 && user==false){
			button6.setText("O");
			user=true;
		}else if(e.getSource()==button7 && user==true){
			button7.setText("X");
			user=false;
		}else if(e.getSource()==button7 && user==false){
			button7.setText("O");
			user=true;
		}else if(e.getSource()==button8 && user==true){
			button8.setText("X");
			user=false;
		}else if(e.getSource()==button8 && user==false){
			button8.setText("O");
			user=true;
		}else if(e.getSource()==button9 && user==true){
			button9.setText("X");
			user=false;
		}else if(e.getSource()==button9 && user==false){
			button9.setText("O");
			user=true;
		}
	}
}
