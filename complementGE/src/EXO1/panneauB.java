package EXO1;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class panneauB extends JPanel{
	JFrame fenetre = new JFrame();
	 JButton b1 = new JButton("Bouton 1"),
			   b2= new JButton("bouton 3"),
	           b3 = new JButton("Bouton 3"),
	           b4 = new JButton("Bouton 4"),
	           b5 = new JButton("Bouton 5");
	           
     public panneauB() {
//     fenetre.setTitle("Panneau B");
//     fenetre.setSize(300, 200);
     this.setLayout(new FlowLayout());
     this.add(b1);this.add(b2);this.add(b3); this.add(b4);this.add(b5);
     fenetre.getContentPane().add(this);

//     fenetre.setVisible(true) ;
   //  setDefaultCloseOperation(EXIT_ON_CLOSE) ;
//     fenetre.setLocationRelativeTo(null) ;
}
     public static void main(String[] args) {
		panneauB panB = new panneauB();
		JFrame frame = new JFrame();
		frame.setTitle("test");
		frame.setLocation(500, 500);
		frame.setSize(300,200);
		frame.setLocationRelativeTo(panB);
		frame.add(panB);
		//frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}