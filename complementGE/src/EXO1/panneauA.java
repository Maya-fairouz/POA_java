package EXO1;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class panneauA extends JPanel{



   JFrame fenetre = new JFrame();

   JButton b1 = new JButton("Bouton 1"),
		   b2= new JButton("bouton 2"),
           b3 = new JButton("Bouton 3"),
           b4 = new JButton("Bouton 4"),
           b5 = new JButton("Bouton 5");
           
       //  JPanel panA = new JPanel();

      public panneauA() {
//       fenetre.setTitle("Panneau A.");
//       fenetre.setSize(300, 200);
//       fenetre.add(this);
          
       this.setLayout(new BorderLayout());

       this.add(b1, BorderLayout.CENTER); this.add(b4, BorderLayout.EAST) ;
       this.add(b2, BorderLayout.WEST) ; this.add(b3, BorderLayout.NORTH) ;
       this.add(b5, BorderLayout.SOUTH);
         //  fenetre.getContentPane().add(this);

           //fenetre.setVisible(true) ;
//           fenetre.setDefaultCloseOperation(EXIT_ON_CLOSE) ;
          //fenetre.setLocationRelativeTo(null) ;

      }

public static void main(String[] args) {

	panneauA panA = new panneauA();
	JFrame frame = new JFrame();
	frame.setTitle("test");
	frame.setLocation(500, 500);
	frame.setSize(300,200);
	frame.setLocationRelativeTo(panA);
	frame.add(panA);
//	frame.pack();
	//frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
	frame.setVisible(true);
}
}



