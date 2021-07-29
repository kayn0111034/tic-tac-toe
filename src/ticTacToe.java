import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;

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
	public static JButton button1= new JButton();
	public static JButton button2= new JButton();
	public static JButton button3= new JButton();
	public static JButton button4= new JButton();
	public static JButton button5= new JButton();
	public static JButton button6= new JButton();
	public static JButton button7= new JButton();
	public static JButton button8= new JButton();
	public static JButton button9= new JButton();
	
	boolean user=true;
	public enum buttons
	{
		but1,but2,but3,but4,but5,but6,but7,but8,but9;
	}
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
		
		EnumMap<buttons, JButton> buttonMap = new EnumMap<buttons, JButton>(buttons.class);
		buttonMap.put(buttons.but1, button1);
		buttonMap.put(buttons.but2, button2);
		buttonMap.put(buttons.but3, button3);
		buttonMap.put(buttons.but4, button4);
		buttonMap.put(buttons.but5, button5);
		buttonMap.put(buttons.but6, button6);
		buttonMap.put(buttons.but7, button7);
		buttonMap.put(buttons.but8, button8);
		buttonMap.put(buttons.but9, button9);
		
	    //HashMap<Integer,JButton> unmodifiableButtonMap = (HashMap<Integer, JButton>) Collections.unmodifiableMap(buttonMap);  
	}
	 //HashMap doesn't get called in other classes
	 
//	public static void buttonhashmap(String[] args){
//		HashMap<JButton, Integer> buttonMap = new HashMap<JButton, Integer>();
//		buttonMap.put(button1, 1);
//	    buttonMap.put(button2, 2);
//	    buttonMap.put(button3, 3);
//	    buttonMap.put(button4, 4);
//	    buttonMap.put(button5, 5);
//	    buttonMap.put(button6, 6);
//	    buttonMap.put(button7, 7);
//	    buttonMap.put(button8, 8);
//	    buttonMap.put(button9, 9);
	    //System.out.println(buttonMap);
//	}

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
		
		//switch case doesnt have info from buttonMap
//		switch(buttonMap.getKey()) { 
//			case 1:
//		}
		
		
		if(e.getSource()==button1 && user==true) {
			button1.setText("X");
			user=false;
//			System.out.println(buttonMap)
			//System.out.println(buttonMap)
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
