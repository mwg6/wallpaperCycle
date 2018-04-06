package psuedoRandom;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class middlePanel extends JPanel{
	
	//give the path to look in. This will be passed to the imgviewer
	String path = "c:/users/public/pictures/sample pictures";
	File a = new File(path);
	//create the imgviewer we will be passing to
	imgViewer midPanel = new imgViewer();
	Image pickdImg;
	int border = 0;
	int selectedImgInd;
	//attempt to format the gridlayout we wish to add
	

	
	public middlePanel(){
		//get the files in our ordained directory
		midPanel.getFiles(a);
		JPanel display = new JPanel(new GridLayout(midPanel.getFiles()/3,3));
		JScrollPane wrap = new JScrollPane(display);
		//get the list of all images in the directory
		List<Image> imgarray = midPanel.getImages();
		//within this list add to the JPanel the images
		for(Image imgname:imgarray){
			JLabel temp = new JLabel(new ImageIcon(imgname));
			
			temp.addMouseListener(new MouseAdapter(){
				public void mouseClicked(MouseEvent e){
					if(border/2==0){
					pickdImg = imgname;
					System.out.println(midPanel.getImgNme(imgname));

					temp.setBorder(BorderFactory.createMatteBorder(10,10,10,10,Color.black));
					border++;
					}
					else{
						pickdImg = null;
						selectedImgInd = 0;
						temp.setBorder(BorderFactory.createEmptyBorder());;
						border--;
					}
					}
			});
			
			display.add(temp);
			
		
	}

		System.out.println(midPanel.getFiles()/3);
		wrap.setPreferredSize(new Dimension(400,400));
		
		
		add(wrap);
	}
	
	public String getSelectedImageName(){
		return midPanel.getImgNme(pickdImg);
	}
	public Image getSelectedImage(){
		return pickdImg;
	}
	public String getSelectedImageFilePath(){
		return path + "/"+ midPanel.getImgNme(pickdImg);
	}
	
	
}
