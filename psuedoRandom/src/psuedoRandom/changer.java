package psuedoRandom;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class changer {
	public static native int SystemParametersInfo(int uiAction,int uiParam,String pvParam,int fWinIni);

    static
    {
        System.loadLibrary("user32");
    }

    public int Change(String path)
    {
    	System.out.println(path);
    	File imageFile = new File(path);
    	try {
			BufferedImage image = ImageIO.read(imageFile);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
       return SystemParametersInfo(20, 0, path, 0);
    }

    

    

}
