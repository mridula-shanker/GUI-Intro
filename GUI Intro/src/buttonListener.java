import java.awt.event.ActionListener;

//this class will not work because of access problems. It either needs to be a feild or method
public class buttonListener implements ActionListener
{
	public void actionPerformed(ActionEvent e)
	{
		label1.setText("new text")
	}
}
