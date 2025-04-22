package ex01;

import javax.swing.JFrame;

public class Fenetre extends JFrame {
	
	PanneauA paneA = new PanneauA();	
	PanneauB paneB = new PanneauB();	
	PanneauC paneC = new PanneauC();	
	PanneauD paneD = new PanneauD();
	PanneauE paneE = new PanneauE();
	
	public Fenetre() {
		setTitle("test");
		setLocation(500, 500);
		setSize(400,400);
		setLocationRelativeTo(paneE);
		add(paneE);
	    setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Fenetre();
	}
}
