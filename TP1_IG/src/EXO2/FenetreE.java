package EXO2;
import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FenetreE extends JFrame{
	JButton b1 = new JButton("Button 1"),
			   b2= new JButton("Button 2"),
	           b3 = new JButton("Button 3"),
	           b4 = new JButton("Button 4"),
	           b5 = new JButton("Button 5"),
	           b6 = new JButton("Button 6");

	JPanel p = new JPanel();

	public FenetreE() {
	    setTitle("Fenetre E.");
	    setSize(300, 200);

	     p.setLayout(new GridBagLayout());

	     GridBagConstraints c = new GridBagConstraints();
      	c.fill=GridBagConstraints.BOTH;
      	
	c.gridx=c.gridy=0;
	c.gridheight=c.gridwidth=1;
    p.add(b1,c);

	c.gridx=1;
	c.gridwidth=2;
	p.add(b2,c); 
	
	c.gridx=0;c.gridy=1;
	c.gridwidth=1;c.gridheight=2;
	p.add(b3,c); 
	
    
    c.gridx=1;c.gridy=1;
    c.gridheight=1;
    p.add(b4,c);
    
    c.gridx=2;
    p.add(b5,c);
    
    c.gridx=1;c.gridy=2;
    p.add(b6,c);
    
    
    getContentPane().add(p);
    pack();
    setVisible(true);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setLocationRelativeTo(null);
    
    
    
	
	
}
	public static void main(String[] args) {
		new FenetreE();
	}
}
