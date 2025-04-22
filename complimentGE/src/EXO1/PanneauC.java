package EXO1;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PanneauC extends JPanel {
	           
	
	String[] tabEtiquette = {"1","2","3","4","5","6","7","8","9","*","0","#"};
	JButton [] tabBouton = new JButton[tabEtiquette.length];
	
	
		public PanneauC() {
			
	        
		this.setLayout(new GridLayout(4, 3));
		
		for (int i = 0; i < tabBouton.length; i++) {
			tabBouton[i]= new JButton(tabEtiquette[i]);
			this.add(tabBouton[i]);
		}
	   

		}

		public static void main(String[] args) {
			PanneauC panC = new PanneauC();
			JFrame frame = new JFrame();
			frame.setTitle("test");
			frame.setLocation(500, 500);
			frame.setSize(200,150);
			
			frame.setLocationRelativeTo(panC);
			frame.add(panC);
			//frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
			frame.setVisible(true);

		}
		
	}


