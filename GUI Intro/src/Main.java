import java.awt.Point;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main 
{

	public static void main(String[] args) 
	{
		JFrame myFrame = new JFrame("My First Frame");//JFrame myFrame = new JFrame();
		myFrame.setBounds(400,400,600,300);
		myFrame.setLayout(null);
		JLabel label1 = new JLabel("my first label");
		label1.setBounds(40, 30, 100, 30);
		myFrame.add(label1);
		JButton button1 = new JButton("my first button");
		button1.setBounds(180, 30, 100, 30);
		myFrame.add(button1);
		//button1.setLocation(new Point(140,30);
		//button1.setSize(new Dimension(100,30);
		
		
		
		myFrame.setVisible(true);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		 

		
	}

}
																							