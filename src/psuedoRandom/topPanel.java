package psuedoRandom;

import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class topPanel extends JPanel {
	
	
	String[] times = new String[] {"5", "10" , "15", "20", "30", "45", "60", "90", "120", "Static"};
	JComboBox<String> time = new JComboBox<>(times);
	
	JButton start = new JButton("Start");
	
	JButton exit = new JButton("Exit");
	
	public topPanel(){
		add(new JLabel("Time per Change (min.):"));
		add(time);
		add(Box.createHorizontalStrut(10));
		add(start);
		add(exit);
	}
	
	public int getTime(){
		
		return Integer.parseInt(time.getSelectedItem().toString());
		
	}
	public void addExitButtonListener(ActionListener listen){
		exit.addActionListener(listen);
	}
	public void addStartButtonListener(ActionListener listen){
		start.addActionListener(listen);
	}
}
