package ex01;

import javax.swing.JTabbedPane;

public class PanneauE extends JTabbedPane{

	PanneauA paneA = new PanneauA();	
	PanneauB paneB = new PanneauB();	
	PanneauC paneC = new PanneauC();	
	PanneauD paneD = new PanneauD();
	
	public PanneauE() {
		add("PanneauA", paneA);
		add("PanneauB", paneB);
		add("PanneauC", paneC);
		add("PanneauD", paneD);
	}
}
