package EXO2;
import java.awt.BorderLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

class FenetreC extends JFrame{
	JButton b1 = new JButton("Bouton 1"),
			   b2= new JButton("bouton 3"),
	           b3 = new JButton("Bouton 3"),
	           b4 = new JButton("Bouton 4"),
	           b5 = new JButton("Bouton 5");
	           
JPanel p1 = new JPanel();
//  JScrollPane p = new JScrollPane();
  

     public FenetreC() {
          setTitle("Fenetre C.");
          setSize(300, 200);

          p1.setLayout(new BoxLayout(p1, BoxLayout.X_AXIS));
          p1.add(b1) ;p1.add(b2);p1.add(b3);
          p1.add(b4) ;p1.add(b5) ;
          getContentPane().add(p1);

          setVisible(true) ;
          setDefaultCloseOperation(EXIT_ON_CLOSE) ;
          setLocationRelativeTo(null) ;

}

public static void main(String[] args) {
new FenetreC();

}
}