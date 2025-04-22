package EXO3;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Ecouteur implements ActionListener{
	Color c = new Color(0);
	JPanel p = new JPanel(); 

	public Ecouteur(Color c,JPanel p) {
		this.c=c;
		this.p=p;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		p.setBackground(c);
		JButton b = (JButton) e.getSource();
		System.out.println("La couleur de l'arriere plan est changé en : "+b.getText());
	}
	
	
}
