import java.awt.event.*;

import javax.swing.*;

import java.awt.*;
import java.util.ArrayList;

public class GUI {
	private JFrame frame;
	private JButton addition=new JButton("+");
	private JButton subtraction=new JButton("-");
	private JButton multiple=new JButton("*");
	private JButton division=new JButton("/");
	private JButton leftBra=new JButton("(");
	private JButton rightBra=new JButton(")");
	private JPanel buttonPanel=new JPanel();
	private JPanel textPanel=new JPanel();
	private JTextArea output =new JTextArea();
	private JButton one=new JButton("1");
	private JButton two=new JButton("2");
	private JButton three=new JButton("3");
	private JButton four=new JButton("4");
	private JButton five=new JButton("5");
	private JButton six=new JButton("6");
	private JButton seven=new JButton("7");
	private JButton eight=new JButton("8");
	private JButton nine=new JButton("9");
	private JButton zero=new JButton("0");
	private JButton dot=new JButton(".");
	private JButton equals=new JButton("=");
	private JButton clearAll=new JButton("C");
	
	private ArrayList<String> inputEx=new ArrayList<String>();
	private String element="";
	private Calculator calculator;
	
	private class oneButtonListener implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			element+="1";
			output.append("1");
		}
		
	}
	private class twoButtonListener implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			element+="2";
			output.append("2");
		}
		
	}
	private class threeButtonListener implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			element+="3";
			output.append("3");
		}
		
	}
	private class fourButtonListener implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			element+="4";
			output.append("4");
		}
		
	}
	private class fiveButtonListener implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			element+="5";
			output.append("5");
		}
		
	}
	private class sixButtonListener implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			element+="6";
			output.append("6");
		}
		
	}
	private class sevenButtonListener implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			element+="7";
			output.append("7");
		}
		
	}
	private class eightButtonListener implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			element+="8";
			output.append("8");
		}
		
	}
	private class nineButtonListener implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			element+="9";
			output.append("9");
		}
		
	}
	private class zeroButtonListener implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			element+="0";
			output.append("0");
		}
		
	}
	private class dotButtonListener implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			element+=".";
			output.append(".");
		}
		
	}

	
	private class additionButtonListener implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(element.length()!=0){
				inputEx.add(element);
			}
			inputEx.add("+");
			output.append("+");
			element="";
		}
		
	}
	private class subtractionButtonListener implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(element.length()!=0){
				inputEx.add(element);
			}
			inputEx.add("-");
			output.append("-");
			element="";
		}
		
	}
	private class multipleButtonListener implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(element.length()!=0){
				inputEx.add(element);
			}
			inputEx.add("*");
			output.append("*");
			element="";
		}
		
	}
	private class divisionButtonListener implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(element.length()!=0){
				inputEx.add(element);
			}
			inputEx.add("/");
			output.append("/");
			element="";
		}
		
	}	
	private class leftBraButtonListener implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(element.length()!=0){
				inputEx.add(element);
			}
			inputEx.add("(");
			output.append("(");
			element="";
		}
		
	}		
	private class rightBraButtonListener implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(element.length()!=0){
				inputEx.add(element);
			}
			inputEx.add(")");
			output.append(")");
			element="";
		}
		
	}		
	private class clearAllButtonListener implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			output.setText("");
			inputEx=new ArrayList<String>();
			element="";
		}
		
	}
	
	private class equalsButtonListener implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(element.length()!=0){
				inputEx.add(element);
			}
			calculator=new Calculator(inputEx);
			for(int i=0; i<inputEx.size(); ++i)
			{
				System.out.println(inputEx.get(i));
			}
			String result=""+calculator.calculate();
			output.append("="+result);
			element="";
		}
		
	}
	
	
	public GUI()
	{
		
	}
	
	
	public void go()
	{
		frame=new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		one.addActionListener(new oneButtonListener());
		two.addActionListener(new twoButtonListener());
		three.addActionListener(new threeButtonListener());
		four.addActionListener(new fourButtonListener());
		five.addActionListener(new fiveButtonListener());
		six.addActionListener(new sixButtonListener());
		seven.addActionListener(new sevenButtonListener());
		eight.addActionListener(new eightButtonListener());
		nine.addActionListener(new nineButtonListener());
		zero.addActionListener(new zeroButtonListener());
		dot.addActionListener(new dotButtonListener());
		
		
		addition.addActionListener(new additionButtonListener());
		subtraction.addActionListener(new subtractionButtonListener());
		multiple.addActionListener(new multipleButtonListener());
		division.addActionListener(new divisionButtonListener());
		leftBra.addActionListener(new leftBraButtonListener());
		rightBra.addActionListener(new rightBraButtonListener());
		
		equals.addActionListener(new equalsButtonListener());
		clearAll.addActionListener(new clearAllButtonListener());
		
		frame.setLayout(new GridLayout(2, 1));
		
		textPanel.add(output);
		buttonPanel.setLayout(new GridLayout(1, 2));
		JPanel numberPanel = new JPanel();
		JPanel operatorPanel = new JPanel();
		
		numberPanel.setLayout(new GridLayout(4, 3));
		numberPanel.add(one);
		numberPanel.add(two);
		numberPanel.add(three);
		numberPanel.add(four);
		numberPanel.add(five);
		numberPanel.add(six);
		numberPanel.add(seven);
		numberPanel.add(eight);
		numberPanel.add(nine);
		numberPanel.add(zero);
		numberPanel.add(dot);
		
		operatorPanel.setLayout(new GridLayout(4, 2));
		operatorPanel.add(addition);
		operatorPanel.add(subtraction);
		operatorPanel.add(multiple);
		operatorPanel.add(division);
		operatorPanel.add(leftBra);
		operatorPanel.add(rightBra);
		operatorPanel.add(equals);
		operatorPanel.add(clearAll);
		
		buttonPanel.add(numberPanel);
		buttonPanel.add(operatorPanel);
		
		frame.add(textPanel);
		frame.add(buttonPanel);
		
		frame.setSize (450, 450);
		frame.setVisible(true);
	}
	
	public static void main (String[] args)
	{
		GUI gui=new GUI();
		gui.go();
	}
}
