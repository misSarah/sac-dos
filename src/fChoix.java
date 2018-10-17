
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class fChoix extends JPanel  implements ActionListener{

	
	private static final long serialVersionUID = 1L;
	private static final Color WHITE = null;
	private static final Color BLUE = null;
	Font   titleFont  = new Font("Hobo Std", Font.PLAIN,14);
	JButton b3;
	int i;
    JLabel l1; 
    JFrame fen = new JFrame ();
    
    JTextField entre1, entre2;
    public Image img;
    public fChoix()
    {
    	this.setOpaque(false);
		try {
			
			img = ImageIO.read(new File("Media/y.png"));
			
			}
			
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		JLabel l = new JLabel("	     Veuillez entrer le nombre d'objets :   ");l.setBackground(BLUE);  
		JLabel l2 = new JLabel("	 Le poids du sac à dos :   ");l2.setBackground(BLUE);  
			 
		b3 = new JButton("  Valider  "); b3.setForeground(Color.WHITE);  b3.addActionListener(this);
	  
	    JLabel label3 = new JLabel("      "); 
		label3.setFont(titleFont);
	    label3.setPreferredSize(new Dimension(617,50));
		this.add(label3); 
	    JPanel p = new JPanel();
	    p.setLayout(new FlowLayout());
	    p.setOpaque(false); 
	    p.setSize(new Dimension(617,40));
	    JLabel label = new JLabel("                                                                                                   Veuillez entrer le nombre d'objets :  "); 
	    label.setPreferredSize(new Dimension(617,40));
	    p.add(label); 
	    
	    JPanel p3 = new JPanel();
	    p3.setLayout(new FlowLayout());
	    p3.setOpaque(false); 
	    p3.setSize(new Dimension(617,40));
	    JLabel lb1 = new JLabel(" "); 
	    lb1.setPreferredSize(new Dimension(390,40));
	    p3.add(lb1); 
	    entre1 = new JTextField("");
	    entre1.setPreferredSize(new Dimension(60,40));
		p3.add(entre1); 
	     
	    
	     
	    JPanel p2 = new JPanel();
	    p2.setLayout(new FlowLayout());
	    p2.setOpaque(false); 
	    p2.setSize(new Dimension(617,40));
	    JLabel label2 = new JLabel("                                                                                                             Le poids du sac à dos :   "); 
	    label2.setPreferredSize(new Dimension(617,40));
	    p2.add(label2);  
	  
	    JPanel p4 = new JPanel();
	    p4.setLayout(new FlowLayout());
	    p4.setOpaque(false); 
	    p4.setSize(new Dimension(617,40));
	    JLabel lb4 = new JLabel(" "); 
	    lb4.setPreferredSize(new Dimension(390,40));
	    p4.add(lb4); 
	    entre2 = new JTextField("");
	    entre2.setPreferredSize(new Dimension(60,40));
		p4.add(entre2); 
		
		JPanel p5 = new JPanel();
	    p5.setLayout(new FlowLayout());
	    p5.setOpaque(false); 
	    p5.setSize(new Dimension(500,60));
	    JLabel label5 = new JLabel("      "); 
	    label5.setPreferredSize(new Dimension(360,60));
	    b3.setFont(titleFont); 
	    b3.setBackground(new Color(55,125,117));
	    b3.setPreferredSize(new Dimension(130,50));
	    p5.add(label5); 
	    p5.add(b3); 
	    
	     
	    
	    this.add(p);
	    this.add(p3);
	    this.add(p2);
	    this.add(p4);
	    this.add(p5);
	    JLabel label4 = new JLabel("      "); 
	    label4.setPreferredSize(new Dimension(300,180));
	    JLabel lb = new JLabel("                                                               Ghorab Sara"); 
	    lb.setForeground(Color.white);
	    lb.setFont(titleFont); 
	    JLabel lb2 = new JLabel("                                                                          2CSSIQ"); 
	    lb2.setForeground(Color.white);
	    lb2.setFont(titleFont); 
	    this.add(label4) ; 
	    this.add(lb) ; 
	    this.add(lb2) ; 
	    
		 
		 fen.setTitle("Détermination des paramètres");										//Titre de la fentre
		 fen.setSize(617, 407);	
		 fen.add(this);
		 fen.setLocationRelativeTo(null);
		 fen.setVisible(true); 
		 fen.setResizable(false);	
		 fen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
    }
    
    public void actionPerformed(ActionEvent e){
		Object source = e.getSource();
		
	      if (source == b3){
			if(!entre1.getText().equals("") && !entre2.getText().equals("") && !entre1.getText().equals("0") && !entre2.getText().equals("0") ){
				fen.dispose();
				main.RemplirDonnees((entre1.getText()),entre2.getText());				
			}else JOptionPane.showMessageDialog(new Frame(),
						"Veuillez entrer le nombre d'objets ainsi que le poids du sac à dos !",
						"Erreur",
						JOptionPane.ERROR_MESSAGE);
		}
		
    }
    


@Override
public void paintComponent(Graphics g) {
	g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
   
    
}

	
    
	}

