package EXO1;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;

public class panneauE extends JTabbedPane{

	panneauA paneA = new panneauA();	
	panneauB paneB = new panneauB();	
	panneauC paneC = new panneauC();	
	panneauD paneD = new panneauD();
	
	public panneauE() {
		add("PanneauA", paneA);
		add("PanneauB", paneB);
		add("PanneauC", paneC);
		add("PanneauD", paneD);
	}
	public static void main(String[] args) {
		panneauE panE = new panneauE();
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
