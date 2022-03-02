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
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(173, 216, 230));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lb = new JLabel("Enter Interger");
		lb.setBounds(40, 44, 154, 47);
		frame.getContentPane().add(lb);
		
		a2 = new JTextField();
		a2.setBounds(145, 52, 136, 31);
		frame.getContentPane().add(a2);
		a2.setColumns(10);
		
		JComboBox cb2 = new JComboBox();
		cb2.setModel(new DefaultComboBoxModel(new String[] {"Choose one","In to cm", "Feet to Meters", "Gallons to Liters ", "Pounds to Kg"}));
		cb2.setBounds(145, 102, 136, 22);
		frame.getContentPane().add(cb2);
		
		JLabel a1 = new JLabel("Final Answer Displayed Here");
		a1.setBounds(145, 171, 148, 14);
		frame.getContentPane().add(a1);
		
		JButton b1 = new JButton("Convert");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				 double itc =2.54; 
				 double ftm =0.3048;
			     double gtl=4.5461;
			     double ptk=0.4536;
				     								          
     String user1 = a2.getText();
		          				     
     if((a2.getText().equals("")) || ((cb2.getSelectedItem().equals("Choose one"))))
								          {
     String value=String.format("CHOOSE A CONVERSION TYPE");  a1.setText(value);
								          }
     else if((a2.getText().equals("")))
									      {
     String value=String.format("ENTER A NUMBER");
     a1.setText(value);
									      }
     else if(cb2.getSelectedItem().equals("In to cm"))
										  {
	double metric1 =Double.parseDouble(a2.getText());
	double metric2 = itc*metric1; 
	String value=String.format("%.2f",metric2);
	 a1.setText(value);
										  }
	else if(cb2.getSelectedItem().equals("Feet to Meters"))
										  {
    double metric1 =Double.parseDouble(a2.getText());
    double metric2 = ftm*metric1;
	  String value=String.format("%.3f",metric2);
	 a1.setText(value);
      }
											    	  	    	
	else if(cb2.getSelectedItem().equals("Gallons to Liters"))
		 {
		double metric1 =Double.parseDouble(a2.getText());
		double metric2 = gtl*metric1;
		 String value=String.format("%.3f",metric2);
		 a1.setText(value);
		}
	 else if(cb2.getSelectedItem().equals("Pounds to Kg"))
	 {
	 double metric1 =Double.parseDouble(a2.getText());
	 double metric2 = ptk*metric1;
	 String value=String.format("%.3f",metric2);
	a1.setText(value);
    }
										      		               
	 }
	
	});
		
		
		b1.setBounds(145, 135, 89, 23);
		frame.getContentPane().add(b1);
	}
}
