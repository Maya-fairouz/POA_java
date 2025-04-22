package EXO1;

import javax.swing.JFrame;
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
	public static void main(String[] args) {
		PanneauE panE = new PanneauE();
		JFrame frame = new JFrame();
		frame.setTitle("test");
		frame.setLocation(500, 500);
		frame.setSize(400,400);
		frame.setLocationRelativeTo(panE);
		frame.add(panE);
		//frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
