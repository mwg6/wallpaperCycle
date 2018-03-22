package psuedoRandom;

import java.awt.GridLayout;
import java.awt.Image;
import java.io.File;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class middlePanel extends JPanel{
	
	//give the path to look in. This will be passed to the imgviewer
	static File a = new File("c:/users/public/pictures/sample pictures");
	//create the imgviewer we will be passing to
	static imgViewer midPanel = new imgViewer();
	//attempt to format the gridlayout we wish to add
	static JPanel display = new JPanel(new GridLayout(3,3));
	JScrollPane wrap = new JScrollPane(display);
	
	public middlePanel(){
		//get the files in our ordained directory
		midPanel.getFiles(a);
		//get the list of all images in the directory
		List<Image> imgarray = midPanel.getImages();
		//within this list add to the JPanel the images
		for(Image imgname:imgarray){
			JLabel temp = new JLabel(new ImageIcon(imgname));
			temp.setSize(1, 1);
			display.add(temp);
			
		
	}
		add(wrap);
	}
	
	
	
}
