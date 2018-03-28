package psuedoRandom;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JPanel;

public class paperGui extends JPanel {

	middlePanel array = new middlePanel();
	topPanel topPanel = new topPanel();
	bottomPanel bott = new bottomPanel();
	
	public paperGui(){
		JPanel top = new JPanel();
		top.add(topPanel);
		top.setSize(10,10);
		
		JPanel middle = new JPanel();
		middle.add(array);
		
		
		JPanel bottom = new JPanel();
		bottom.add(bott);
		
		setLayout(new BorderLayout());
	      add(top, BorderLayout.NORTH);
	      add(middle, BorderLayout.CENTER);
	      add(bottom, BorderLayout.SOUTH);
	}
}
