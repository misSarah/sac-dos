
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;



public class fenetredebut extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	String nombreObjets; 
	String poidsDuSac; 
	dd don; 
	p panInfo;
    
	public fenetredebut(String nombreObjets, String poidsSac){	
		this.nombreObjets=nombreObjets; 
		this.poidsDuSac=poidsSac; 
		this.setTitle("Résolution du problème du sac à dos");										//Titre de la fentre
	    this.setSize(993, 624);									//Taille de la fenetre
	    this.setLocationRelativeTo(null);						//Centrer la fentre sur l'ecran
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 	//Pour que Fermer ferme reellement
	    this.setResizable(false);
	    double width = ( 0.811*(getWidth()))+16;
	    this.don = new dd(								//Panel des cases
				(int)width,
				590,
				nombreObjets, poidsSac);
	    panInfo = new p(getWidth()-(int)width,590, nombreObjets , poidsSac) ;
		
		
		JPanel content = new JPanel(); 							//Panel Principal    
	    	   
	   (panInfo.getQuitter()).addActionListener(this);
	
	    content.setLayout(new BorderLayout());
	      
	    content.add(panInfo,BorderLayout.WEST);
	    content.add(don,BorderLayout.CENTER);
	
	    this.setContentPane(content);
	    
	    this.setVisible(true);
		}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		}
	
	
}
