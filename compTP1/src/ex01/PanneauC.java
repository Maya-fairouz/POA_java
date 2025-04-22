package ex01;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PanneauC extends JPanel{
	
	public String [] tabEtiquete = {"1","2","3","4","5","6","7","8","9","*","0","#"};	
	public JButton [] tabButton = new JButton[tabEtiquete.length]; 
	
	public PanneauC() {
		setLayout(new GridLayout(4,3));
		for (int i = 0; i < tabButton.length; i++) {
			add(tabButton[i] = new JButton(tabEtiquete[i]));
		}
	}
}
