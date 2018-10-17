import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Random;
import java.util.StringTokenizer;
import java.util.TreeMap;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;


public class main {//extends JFrame implements ActionListener{
	
	
	String nombreObjets, poidsSac; 
	public static fenetredebut fen3 ; 
	
	public static void main(String[] args){
		
		try {
			
		    UIManager.setLookAndFeel("com.jtattoo.plaf.graphite.GraphiteLookAndFeel");
		    
			   } catch(ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) { 
			       System.out.println("Error setting native LAF: " + e);
			   }
			  
			  
		   EventQueue.invokeLater(new Runnable() 
		   {
		           @Override
		           
		   public void run() {
		   try {
		        
			   Fenetre1 fen = new Fenetre1();
			   fen.setVisible(true);
				
		 }catch (Exception e){
		               	
		               }
		           }
		           });

		}
			
			public static void RemplirDonnees(String nombreObjets, String poidsSac)
			{
				fen3 = new fenetredebut(nombreObjets, poidsSac); 
			}
			
			
			
			
			
			
			
	}
	
	
	
	

