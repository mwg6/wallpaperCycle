package psuedoRandom;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class imgViewer extends JPanel{

	List<Image> images = new ArrayList<Image>();
	String[] extensions = new String[]{"jpg"};
	int numFiles;
	
//	filter the files to ensure they are images
	public FilenameFilter filter = new FilenameFilter(){

			public boolean accept(File dir, String name){
				for(String ext :extensions){
				if(name.endsWith("." + ext)){
					return true;
				}
			}
			return false;
		}
	};
	
	
	
	
	
	//first find all the images in the folder
	public void getFiles(File folder){
		
		if(folder.isDirectory()){
			numFiles =  folder.listFiles().length;
			for(File f:folder.listFiles(filter)){
				BufferedImage img = null;
				try{
					img = ImageIO.read(f);
					System.out.println("in the viewer for loop");
					images.add(img);
				}
				catch(IOException e){
					System.out.println("error");
				}
			}
		}
		else{
			System.out.println(folder.isFile());
			System.out.println(folder.isDirectory());
			System.out.println("is not a directory");
		}
	}
	
	public List<Image> getImages(){
		return images;
	}
	public Image getImg(int i){
		return images.get(i);
	}
	public int getImgNum(String name){
		return images.indexOf(name);
	}
	public String getImgNme(int i){
		return images.get(i).toString();
	}
	public int getFiles(){
		return numFiles;
	}
	public void addImg(){
		
	}

}
	
	//add them to a list
	
	//display all the images
	
	//add a list listener
	
