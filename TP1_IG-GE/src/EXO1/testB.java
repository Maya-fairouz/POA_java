package EXO1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class testB extends JFrame implements ActionListener {
	JButton btnValider =  new JButton( "Valider"),
            btnAnnuler = new JButton( "Annuler"),
            btnAppliquer = new JButton("Appliquer");
	JCheckBox caseCheck1 = new JCheckBox("premier option"),
			  caseCheck2 = new JCheckBox("deuxieme option");
            
    JPanel p =new JPanel();
    
    
    public testB() {
	   btnValider.setFocusable(false);
	   btnAnnuler.setFocusable(false);
	   btnAppliquer.setFocusable(false);
	   caseCheck1.setFocusable(false);
	   caseCheck2.setFocusable(false);
	   
        setTitle("Fenetre Calcul");
        setSize(300,100);
       
        btnValider.addActionListener(this);
        btnAnnuler.addActionListener(this);
        btnAppliquer.addActionListener (this);
        caseCheck1.addActionListener(this);
        caseCheck2.addActionListener(this);
        
        p.add(btnAnnuler);
        p.add(btnAppliquer);
        p.add(btnValider);
        p.add(caseCheck1);
        p.add(caseCheck2);
        
        setContentPane(p);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
        
    public static void main(String[] args) {
        new testB();
        }
    
        @Override
        public void actionPerformed(ActionEvent e) {
        	Object o = e.getSource();
        	if(o instanceof JButton) {
        		JButton b= (JButton)o;
        		JOptionPane.showConfirmDialog (null, "Vous avez cliqué sur "
            			+ b.getText(), "Ma boite message", JOptionPane. PLAIN_MESSAGE);
        	}
        	else {
        		if( o instanceof JCheckBox) {
        		JCheckBox c = (JCheckBox)o;
        		JOptionPane.showConfirmDialog (null, "Vous avez cliqué sur "
            			+ c.getText(), "Ma boite message", JOptionPane. PLAIN_MESSAGE);

        		}
        	}
        	
        
	}
}