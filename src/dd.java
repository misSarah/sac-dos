import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.*;

public class dd extends JPanel implements ActionListener{
		  
	  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int nbitems, nb=0; 
	private int weight;
	int i; 
	JLabel l1; 
	JButton b1; 
	JTextField m1 =new JTextField();
	JTextField m2 =new JTextField();
	JPanel pan2 = new JPanel();
	JButton ajouter = new JButton("Ajouter"); 
	JButton valider = new JButton("Résoudre"); 
	JLabel lab = new JLabel(" Objet n° = 1"); 
	ArrayList<String> valeurO =new ArrayList<String>(); 
	ArrayList<String> poidsO =new ArrayList<String>(); 
	ArrayList<Integer> imgObjet =new ArrayList<Integer>();
	ArrayList<String> solutionFinale = new ArrayList<String>();
	ArrayList<String> nomsObjets = new ArrayList<String>();
	ArrayList<Integer> ObjetsPris =new ArrayList<Integer>();
	Font   titleFont  = new Font("Waltograph",0, 25);
	public static bestscor fenS;

	public dd(int x, int y, String items, String weight){
	    super();
	    this.nbitems= Integer.parseInt(items); 
	    this.weight = Integer.parseInt(weight); 
	    nomsObjets.add("Couverture");
	    nomsObjets.add("Lampe tempête");
	    nomsObjets.add("Gourde");
	    nomsObjets.add("Viande");
	    nomsObjets.add("Kiwi");
	    nomsObjets.add("Citron");
	    nomsObjets.add("Banane");
	    nomsObjets.add("Torche");
	    nomsObjets.add("Noix de Coco");
	    nomsObjets.add("Parapluie");
	    nomsObjets.add("Casserole");
	    nomsObjets.add("Boussole");
	    nomsObjets.add("Café");
	    nomsObjets.add("Couteau suisse");
	    nomsObjets.add("Poisson");
	    nomsObjets.add("Pomme");
	    nomsObjets.add("Boîte de secours");
	    nomsObjets.add("Jumelles");
	    nomsObjets.add("Sandwich");
	    nomsObjets.add("Appareil photo");
	    nomsObjets.add("Raisin");
	    nomsObjets.add("Veste");
	    
	    JPanel pan3 = new JPanel();
		pan3.setOpaque(false);
		JLabel lb3 = new JLabel(""); 
		lb3.setForeground(Color.white);
		lb3.setPreferredSize(new Dimension(500,200)); 
		pan3.add(lb3);
		pan3.setPreferredSize(new Dimension(900,120));
		this.add(pan3);
		JPanel panel = new JPanel();
		panel.setOpaque(false);
			
			lab.setForeground(Color.white);
			lab.setPreferredSize(new Dimension(200,30)); 
			lab.setFont(titleFont); 
			panel.add(lab);
			panel.setPreferredSize(new Dimension(900,40));
			this.add(panel); 
	    b1 = new JButton("Autre"); b1.setPreferredSize(new Dimension(100,34)); b1.addActionListener(this);  
		b1.setFont(titleFont);
	    JPanel pane = new JPanel();
		pane.setOpaque(false);
		pan3.setPreferredSize(new Dimension(900,110));
		l1 = new JLabel(new ImageIcon("Media\\y1.png"));
		pane.add(l1);  
		pane.add(b1);
	    this.add(pane); 
	    
	    
	    	JPanel pan = new JPanel(); 
	    	pan.setOpaque(false); 
	    	pan.setPreferredSize(new Dimension(900, 60)); 
	    	JLabel lb = new JLabel("Valeur:" ); 
			lb.setForeground(Color.white);
			lb.setPreferredSize(new Dimension(80,50)); 
			lb.setFont(titleFont); 
			pan.add(lb);
			
			m1.setPreferredSize(new Dimension(50,30));
			pan.add(m1); 
			
			JLabel lb2 = new JLabel("Poids:"); 
			lb.setForeground(Color.white);
			lb2.setPreferredSize(new Dimension(80,50)); 
			lb2.setForeground(Color.white);
			lb2.setFont(titleFont); 
			pan.add(lb2); 
			
			m2.setPreferredSize(new Dimension(50,30));
			pan.add(m2); 
			this.add(pan); 
			
			
			i=1; 
			
			pan2.setPreferredSize(new Dimension(950,40));
			ajouter.setPreferredSize(new Dimension(150,34));
			ajouter.setFont(titleFont); 
			ajouter.addActionListener(this); 
			pan2.setOpaque(false);
			pan2.add(ajouter);
			this.add(pan2);
			
			JPanel pan5 = new JPanel();
    		pan5.setPreferredSize(new Dimension(900,40));
    		valider.setPreferredSize(new Dimension(150,34));
    		valider.addActionListener(this); 
    		pan5.setOpaque(false);
    		pan5.add(valider);
    		valider.setFont(titleFont); 
    		this.add(pan5);
            if(nbitems==1) {valider.setVisible(true); ajouter.setVisible(false);  }
            else valider.setVisible(false); 
			
			
	    	
	  }
			

/*************************************************/	

	

/*************************************************/	
	 
