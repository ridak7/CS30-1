import javax.swing.*;

/*

Program: BreakAPlate.java          Last Date of this Revision: February 26, 2022

Purpose: A game that if you break all the plates displayed you get a prize

Author: Muhammad Hafeez, 
School: CHHS
Course: Computer Science 30 
 

*/

import java.awt.event.*;
import java.awt.*;


public class BreakAPlate
{
    
	private JFrame frame;
	private boolean clicked;
	ImageIcon ThreePlates = new ImageIcon("..\\Chapter10\\src\\plates.gif");//inserting image
	
	ImageIcon twoPlates = new ImageIcon("..\\Chapter10\\src\\plates_two_broken.gif");//inserting image
	ImageIcon noImage = new ImageIcon("..\\Chapter10\\src\\placeholder.gif");//inserting image
	ImageIcon sticker = new ImageIcon("..\\Chapter10\\src\\sticker.gif");//inserting image
	
	ImageIcon AllBroken = new ImageIcon("..\\Chapter10\\src\\plates_all_broken.gif");//inserting image
	ImageIcon tiger =  new ImageIcon("..\\Chapter10\\src\\tiger_plush.gif");//inserting image
	
	/**
	 * Create the application.
	 * 
	 */
	public BreakAPlate()
	{
		initialize();
		clicked = true;// making clicked equals to true
	}
	
     
	
	
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
	private void initialize()                //Making of frame/design
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
		plates.setBounds(10,119,514,146);
		frame.getContentPane().add(plates);
		
		JLabel prize = new JLabel(new ImageIcon("..\\Chapter10\\src\\placeholder.gif"));
		prize.setBackground(Color.ORANGE);
		prize.setBounds(10,253,514,100);
		prize.setOpaque(true);
		frame.getContentPane().add(prize);
		
		JButton btn = new JButton("Break");
		btn.setBackground(Color.RED);
		btn.setFont(new Font("Tahoma", Font.PLAIN, 21));
		btn.setBounds(575, 135, 192, 130);
		frame.getContentPane().add(btn);
		
		JLabel titleLabel = new JLabel("Break the Plates");
		titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
		titleLabel.setForeground(new Color(0, 102, 51));
		titleLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		titleLabel.setOpaque(true);
		titleLabel.setBackground(Color.ORANGE);
		titleLabel.setBounds(10, 39, 514, 83);
		frame.getContentPane().add(titleLabel);
		
		btn.addActionListener(new ActionListener()// ActionListner
		{
			public void actionPerformed(ActionEvent e) 
			{
				if (clicked == true)     // Random numbers code used to randomly generate plates 1,2,3
				{
					btn.setText("Restart");
			        int plateOne = (int)(2 * Math.random() + 0);
			        int plateTwo = (int)(2 * Math.random() + 0);
			        int plateThree = (int)(2 * Math.random() + 0);
			        
			        if (plateOne == plateTwo && plateOne == plateThree)  //showing that if all plates are broken show tiger
			        {
			        	plates.setIcon(AllBroken);
			        	prize.setIcon(tiger);
			        }
			        
			        else   //basically saying if 2 plates are broken show sticker
			        {
			        	plates.setIcon(twoPlates);
			        	prize.setIcon(sticker);
			        }
			        
			        clicked = false;
				}	
				
				else// Showing the defult starting point with 3 plates,no image the bottom, and break text
				{
					btn.setText("Break");
					plates.setIcon(ThreePlates);
					prize.setIcon(noImage);
					clicked = true;
				}
			}
		});				
	}
}



