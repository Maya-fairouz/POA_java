package EXO1;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class test1 extends JFrame {


	     JButton btnValider = new JButton ("Valider"),
	             btnAnnuler = new JButton ("Annuler"),
	             btnAppliquer = new JButton("Appliquer");
	     JPanel p =new JPanel();
	     public test1() {
	         setTitle("Fenetre Calcul"); 
	         setSize (300,100);
	         Calcul x = new Calcul();
	         btnAppliquer .addActionListener (x);
	         btnValider.addActionListener(x);
	         btnAnnuler.addActionListener(x);
	       p.add(btnAnnuler);
	       p.add(btnAppliquer);
	       p.add(btnValider);
	         setContentPane(p);
	         setLocationRelativeTo(null);
	         setDefaultCloseOperation(JFrame. EXIT_ON_CLOSE);
	         setVisible(true);
	         
}
	     public static void main(String[] args) {
	         new test1();
	     }

}
