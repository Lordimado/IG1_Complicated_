import javax.swing.*;
import java.awt.*;
import java.io.*;
import javax.imageio.*;

public class Panel extends JPanel {
				
		public void paintComponent(Graphics g){
			try{
			Image img = ImageIO.read(new File("image.jpg"));
			g.drawImage(img,00,00, this);
			}catch(IOException e){
				e.printStackTrace();
			}
			
		}
		
	}

