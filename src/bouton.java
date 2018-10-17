import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.*;
import javax.imageio.ImageIO;
import javax.swing.*;


public class bouton extends JButton implements MouseListener{
	private String nom;
	private Image img;
	int i; 

	Font titleFont = new Font("Cambria", Font.CENTER_BASELINE, 20);
	public bouton(String arg, int i ){
		super(arg);
		this.i=i; 
		setPreferredSize(new Dimension(149,34));
		this.setBorderPainted(false);
		this.setFont(titleFont); 
		nom=arg;
		if (i==1)
			try {
			img = ImageIO.read(new File("Media\\Bouton.png"));
	      } catch (IOException e) {
	        e.printStackTrace();
	      } 
		else if (i==2)
		{
			try {
				img = ImageIO.read(new File("Media\\bouton2.png"));
		      } catch (IOException e) {
		        e.printStackTrace();
		      } 
			
				
		}
		else 
			try {
				img = ImageIO.read(new File("Media\\bouton3.png"));
		      } catch (IOException e) {
		        e.printStackTrace();
		      } 
		this.addMouseListener(this);
	}
	public void paintComponent(Graphics g){
		try {
	        g.drawImage(img, 0, 0, this);
	      } catch (Exception e) {
	        e.printStackTrace();
	      } 
		g.setColor(Color.white);
		g.drawString(nom, (this.getWidth() - nom.length())/16 , (this.getHeight() / 2) +3 );
	}
	public void mouseClicked(MouseEvent event) {
		}
	
	public void mouseEntered(MouseEvent event) {
		//Nous changeons le fond de notre image pour le jaune lors du survol, avec le fichier fondBoutonHover.png
		if (i==1)
		{
		try {
		img = ImageIO.read(new File("Media\\BoutonHover.png"));
		} catch (IOException e) {
		e.printStackTrace();
		}
		}
		else if (i==2)
		{
			try {
				img = ImageIO.read(new File("Media\\boutonHover2.png"));
				} catch (IOException e) {
				e.printStackTrace();
				}
		}
		else 
			try {
				img = ImageIO.read(new File("Media\\boutonHover3.png"));
		      } catch (IOException e) {
		        e.printStackTrace();
		      } 
		
		this.repaint();}
		
		
	
	public void mouseExited(MouseEvent event) {
		if (i==1)
			try {
			img = ImageIO.read(new File("Media\\Bouton.png"));
	      } catch (IOException e) {
	        e.printStackTrace();
	      } 
		else if (i==2)
		{
			try {
				img = ImageIO.read(new File("Media\\bouton2.png"));
		      } catch (IOException e) {
		        e.printStackTrace();
		      } 
		}
		else 
			try {
				img = ImageIO.read(new File("Media\\bouton3.png"));
		      } catch (IOException e) {
		        e.printStackTrace();
		      } 
		
		this.repaint();
		
	}
	
	public void mousePressed(MouseEvent event) {
		//Nous changeons le fond de notre image pour le jaune lors du survol, avec le fichier fondBoutonHover.png
		try {
		img = ImageIO.read(new File("Media\\BoutonPressed.png"));
		} catch (IOException e) {
		e.printStackTrace();
		}
		this.repaint(); 
	}
	
	public void mouseReleased(MouseEvent event) {
		if (i==1)
		{
		try {
		img = ImageIO.read(new File("Media\\BoutonHover.png"));
		} catch (IOException e) {
		e.printStackTrace();
		}
		}
		else if (i==2)
		{
			try {
				img = ImageIO.read(new File("Media\\boutonHover2.png"));
				} catch (IOException e) {
				e.printStackTrace();
				}
		}
		else 
			try {
				img = ImageIO.read(new File("Media\\boutonHover3.png"));
		      } catch (IOException e) {
		        e.printStackTrace();
		      } 
		repaint();
		
	}
}


