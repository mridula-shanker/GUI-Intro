import java.awt.Point;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main 
{

	public static void main(String[] args) 
	{
		JFrame myFrame = new JFrame();
		myFrame.setBounds(100,300,500,300);
		myFrame.setLayout(null);
		JLabel label1 = new JLabel("our first label");
		//label1.setSize(35,50);
		label1.setLocation(new Point(35,50));
		myFrame.add(label1);
		
		myFrame.setVisible(true);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		
	}

}
																							