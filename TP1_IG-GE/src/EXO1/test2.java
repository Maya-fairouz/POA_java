package EXO1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class test2 extends JFrame implements ActionListener {
	JButton btnValider =  new JButton( "Valider"),
            btnAnnuler = new JButton( "Annuler"),
            btnAppliquer = new JButton("Appliquer");
            
    JPanel p =new JPanel();
    
    
    public test2() {
	
        setTitle("Fenetre Calcul");
        setSize(300,100);
       
        btnValider.addActionListener(this);
        btnAnnuler.addActionListener(this);
        btnAppliquer.addActionListener (this);
        
        p.add(btnAnnuler);
        p.add(btnAppliquer);
        p.add(btnValider);
        setContentPane(p);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame. EXIT_ON_CLOSE);
        setVisible(true);
    }
        
    public static void main(String[] args) {
        new test2();
        }
        @Override
        public void actionPerformed(ActionEvent e) {
        	JButton b = (JButton) e.getSource();
        	JOptionPane.showConfirmDialog (null, "Vous avez cliqué sur "
        			+ b.getText(), "Ma boite message", JOptionPane. PLAIN_MESSAGE);


	}
}