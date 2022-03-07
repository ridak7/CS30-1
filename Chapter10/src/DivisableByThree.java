import java.awt.EventQueue;
import javax.swing.*;
import java.awt.event.*;
import java.awt.Color;

/*

Program: DivisableByThree.java          Last Date of this Revision: February 25, 2022

Purpose: An application that prompts the user for an integer then displays a message if the integer is divisable by 3 or not when clciked

Author: Muhammad Hafeez, 
School: CHHS
Course: Computer Science 30 
 
*/

public class DivisableByThree {

private JFrame frame;
private JTextField UserIn;
		 
int userNum ;

/**
 * Launch the application.
 * 	 */
  public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
		public void run() {
		try {
		DivisableByThree window = new DivisableByThree();
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
		public  DivisableByThree() {
			initialize();
		}

		/**
		 * Initialize the contents of the frame.
		 */
		private void initialize() {               //Frame and making of display 
			frame = new JFrame();
			frame.getContentPane().setBackground(Color.PINK);
			frame.setBackground(Color.YELLOW);
			frame.setBounds(100, 100, 460, 200);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.getContentPane().setLayout(null);
			
			JPanel panel = new JPanel();
			panel.setBackground(Color.GREEN);
			
			panel.setBounds(10, 11, 424, 139);
			frame.getContentPane().add(panel);
			panel.setLayout(null);
			
			JLabel lblNewLabel = new JLabel("Enter an Interger:");
			
			lblNewLabel.setBounds(10, 11, 192, 25);
			panel.add(lblNewLabel);
			
			UserIn = new JTextField();
			UserIn.setBounds(10, 30, 168, 20);
			panel.add(UserIn);
			UserIn.setColumns(10);
			
			
			JLabel YesNo = new JLabel("Enter a number to check");
			
			YesNo.setBounds(127, 83, 208, 23);
			panel.add(YesNo);
			
			JButton CheckButton = new JButton("Check divisiblity");// making button run when pressed with actionListner
			CheckButton.addActionListener(new ActionListener() {
				
				
			public void actionPerformed(ActionEvent e) { //when the button is pressed
			String userIn = UserIn.getText();
					
			if (userIn != null && !userIn.trim().isEmpty()) { 
			  userNum = Integer.parseInt(userIn); //converting the users string to an integer so that we can perform division on it
						  
			 if (userNum % 3 == 0) {
			 YesNo.setText("The number is divisable by 3");  // the part where if it is divisable by 3 it will display that
			 }
					  else{
			 YesNo.setText("The number is not divisable by 3"); //the case where it is not divisable by three 
	 }
					 				  
						 
	}
				
					
     }
	 });
			
	CheckButton.setBounds(222, 29, 150, 23);
	panel.add(CheckButton);
			
			
		}
	}