	  public void paintComponent(Graphics g){
		
		  
	    try {//dessiner le fond
	        Image img = ImageIO.read(new File("Media\\imgeeee.jpg"));
	        g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
	        
	    } catch (IOException e) {
	        e.printStackTrace();
	      }  
	  }
	  
/*************************************************/	  


/*****************************************************/
	@Override
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
        
		if (source == b1) {
	    	  i++;
				if (i == 23) i = 1;
				 l1.setIcon(new ImageIcon("Media\\y"+i+".png"));
			}
		else if (source==ajouter)
		{  if (m1.getText().equals("")||m2.getText().equals("") ) {JOptionPane.showMessageDialog(new Frame(),
				"Veuillez entrer une valeur et un poids pour votre objet!",
				"Erreur",
				JOptionPane.ERROR_MESSAGE);}
		  else {valeurO.add(m1.getText());
			m1.setText(""); 
			poidsO.add(m2.getText()); 
			imgObjet.add(i); 
			if(nbitems!=1)
			{m2.setText(""); 
			nb++; 
			i=1; 
            l1.setIcon(new ImageIcon("Media\\y"+i+".png"));
            lab.setText(" Objet n° = "+(nb+1)); 
			}
            if (nb==nbitems-1) 
            	{
            	ajouter.setEnabled(false);  
            	valider.setVisible(true);
		        }}
		}
		else if (source==valider)
		{  if (m1.getText().equals("")||m2.getText().equals("") ) {JOptionPane.showMessageDialog(new Frame(),
				"Veuillez entrer une valeur et un poids pour votre objet!",
				"Erreur",
				JOptionPane.ERROR_MESSAGE);}
		else {
			 imgObjet.add(i);
			i=1; 
          
            valeurO.add(m1.getText());
			poidsO.add(m2.getText()); 
			 
					
					int[] valeur = new int[nbitems+1];
			        int[] poids = new int[nbitems+1];
			        int[] nom = new int[nbitems+1];

			        // Remplir les données des objets : valeurs et poids
			        for (int n = 1; n <= nbitems; n++) {
			            valeur[n] = Integer.parseInt(valeurO.get(n-1)); 
			            poids[n] = Integer.parseInt(poidsO.get(n-1));
			            nom[n] = (imgObjet.get(n-1));
			            } 

			        int[][] opt = new int[nbitems+1][weight+1];
			        boolean[][] sol = new boolean[nbitems+1][weight+1];

			        for (int n = 1; n <= nbitems; n++) {
			            for (int w = 1; w <= weight; w++) {

			                /** Objet non pris **/ 
			                int option1 = opt[n-1][w]; 

			                /** Objet pris  **/ 
			                int option2 = Integer.MIN_VALUE;
			                if (poids[n] <= w) option2 = valeur[n] + opt[n-1][w-poids[n]];

			                /** Séléctionner la meilleur des deux options **/ 
			                opt[n][w] = Math.max(option1, option2);
			                sol[n][w] = (option2 > option1);
			            }
			        }

			       /** Déterminer les objets à prendre **/ 
			        boolean[] take = new boolean[nbitems+1];
			        for (int n = nbitems, w = weight; n > 0; n--) {
			            if (sol[n][w]) { take[n] = true;  w = w - poids[n]; }
			            else           { take[n] = false;                    }
			        }

			        /** Ecrire les résultats **/
			        System.out.println("objet" + "\t" + "valeur" + "\t" + "poids" + "\t" + "pris");
			        int totalv=0, totalp=0; 
			        for (int n = 1; n <= nbitems; n++) {
			        System.out.println(n + "\t" + valeur[n] + "\t" + poids[n] + "\t" + take[n]);
			        	if (take[n]) {
			        		 String chaine = " "+ nomsObjets.get(nom[n]-1)+ "   |   Valeur = "+valeur[n]+ "   |   Poids = " + poids[n]; 
			        		 solutionFinale.add(chaine);
			        		 ObjetsPris.add(imgObjet.get(n-1)); 
			        		 totalp+=poids[n];
			        		 totalv+=valeur[n]; 
						        }
						
			        		}
			       
					fenS = new bestscor(solutionFinale, ObjetsPris, totalv, totalp);
					valider.setEnabled(false); 
			 
			}}
		 
		}

	}
/*************************************************************/	  

