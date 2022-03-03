import java.awt.EventQueue;
import javax.swing.*;
import java.awt.event.*;
import java.awt.Color;

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
		private void initialize() {
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
			
			JButton CheckButton = new JButton("Check divisiblity");
			CheckButton.addActionListener(new ActionListener() {
				
				
			public void actionPerformed(ActionEvent e) { //when the button is pressed
			String userIn = UserIn.getText();
					
			if (userIn != null && !userIn.trim().isEmpty()) { 
			  userNum = Integer.parseInt(userIn); //converting the users string to an integer so that we can perform division on it
						  
			 if (userNum % 3 == 0) {
			 YesNo.setText("The number is divisable by 3");  // the part where it is divisable by 3
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
