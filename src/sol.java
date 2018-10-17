
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

import javax.imageio.ImageIO;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class sol extends JPanel{
	ArrayList<String> solutionFinale; 
	ArrayList<Integer> ObjetsPris;
	public sol( int width, 	ArrayList<String> solutionFinale,  ArrayList<Integer> ObjetsPris) {
	this.solutionFinale=solutionFinale; 
	this.ObjetsPris=ObjetsPris; 
		setPreferredSize(new Dimension(width,100));
		setLayout(new FlowLayout());

		this.setOpaque(false); 
		FonSolPan pan;
		int i; 
		for(i=0;i<solutionFinale.size();i++){
			int k= ObjetsPris.get(i);
			System.out.println("-----"+k+"----"); 
			pan =new FonSolPan(k);
			try{
			pan.add(new JLabel(solutionFinale.get(i)));
			}catch(NumberFormatException e){
			}catch(Exception e){
				e.printStackTrace();
			}
			add(pan);
			
		}
		
	}
	
	

	public void paintComponent(Graphics g){//fonScore.

	    try {//dessiner le fond
	    	
	    	g.setColor(Color.black);
			g.fillRect(0, 0, this.getWidth(), this.getHeight());  
	    	
	        Image img = ImageIO.read(new File("Media\\img.jpg"));
	        g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
	    } catch (IOException e) {
	        e.printStackTrace();
	      }  
     }
}

