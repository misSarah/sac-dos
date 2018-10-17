

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class bestscor extends JFrame
{    
	 ArrayList<String> solutionFinale;
	 ArrayList<Integer> ObjetsPris;
     public bestscor(ArrayList<String> solutionFinale,  ArrayList<Integer> ObjetsPris, int totalv, int totalp)
     {
    	this.solutionFinale=solutionFinale;
    	this.ObjetsPris=ObjetsPris; 
    	this.setTitle("Problème résolu :) ");								//Titre de la fentre
 	    this.setSize(488, 423);									//Taille de la fenetre
 	    this.setLocationRelativeTo(null);						//Centrer la fentre sur l'ecran
 	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 	//Pour que Fermer ferme reellement
 	    this.setResizable(false);								//La fenetre ne peut pas etre redimendionnée
     	this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
     	    	
     	Container c = this.getContentPane();
     	
     	c.setLayout(new BorderLayout());
     	c.add(new tete(c.getWidth(), totalv, totalp),BorderLayout.NORTH);
     	c.add(new sol(500, solutionFinale,ObjetsPris),BorderLayout.CENTER);
     	
     	this.setVisible(true);
     }
     
}
