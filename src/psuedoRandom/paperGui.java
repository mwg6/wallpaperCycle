package psuedoRandom;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

public class paperGui extends JPanel {

	middlePanel array = new middlePanel();
	topPanel topPanel = new topPanel();
	bottomPanel bott = new bottomPanel();
	int rotateTime;
	
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
	
	    topPanel.addExitButtonListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {

				System.exit(0);
				
			}
	    	
	    });
	    topPanel.addStartButtonListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {

				rotateTime = topPanel.getTime();
				
			}
	    	
	    });
	    
	}
	
}
