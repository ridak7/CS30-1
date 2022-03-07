import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

/*

Program: MetricConversion.java          Last Date of this Revision: February 25, 2022

Purpose: A application that allows user to enter a number and then select conversion typewhich will then do coversion and display answer

Author: Muhammad Hafeez, 
School: CHHS
Course: Computer Science 30 
 

*/


public class MetricConversion1 {

	private JFrame frame;
	private JTextField a2;
	int a4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MetricConversion1 window = new MetricConversion1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MetricConversion1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame. //making frame/display
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(173, 216, 230));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lb = new JLabel("Enter Interger");//Allowing user to enter interger
		lb.setBounds(40, 44, 154, 47);
		frame.getContentPane().add(lb);
		
		a2 = new JTextField();
		a2.setBounds(145, 52, 136, 31);
		frame.getContentPane().add(a2);
		a2.setColumns(10);
		
 JComboBox cb2 = new JComboBox();
 cb2.setModel(new DefaultComboBoxModel(new String[] {"Choose one","In to cm", "Feet to Meters", "Gallons to Liters", "Pounds to Kg"}));//Added options in comboBox for user to select
		cb2.setBounds(145, 102, 136, 22);
		frame.getContentPane().add(cb2);
		
		JLabel a1 = new JLabel("Final Answer Displayed Here");//Telling user where answer is displayed
		a1.setBounds(145, 171, 148, 14);
		frame.getContentPane().add(a1);
		
		JButton b1 = new JButton("Convert");// button allowing user to convert the options with help of action listner
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				 double itc =2.54; // conversion formula for in to cm
				 double ftm =0.3048;//conversion formula for ft to m
			     double gtl=4.5461;//conversion formula for gallons to liters

			     double ptk=0.4536;
				     								          
     String user1 = a2.getText();
		          				     
     if((a2.getText().equals("")) || ((cb2.getSelectedItem().equals("Choose one"))))//code for when user selects options 
								          {
     String value=String.format("CHOOSE A CONVERSION TYPE");  a1.setText(value);// 
								          }
     else if((a2.getText().equals("")))
									      {
     String value=String.format("ENTER A NUMBER");// Tells user to enter a number 
     a1.setText(value);
									      }
     else if(cb2.getSelectedItem().equals("In to cm"))//Does conversion for in to cm
										  {
	double metric1 =Double.parseDouble(a2.getText());
	double metric2 = itc*metric1; 
	String value=String.format("%.2f",metric2);
	 a1.setText(value+ " centimeters");
										  }
	else if(cb2.getSelectedItem().equals("Feet to Meters"))//Does conversion for Ft to M
										  {
    double metric1 =Double.parseDouble(a2.getText());
    double metric2 = ftm*metric1;
	  String value=String.format("%.3f",metric2);
	 a1.setText(value + " Meters");
      }
											    	  	    	
	else if(cb2.getSelectedItem().equals("Gallons to Liters"))//Does conversion for Gallons to Liters
		 {
		double metric1 =Double.parseDouble(a2.getText());
		double metric2 = gtl*metric1;
		 String value=String.format("%.3f",metric2);
		 a1.setText(value + " Liters");
		 
		}
	 else if(cb2.getSelectedItem().equals("Pounds to Kg"))// //Does conversion for Pounds to Kg
	 {
	 double metric1 =Double.parseDouble(a2.getText());
	 double metric2 = ptk*metric1;
	 String value=String.format("%.3f",metric2);
	a1.setText(value + " Killograms");
    }
										      		               
	 }
	
	});
		
		
		b1.setBounds(145, 135, 89, 23);
		frame.getContentPane().add(b1);
	}
}
