
import java.io.*; 
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.imageio.ImageIO;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class p extends JPanel implements MouseListener, ActionListener { 
	private int bestScore;
	
	
	private JLabel NombreObjets;
	private JLabel PoidsSac;
	
	private bouton accueil,quitter, scor ;
	String items ; 
	String weight; 
	
	public p(int x, int y, String items, String weight){
		super();
		this.items= items; 
		this.weight=weight; 
		setPreferredSize(new Dimension(x,y));		
		
		JLabel tmp= new JLabel(" Poids du sac : ");		add(tmp);
					Font font = new Font("Bernard MT Condensed", Font.CENTER_BASELINE, 25);
					tmp.setFont(font);
					tmp.setForeground(Color.WHITE);	
		JPanel best = new JPanel();	font = new Font("Bernard MT Condensed", Font.CENTER_BASELINE, 20);
		
		//Extraire le best score 
		
		
		
		
		PoidsSac= new JLabel(weight+ " Kg");		
		PoidsSac.setFont(font);
		PoidsSac.setForeground(Color.YELLOW);
		
		best.setLayout(new FlowLayout());
		
		best.add(PoidsSac);
		best.setBackground(new Color(191,131,0));
		add(best);
		Image img; 
		//Joueur
		
		//add(new Images(3));
		tmp= new JLabel("Nombre d'objets : ");		add(tmp);
				font = new Font("Bernard MT Condensed", Font.CENTER_BASELINE, 20);
				tmp.setFont(font);
				tmp.setForeground(Color.WHITE);	
	//	tmp= new JLabel(this.j.getNom());		add(tmp);
				font = new Font("Bernard MT Condensed", Font.CENTER_BASELINE, 20);
				tmp.setFont(font);
				tmp.setForeground(new Color(255,211,60));	
		
		JPanel player = new JPanel();
		
		NombreObjets= new JLabel(items);		
		NombreObjets.setFont(font);
		NombreObjets.setForeground(Color.YELLOW);
		
		player.setLayout(new FlowLayout());
		player.add(NombreObjets);
		player.setBackground(new Color(191,131,0));
		add(player);
		
		
		
		accueil = new bouton("           Accueil",1);
		accueil.addActionListener(this);
		add(accueil);
		
		scor = new bouton("           Solution",2);
		scor.addActionListener(this);
		add(scor);
		
		quitter= new bouton("          Quitter",3);
		quitter.addActionListener(this);
		add(quitter);
	}
		public void paintComponent(Graphics g){
	    try {
	        Image img = ImageIO.read(new File("Media\\fondInfo.png"));
	        g.drawImage(img, 0, 00, this.getWidth(), this.getHeight(), this);
	      } catch (IOException e) {
	    	  Color c = g.getColor();
	    	  g.setColor(new Color(191,131,0));
	        g.fillRect(0, 0, this.getWidth(), this.getHeight());
	        g.setColor(c);
	      }
	  }
	
	 
		
		
	public bouton getQuitter(){return quitter;	}

	public void mouseEntered(MouseEvent arg0) {	}
	public void mouseExited(MouseEvent arg0) { }
	public void mousePressed(MouseEvent arg0) {	}
	public void mouseReleased(MouseEvent arg0) {	}

	public void actionPerformed(ActionEvent arg0) {
		int j=0,k=0;		
		
	if(arg0.getSource()== accueil){
			main.fen3.dispose(); 
			
		}
		
		if(arg0.getSource()== scor){
			 
			dd.fenS.setVisible(true); 
		}
		
		if(arg0.getSource()== quitter){
			main.fen3.dispose(); 
			
		}
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	 
	 
}

