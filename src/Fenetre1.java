
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Fenetre1 extends JPanel implements ActionListener {
	

	Font   titleFont  = new Font("Hobo Std", Font.PLAIN,14);
	JButton b1, b4;
	JFrame fen = new JFrame ();
	public Image img;
	
	
	public Fenetre1(){
		this.setOpaque(false);
		try {
			
			img = ImageIO.read(new File("Media/vi.jpg"));
			
			}
			
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		 	
			
			b1 = new JButton("  Résoude   "); b1.setForeground(Color.WHITE); b1.setBackground(new Color(55,125,200));  b1.addActionListener(this);
		    b4 = new JButton("  Quitter   ");b4.setForeground(Color.WHITE); b4.setBackground(new Color(55,125,200)); b4.addActionListener(this);
		    b1.setFont(titleFont); 
		    b4.setFont(titleFont); 
		    JLabel label3 = new JLabel("      "); 
			label3.setFont(titleFont);
		    label3.setPreferredSize(new Dimension(500,80));
			this.add(label3); 
		    JPanel p = new JPanel();
		    p.setLayout(new FlowLayout());
		    p.setOpaque(false); 
		    p.setSize(new Dimension(500,60));
		    JLabel label = new JLabel("      "); 
		    label.setPreferredSize(new Dimension(300,60));
		    b1.setPreferredSize(new Dimension(170,50));
		    p.add(label); 
		   
		    p.add(b1); 
		    JPanel p2 = new JPanel();
		    p2.setLayout(new FlowLayout());
		    p2.setOpaque(false); 
		    p2.setSize(new Dimension(500,60));
		    JLabel label2 = new JLabel("      "); 
		    label2.setPreferredSize(new Dimension(300,60));
		    b4.setPreferredSize(new Dimension(170,50));
		    p2.add(label2); 
		    p2.add(b4); 
		    
		    this.add(p);
		    this.add(p2);
		    JLabel label4 = new JLabel("      "); 
		    label4.setPreferredSize(new Dimension(300,180));
		    JLabel lb = new JLabel("                                                               GHorab Sara "); 
		    lb.setForeground(Color.black);
		    lb.setFont(titleFont); 
		    JLabel lb2 = new JLabel("                                                                          2CSSIQ"); 
		    lb2.setForeground(Color.BLACK);
		    lb2.setFont(titleFont); 
		    this.add(label4) ; 
		    this.add(lb) ; 
		    this.add(lb2) ; 
		    fen.setTitle("Problème du sac à dos");										//Titre de la fentre
			fen.setSize(510, 510);	//Taille de la fenetre
			fen.add(this); 
			fen.setVisible(true);
			fen.setLocationRelativeTo(null);						//Centrer la fentre sur l'ecran
			fen.setResizable(false);	
			fen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public void actionPerformed(ActionEvent e){
		Object source = e.getSource();
		ArrayList<Integer> tab= new ArrayList<Integer>();
		
		if(source == b1) {
			fen.dispose();
			fChoix f = new fChoix();
			f.setVisible(true);
	
		}
		
		else if(source == b4){
			System.exit(1);
		}
		
	}
	
	

@Override
public void paintComponent(Graphics g) {
	g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
   
    
}

	
	
	
	
}

