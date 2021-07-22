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
	private JLabel label;
	private JFrame frame;
	private JPanel panel;
	
	public ticTacToe() {
		frame= new JFrame();
		panel= new JPanel();
		//frame.pack();
		frame.setPreferredSize(new Dimension(400,400));
		JButton button1= new JButton("Hello World");
		button1.addActionListener(this);
		JButton button2= new JButton("Hello World");
		button2.addActionListener(this);
		JButton button3= new JButton("Hello World");
		button3.addActionListener(this);
		JButton button4= new JButton("Hello World");
		button4.addActionListener(this);
		JButton button5= new JButton("Hello World");
		button5.addActionListener(this);
		JButton button6= new JButton("Hello World");
		button6.addActionListener(this);
		JButton button7= new JButton("Hello World");
		button7.addActionListener(this);
		JButton button8= new JButton("Hello World");
		button8.addActionListener(this);
		JButton button9= new JButton("Hello World");
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
		frame.setTitle("Hello World");
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
	}

}
