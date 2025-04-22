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
	           
  JPanel p = new JPanel();
  

     public FenetreC() {
          setTitle("Fenetre C.");
          setSize(300, 200);

          p.setLayout(new BoxLayout(p, BoxLayout.X_AXIS));
          p.add(b1) ;p.add(b2);p.add(b3);
          p.add(b4) ;p.add(b5) ;
          getContentPane().add(p);

          setVisible(true) ;
          setDefaultCloseOperation(EXIT_ON_CLOSE) ;
          setLocationRelativeTo(null) ;

}

public static void main(String[] args) {
new FenetreC();

}
}