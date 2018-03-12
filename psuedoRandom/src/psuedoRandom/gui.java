package psuedoRandom;

import java.awt.BorderLayout;
import java.awt.Image;
import java.io.File;
import java.util.List;

import javax.swing.JFrame;

public class gui {

	public static void main(String[] args) {
		//here we show a gui.
		createGui();
		
		/*File a = new File("c:/users/public/pictures/sample pictures");
		imgViewer b = new imgViewer();
		b.getFiles(a);
		List<Image> imgarray = b.getImages();
		*/
	}
	public static void createGui(){
		JFrame frame = new JFrame("Curated Wallpapers");
	      //to the frame we add a content pane of beergui, situating it at the center
	      frame.getContentPane().add(new paperGui(), BorderLayout.CENTER);
	      //self evident
	      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      //allow java to arrange elements
	      frame.pack();
	      //Specify it doesn't need to boot anywhere
	      frame.setLocationRelativeTo(null);
	      //self evident
	      frame.setVisible(true);
	
		
	}
}
