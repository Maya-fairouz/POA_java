package ex01;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

public class PanneauA extends JPanel{
	
	JButton b1 = new JButton("1");
	JButton b2 = new JButton("2");
	JButton b3 = new JButton("3");
	JButton b4 = new JButton("4");
	JButton b5 = new JButton("5");
	
	public PanneauA(){
		setLayout(new BorderLayout());
		add(b1 , BorderLayout.NORTH);
		add(b2 , BorderLayout.SOUTH);
		add(b3 , BorderLayout.CENTER);
		add(b4 , BorderLayout.WEST);
		add(b5 , BorderLayout.EAST);
	}
}
