import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class FonSolPan extends JPanel{
	Image img ;
	public FonSolPan(int i){
		setPreferredSize(new Dimension(460,26));
			try{
		        img = ImageIO.read(new File("Media\\w"+i+".png"));
			}catch(IOException e) {
				e.printStackTrace();
			}
		
	}
	
	public void paintComponent(Graphics g){//fonScore.
	        g.drawImage(img, 0,0, this);
     }
}
