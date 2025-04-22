package ex02;

import java.awt.GridLayout;

import javax.swing.JFrame;

public class Calculatrice extends JFrame {

	PanneauOperation paneOperation = new PanneauOperation();
	PanneauField  paneFeild = new PanneauField();
	
	public Calculatrice() {
		
		Ecouteur e = new Ecouteur(paneOperation.tabButton , paneFeild.fieldExpression);
		
		for (int i = 0; i < paneOperation.tabButton.length ; i++) {
			paneOperation.tabButton[i].addActionListener(e);
		}
		
		setTitle("Calculatrice");
		setSize(400,400);
		setLocationRelativeTo(paneOperation);
		setLayout(new GridLayout(2,1));
		getContentPane().add(paneFeild);
		getContentPane().add(paneOperation);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		pack();
	}
	
	public static void main(String[] args) {
		new Calculatrice();
	}
}
