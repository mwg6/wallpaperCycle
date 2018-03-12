package psuedoRandom;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Image;
import java.io.File;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class paperGui extends JPanel {

	imgViewer array = new imgViewer();
	topPanel topPanel = new topPanel();
	bottomPanel bott = new bottomPanel();
	
	public paperGui(){
		JPanel top = new JPanel();
		top.add(topPanel);
		
		JPanel middle = new JPanel();
		File a = new File("c:/users/public/pictures/sample pictures");
		imgViewer b = new imgViewer();
		b.getFiles(a);
		List<Image> imgarray = b.getImages();
		for(Image imgname:imgarray){
			middle.add(new JLabel(new ImageIcon(imgname)));
		}
		
		JPanel bottom = new JPanel();
		bottom.add(bott);
		
		setLayout(new BorderLayout());
	      add(top, BorderLayout.NORTH);
	      add(middle, BorderLayout.CENTER);
	      add(bottom, BorderLayout.SOUTH);
	}
}
