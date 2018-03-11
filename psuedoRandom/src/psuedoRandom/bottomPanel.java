package psuedoRandom;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JPanel;

public class bottomPanel extends JPanel{

	JButton delete = new JButton("Delete Entry");
	JButton add = new JButton("Add Entry");
	
	public bottomPanel(){
		add(add);
		add(Box.createHorizontalStrut(10));
		add(delete);
	}
	
}
