

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class tete extends JPanel{

		
	public tete(int width, int valeur, int poids) {
		setPreferredSize(new Dimension(width,130));

		setLayout(new BorderLayout());
		
		JLabel nom = new JLabel("         Valeur totale = "+valeur+"    Poids total = "+poids);
		Font font = new Font("Bernard MT Condensed", Font.CENTER_BASELINE, 20);
		nom.setFont(font);
		nom.setForeground(Color.red);	
		
		add(nom);
	}

	public void paintComponent(Graphics g){//fonScore.

	    try {//dessiner le fond
	    	
	    	g.setColor(Color.black);
			g.fillRect(0, 0, this.getWidth(), this.getHeight());  
	    	
	        Image img = ImageIO.read(new File("Media\\ci.jpg"));
	        g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
	    } catch (IOException e) {
	        e.printStackTrace();
	      }  
     }
}

