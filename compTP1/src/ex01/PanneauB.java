package ex01;

import javax.swing.JButton;
import javax.swing.JPanel;

public class PanneauB extends JPanel{
	
	JButton b1 = new JButton("1");
	JButton b2 = new JButton("2");
	JButton b3 = new JButton("3");
	JButton b4 = new JButton("4");
	JButton b5 = new JButton("5");
	
	public PanneauB(){
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
	}
}