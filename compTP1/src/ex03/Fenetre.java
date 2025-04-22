package ex03;

import javax.swing.JFrame;

public class Fenetre extends JFrame{

	Couleur pane = new Couleur();
	
	public Fenetre() {
		setTitle("Test Couleur");
		setSize(400,400);
		setLocation(500,500);
		setContentPane(pane);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new Fenetre();
	}
}
