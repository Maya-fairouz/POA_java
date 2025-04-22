package ex03;

import java.awt.Color;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JPanel;

public class Couleur extends JPanel {

	JButton btnRouge = new JButton("Rouge"),
			btnVert = new JButton("Vert"),
			btnBleu = new JButton("Bleu");
	
	JCheckBox checkOption1 = new JCheckBox("Option n°1 "),
			  checkOption2 = new JCheckBox("Option n°2 ");
	
	public Couleur() {
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		btnRouge.addActionListener(new Ecouteur(Color.RED,this));
		btnRouge.addMouseListener(new Ecouteur());
		btnVert.addActionListener(new Ecouteur(Color.GREEN,this));
		btnVert.addMouseListener(new Ecouteur());
		btnBleu.addActionListener(new Ecouteur(Color.BLUE,this));
		btnBleu.addMouseListener(new Ecouteur());
		
		checkOption1.addItemListener(new Ecouteur());
		checkOption1.addMouseListener(new Ecouteur());
		checkOption2.addItemListener(new Ecouteur());
		checkOption2.addMouseListener(new Ecouteur());
		
		addMouseListener(new Ecouteur());
		
		add(btnRouge);add(btnVert);add(btnBleu);
		add(checkOption1);add(checkOption2);
	}
}
