package ex03;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JPanel;

public class Ecouteur extends MouseAdapter implements ActionListener , ItemListener {
	
	JPanel p = new JPanel();
	
	Color c ;
	
	public Ecouteur() {}
	
	public Ecouteur(Color c, JPanel p) {
		this.c = c;
		this.p = p;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		p.setBackground(c);
		JButton b = (JButton) e.getSource();
		System.out.println("La couleur de l'arriere plan est changé en : "+b.getText());
	}
	
	@Override
	public void itemStateChanged(ItemEvent e) {
		JCheckBox cb = (JCheckBox) e.getSource();
		if(cb.isSelected())
			System.out.println("Vous avez cocher "+cb.getText());
		else
			System.out.println("Vous avez décocher "+cb.getText());			
	}
	
	@Override
	public void mouseEntered(MouseEvent e) {
		Object o = e.getSource();
		if(o instanceof JPanel)
			System.out.println("Vous etes sur le Panneau");
		if(o instanceof JButton) {			
			JButton b = (JButton) o;
			System.out.println("Vous etes sur le Bouton "+b.getText());
		}
		if(o instanceof JCheckBox) {
			JCheckBox cb = (JCheckBox) o;
			System.out.println("Vous etes sur l'"+cb.getText());
		}
	}
	
}
