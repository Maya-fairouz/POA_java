package EXO1;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax. swing. JPanel;

public class test3 extends JFrame  {



	 
	     JButton btnValider = new JButton ("Valider"),

	            btnAnnuler = new JButton( "Annuler"),

	            btnAppliquer = new JButton("Appliquer");

	     JPanel p =new JPanel();
	     public test3() {
	 
	         setTitle( "Fenetre Calcul");
	         setSize(300,100);
	         
	     
	         btnAppliquer.addActionListener(new ActionListener() {
	        	 
	        	 @Override
	        	 public void actionPerformed(ActionEvent e) {
	        		 JOptionPane.showConfirmDialog(null,
	        				 "Vous avez cliqué sur Appliquer", "Ma boite message", JOptionPane.PLAIN_MESSAGE);
	        	 }
	         });
	         btnValider.addActionListener(new ActionListener() {
	        	 
	        	 @Override
	        	 public void actionPerformed(ActionEvent e) {
	        		 JOptionPane.showConfirmDialog(null,
	        				 "Vous avez cliqué sur Valider", "Ma boite message", JOptionPane.PLAIN_MESSAGE);
	        	 }
	         });
	         btnAnnuler.addActionListener(new ActionListener() {
	        	 
	        	 @Override
	        	 public void actionPerformed(ActionEvent e) {
	        		 JOptionPane.showConfirmDialog(null,
	        				 "Vous avez cliqué sur Annuler", "Ma boite message", JOptionPane.PLAIN_MESSAGE);
	        	 }
	         });
	        
	        
	         p.add(btnAnnuler);
	         p.add(btnAppliquer);
	         p.add(btnValider);
	         setContentPane(p);
	         setLocationRelativeTo(null);
	         setDefaultCloseOperation(JFrame. EXIT_ON_CLOSE);
	         setVisible(true);
	         
	         
	     }
public static void main(String[] args) {
	new test3();
	}
}	     

	        
