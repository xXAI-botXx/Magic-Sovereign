package package1;

import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;



public class Imageloader {

	
	public static BufferedImage loadImage(String name) {
		try {
			return ImageIO.read(Imageloader.class.getClassLoader().getResourceAsStream("resources/"+name+".png"));
		}catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
}
