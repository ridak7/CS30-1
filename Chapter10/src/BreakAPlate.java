import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

//I just made thsi change

public class BreakAPlate
{

	private JFrame frame;
	private boolean clicked;
	ImageIcon allPlates = new ImageIcon("..\\Chapter10\\src\\placeholder.gif");
	
	ImageIcon twoPlates = new ImageIcon("..\\Chapter10\\src\\plates_all_broken.gif");
	ImageIcon noImage = new ImageIcon("..\\Chapter10\\src\\plates_two_broken.gif");
	ImageIcon sticker = new ImageIcon("..\\Chapter10\\src\\plates.gif");
	
	ImageIcon freshPlates = new ImageIcon("..\\Chapter10\\src\\sticker.gif");
	ImageIcon tigerPlush =  new ImageIcon("..\\Chapter10\\src\\tiger_plush.gif");
	
	/**
	 * Create the application.
	 */
	public BreakAPlate() 
	{
		initialize();
		clicked = true;
	}
	
     
	
	/**
	 * Launch the application.
	 */	
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					BreakAPlate window = new BreakAPlate();
					window.frame.setVisible(true);
				}
				
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}
    
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() 
	{
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.setBounds(100, 100, 1000, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
			
		JLabel plates = new JLabel(new ImageIcon("..\\Chapter10\\src\\plates.gif"));
		plates.setBackground(Color.ORANGE);
		plates.setForeground(SystemColor.activeCaption);
		plates.setOpaque(true);
		plates.setBounds(60,130,514,146);
		frame.getContentPane().add(plates);
		
		JLabel prize = new JLabel(new ImageIcon("..\\Chapter10\\src\\placeholder.gif"));
		prize.setBackground(Color.ORANGE);
		prize.setBounds(60,319,514,100);
		prize.setOpaque(true);
		frame.getContentPane().add(prize);
		
		JButton btn = new JButton("Break");
		btn.setBackground(Color.RED);
		btn.setFont(new Font("Tahoma", Font.PLAIN, 21));
		btn.setBounds(60, 276, 514, 42);
		frame.getContentPane().add(btn);
		
		JLabel titleLabel = new JLabel("Break the Plates");
		titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
		titleLabel.setForeground(new Color(0, 102, 51));
		titleLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		titleLabel.setOpaque(true);
		titleLabel.setBackground(Color.ORANGE);
		titleLabel.setBounds(60, 46, 514, 83);
		frame.getContentPane().add(titleLabel);
		
		btn.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				if (clicked == true)
				{
					btn.setText("Restart");
			        int plateOne = (int)(2 * Math.random() + 0);
			        int plateTwo = (int)(2 * Math.random() + 0);
			        int plateThree = (int)(2 * Math.random() + 0);
			        
			        if (plateOne == plateTwo && plateOne == plateThree)
			        {
			        	plates.setIcon(allPlates);
			        	prize.setIcon(tigerPlush);
			        }
			        
			        else
			        {
			        	plates.setIcon(twoPlates);
			        	prize.setIcon(sticker);
			        }
			        
			        clicked = false;
				}	
				
				else
				{
					btn.setText("Break");
					plates.setIcon(freshPlates);
					prize.setIcon(noImage);
					clicked = true;
				}
			}
		});				
	}
}



