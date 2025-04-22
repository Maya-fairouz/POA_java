package EXO2;



import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class FenetreA extends JFrame{
   JButton b1 = new JButton("Bouton 1"),
		   b2= new JButton("bouton 3"),
           b3 = new JButton("Bouton 3"),
           b4 = new JButton("Bouton 4"),
           b5 = new JButton("Bouton 5");
           
         JPanel p = new JPanel();

      public FenetreA() {
       setTitle("Fenetre A.");
       setSize(300, 200);

          
          p.setLayout(new BorderLayout());

           p.add(b1, BorderLayout.CENTER); p.add(b2, BorderLayout.EAST) ;
           p.add(b3, BorderLayout.WEST) ; p.add(b4, BorderLayout.NORTH) ;
           p.add(b5, BorderLayout.SOUTH); getContentPane().add(p);

           setVisible(true) ;
           setDefaultCloseOperation(EXIT_ON_CLOSE) ;
           setLocationRelativeTo(null) ;

      }

public static void main(String[] args) {
new FenetreA();

}
}



