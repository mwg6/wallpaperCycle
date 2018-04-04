package psuedoRandom;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class imgViewer extends JPanel{
	
	Map theory = new HashMap();
	Map revTheory = new HashMap();
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
					theory.put(f.getName(), img);
					revTheory.put(img, f.getName());
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
	public Image getImg(String name){
		return (Image) theory.get(name);
	}
	public String getImgNme(Image img){
		return (String) revTheory.get(img);
	}
	public int getFiles(){
		return theory.size();
	}
	
	public void addImg(){
		
	}

}
	
	//add them to a list
	
	//display all the images
	
	//add a list listener
	
