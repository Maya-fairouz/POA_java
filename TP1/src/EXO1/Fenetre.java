package EXO1;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Fenetre {
 
	public static void main(String[] args) {
	
		JFrame fenetre = new JFrame();
		fenetre.setLocation(10, 40);
		fenetre.setSize(300, 200);

		//fenetre.setBounds(10, 40, 300, 200);
		JButton bouton = new JButton("OK");
		JPanel pane = new JPanel();



		pane.setLayout(new BorderLayout());
		pane.add(bouton, BorderLayout.CENTER) ;
		fenetre.getContentPane().add(pane);
		fenetre.setVisible(true);

		}

        
        
	}
	
        
	


