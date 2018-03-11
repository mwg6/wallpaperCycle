package psuedoRandom;

import java.awt.List;
import java.io.File;

public class imgViewer {

	
	//first find all the images in the folder
	public List getFiles(File folder){
		List imgs = new List();
		for(File img : folder.listFiles()){
			if (img.isDirectory()) {
	            getFiles(img);
	        } else {
	            System.out.println(img.getName());
	        }
		}
		return imgs;
	}
	//add them to a list
	
	//display all the images
	
	//add a list listener
}
