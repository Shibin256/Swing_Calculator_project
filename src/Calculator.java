import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calculator implements ActionListener{
	
			boolean isoperatorcliked=false;
			String oldvalue;
			int check;
			JFrame jf;
			JLabel displayLabel;
			JButton sevenButton,piButton;
			JButton eightButton,nineButton;
			JButton fourButton,fiveButton,sixButton,oneButton,twoButton;
			JButton threeButton,dotButton,zeroButton,equaltoButton,backButton;
			JButton addButton,substractionButton,multiButton,doublezeroButton,divisionButton,clearButton,persentageButton;
		
			
			
			
			
			public Calculator() {
			
			jf=new JFrame("Calculator");
			jf.setLayout(null);
			jf.setSize(450, 620);
			jf.setLocation(200, 10);
			
			displayLabel=new JLabel(""+"");
			displayLabel.setBounds(30, 50, 400, 60);
			displayLabel.setBackground(Color.GRAY);
			displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
			displayLabel.setOpaque(true);
			displayLabel.setForeground(Color.white);
			jf.add(displayLabel);
			
			sevenButton=new JButton("7");
			sevenButton.setBounds(30,130,80,80);
			sevenButton.addActionListener(this);
			sevenButton.setFont(new Font("Arial",Font.PLAIN, 40));
			jf.add(sevenButton);
			
			
			eightButton=new JButton("8");
			eightButton.setBounds(120,130,80,80);
			eightButton.addActionListener(this);
			eightButton.setFont(new Font("Arial",Font.PLAIN, 40));
			jf.add(eightButton);
			
			
			nineButton=new JButton("9");
			nineButton.setBounds(210,130,80,80);
			nineButton.addActionListener(this);
			nineButton.setFont(new Font("Arial",Font.PLAIN, 40));
			jf.add(nineButton);
			
			
			fourButton=new JButton("4");
			fourButton.setBounds(30,220,80,80);
			fourButton.addActionListener(this);
			fourButton.setFont(new Font("Arial",Font.PLAIN, 40));
			jf.add(fourButton);
			
			
			fiveButton=new JButton("5");
			fiveButton.setBounds(120,220,80,80);
			fiveButton.addActionListener(this);
			fiveButton.setFont(new Font("Arial",Font.PLAIN, 40));
			jf.add(fiveButton);
			
			
			sixButton=new JButton("6");
			sixButton.setBounds(210,220,80,80);
			sixButton.addActionListener(this);
			sixButton.setFont(new Font("Arial",Font.PLAIN, 40));
			jf.add(sixButton);
			
			
			oneButton=new JButton("1");
			oneButton.setBounds(30,310,80,80);
			oneButton.addActionListener(this);
			oneButton.setFont(new Font("Arial",Font.PLAIN, 40));
			jf.add(oneButton);
			
			
			twoButton=new JButton("2");
			twoButton.setBounds(120,310,80,80);
			twoButton.addActionListener(this);
			twoButton.setFont(new Font("Arial",Font.PLAIN, 40));
			jf.add(twoButton);
			
			
			threeButton=new JButton("3");
			threeButton.setBounds(210,310,80,80);
			threeButton.addActionListener(this);
			threeButton.setFont(new Font("Arial",Font.PLAIN, 40));
			jf.add(threeButton);
			
			
			dotButton=new JButton(".");
			dotButton.setBounds(120,490,80,80);
			dotButton.addActionListener(this);
			dotButton.setFont(new Font("Arial",Font.PLAIN, 40));
			jf.add(dotButton);
			

			backButton=new JButton("back");
			backButton.setBounds(30,490,80,80);
			backButton.addActionListener(this);
			backButton.setFont(new Font("Arial",Font.PLAIN, 20));
			backButton.setBackground(Color.lightGray);
			jf.add(backButton);
			
			
			doublezeroButton=new JButton("00");
			doublezeroButton.setBounds(30,400,80,80);
			doublezeroButton.addActionListener(this);
			doublezeroButton.setFont(new Font("Arial",Font.PLAIN, 40));
			jf.add(doublezeroButton);
			
			
			zeroButton=new JButton("0");
			zeroButton.setBounds(120,400,80,80);
			zeroButton.addActionListener(this);
			zeroButton.setFont(new Font("Arial",Font.PLAIN, 40));
			jf.add(zeroButton);
			
			
		
			equaltoButton=new JButton("=");
			equaltoButton.setBounds(210,400,80,80);
			equaltoButton.addActionListener(this);
			equaltoButton.setFont(new Font("Arial",Font.PLAIN, 40));
			jf.add(equaltoButton);
			
			
			divisionButton=new JButton("/");
			divisionButton.setBounds(300,130,62,65);
			divisionButton.addActionListener(this);
			divisionButton.setFont(new Font("Arial",Font.PLAIN, 40));
			jf.add(divisionButton);
			
			
			multiButton=new JButton("X");
			multiButton.setBounds(300,208,62,62);
			multiButton.addActionListener(this);
			multiButton.setFont(new Font("Arial",Font.PLAIN, 40));
			jf.add(multiButton);
			
			
			substractionButton=new JButton("-");
			substractionButton.setBounds(300,283,62,62);
			substractionButton.addActionListener(this);
			substractionButton.setFont(new Font("Arial",Font.PLAIN, 40));
			jf.add(substractionButton);
			
			

			addButton=new JButton("+");
			addButton.setBounds(300,358,62,62);
			addButton.addActionListener(this);
			addButton.setFont(new Font("Arial",Font.PLAIN, 40));
			jf.add(addButton);
			
			clearButton=new JButton("c");
			clearButton.setBounds(210,490,80,80);
			clearButton.addActionListener(this);
			clearButton.setFont(new Font("Arial",Font.PLAIN, 40));
			clearButton.setBackground(Color.orange);
			jf.add(clearButton);
			
			persentageButton=new JButton("%");
			persentageButton.setBounds(300,433,62,62);
			persentageButton.addActionListener(this);
			persentageButton.setFont(new Font("Arial",Font.PLAIN, 30));
			jf.add(persentageButton);
			
			
			piButton=new JButton("π");
			piButton.setBounds(300,508,62,62);
			piButton.addActionListener(this);
			piButton.setFont(new Font("Arial",Font.PLAIN, 40));
			jf.add(piButton);
			
			
			
			
			
			
			
			jf.setVisible(true);
			jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
		public static void main(String ar[]){
			
			new Calculator();
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==sevenButton) { 
				if(isoperatorcliked){
					
					displayLabel.setFont(new Font("Arial",Font.PLAIN, 40));
					displayLabel.setText("7");
					
					isoperatorcliked=false;
				}
				else
				{
			
				displayLabel.setFont(new Font("Arial",Font.PLAIN, 40));
				displayLabel.setText(displayLabel.getText()+7);
				
				}
			}
			
			else if(e.getSource()==eightButton)
			{
				if(isoperatorcliked){
					
					displayLabel.setFont(new Font("Arial",Font.PLAIN, 40));
					displayLabel.setText("8");
					
					isoperatorcliked=false;
				}
				else
				{
			
				displayLabel.setFont(new Font("Arial",Font.PLAIN, 40));
				
				displayLabel.setText(displayLabel.getText()+8);
				
				}
			}
			
			
			else if(e.getSource()==nineButton)
			{
				if(isoperatorcliked){
					
					displayLabel.setFont(new Font("Arial",Font.PLAIN, 40));
					displayLabel.setText("9");
					
					isoperatorcliked=false;
				}
				else
				{
			
				displayLabel.setFont(new Font("Arial",Font.PLAIN, 40));
				
				displayLabel.setText(displayLabel.getText()+9);
							}
			}
			
			else if(e.getSource()==fourButton)
			{
				if(isoperatorcliked){
					
					displayLabel.setFont(new Font("Arial",Font.PLAIN, 40));
					displayLabel.setText("4");
					
					isoperatorcliked=false;
				}
				else
				{
			
				displayLabel.setFont(new Font("Arial",Font.PLAIN, 40));
				
				displayLabel.setText(displayLabel.getText()+4);
							}
			}
			
			else if(e.getSource()==fiveButton)
			{
				if(isoperatorcliked){
					
					displayLabel.setFont(new Font("Arial",Font.PLAIN, 40));
					displayLabel.setText("5");
					
					isoperatorcliked=false;
				}
				else
				{
			
				displayLabel.setFont(new Font("Arial",Font.PLAIN, 40));
				
				displayLabel.setText(displayLabel.getText()+5);
				
			}
			}
			
			else if(e.getSource()==sixButton)
			{
				if(isoperatorcliked){
					
					displayLabel.setFont(new Font("Arial",Font.PLAIN, 40));
					displayLabel.setText("6");
					
					isoperatorcliked=false;
				}
				else
				{
			
				displayLabel.setFont(new Font("Arial",Font.PLAIN, 40));
				
				displayLabel.setText(displayLabel.getText()+6);
				
			}
			}
			
			else if(e.getSource()==oneButton)
			{
				if(isoperatorcliked){
					
					displayLabel.setFont(new Font("Arial",Font.PLAIN, 40));
					displayLabel.setText("1");
					
					isoperatorcliked=false;
				}
				else
				{
			
				displayLabel.setFont(new Font("Arial",Font.PLAIN, 40));
				
				displayLabel.setText(displayLabel.getText()+1);
				
			}
			}
			
			
			else if(e.getSource()==twoButton)
			{
				if(isoperatorcliked){
					
					displayLabel.setFont(new Font("Arial",Font.PLAIN, 40));
					displayLabel.setText("2");
					
					isoperatorcliked=false;
				}
				else
				{
			
				displayLabel.setFont(new Font("Arial",Font.PLAIN, 40));
				
				displayLabel.setText(displayLabel.getText()+2);
				
			}
			}
			
			else if(e.getSource()==threeButton)
			{
				if(isoperatorcliked){
					
					displayLabel.setFont(new Font("Arial",Font.PLAIN, 40));
					displayLabel.setText("3");
					
					isoperatorcliked=false;
				}
				else
				{
			
				displayLabel.setFont(new Font("Arial",Font.PLAIN, 40));
				
				displayLabel.setText(displayLabel.getText()+3);
				
			}
			}
			
			else if(e.getSource()==zeroButton)
			{
				if(isoperatorcliked){
					
					displayLabel.setFont(new Font("Arial",Font.PLAIN, 40));
					displayLabel.setText("0");
					
					isoperatorcliked=false;
				}
				else
				{
			
				displayLabel.setFont(new Font("Arial",Font.PLAIN, 40));
				
				displayLabel.setText(displayLabel.getText()+0);
				
			}
			}
			else if(e.getSource()==doublezeroButton)
			{
				if(isoperatorcliked){
					
					displayLabel.setFont(new Font("Arial",Font.PLAIN, 40));
					displayLabel.setText("00");
					
					isoperatorcliked=false;
				}
				else
				{
			
				displayLabel.setFont(new Font("Arial",Font.PLAIN, 40));
				
				displayLabel.setText(displayLabel.getText()+"00");
				
			}
			}
			
			
			else if(e.getSource()==dotButton)
			{
				if(isoperatorcliked){
					
					displayLabel.setFont(new Font("Arial",Font.PLAIN, 40));
					displayLabel.setText(".");
					
					isoperatorcliked=false;
				}
				else
				{
			
				displayLabel.setFont(new Font("Arial",Font.PLAIN, 40));
				
				displayLabel.setText(displayLabel.getText()+".");
				
			}
			}
			
			
			
			
			else if(e.getSource()==addButton)
			{
				
				isoperatorcliked=true;
				oldvalue=displayLabel.getText();
				displayLabel.setText("+");
				check=1;
			}
			
			
			else if(e.getSource()==substractionButton)
			{
				isoperatorcliked=true;
				oldvalue=displayLabel.getText();
				displayLabel.setText("-");
				check=2;
			}
			
			
			else if(e.getSource()==multiButton)
			{
				isoperatorcliked=true;
				
				
				equaltoButton.addActionListener(this);
				oldvalue=displayLabel.getText();
				displayLabel.setText("x");
				check=3;
				
			}
			
			
			else if(e.getSource()==divisionButton)
			{
				isoperatorcliked=true;
				oldvalue=displayLabel.getText();
				displayLabel.setText("/");
				check=4;
			}
			
			else if(e.getSource()==persentageButton)
			{
				isoperatorcliked=true;
				oldvalue=displayLabel.getText();
				check=5;
			}
			
			
			else if(e.getSource()==piButton)
			{
				isoperatorcliked=true;
				oldvalue=displayLabel.getText();
				check=6;
				
			}

			
			else if(e.getSource()==clearButton)
			{
				displayLabel.setText("");
			}
			
			else if(e.getSource()==backButton)
			{
				
				
				
				String prevalue=displayLabel.getText();
				displayLabel.setText("");
					for(int i=0;i<prevalue.length()-1;i++) {
						char newvalue=prevalue.charAt(i);
						displayLabel.setText(displayLabel.getText()+newvalue);
					}
			
			}
			
			
			else if(e.getSource()==equaltoButton)
			{
			
				String newvalue=displayLabel.getText();
				
				float oldvaluef=Float.parseFloat(oldvalue);
				
				float newvaluef=Float.parseFloat(newvalue);
				
				
				if(check==1) {	
				float result=oldvaluef+newvaluef;
				displayLabel.setText(result+"");
				}
				else if(check==2) {
					float result=oldvaluef-newvaluef;
					displayLabel.setText(result+"");
					
				}
				else if(check==3) {
					float result=oldvaluef*newvaluef;
					displayLabel.setText(result+"");
					
				}
				else if(check==4) {
					float result=oldvaluef/newvaluef;
					displayLabel.setText(result+"");
					
				}
				else if(check==5) {
					float result=oldvaluef%newvaluef;
					displayLabel.setText(result+"");
					
				}
				else if(check==6) {
					double result=oldvaluef*3.141592;
					displayLabel.setText(result+"");
					
				}
			}
			
			
		
		}
		
}
