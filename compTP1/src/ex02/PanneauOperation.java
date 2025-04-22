package ex02;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class PanneauOperation extends JPanel{
	
	public String [] tabEtiquete = {"7","8","9","Backspace","4","5",
			"6","*","CE","1","2","3","+","=","0","."};
	public JButton [] tabButton = new JButton[tabEtiquete.length] ;
	
	public PanneauOperation() {
				
		for (int i = 0; i < tabButton.length ; i++) {
			tabButton[i] = new JButton(tabEtiquete[i]);
		}
		
		setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		c.fill = GridBagConstraints.BOTH ;
		
		c.gridx = c.gridy = 0 ;
		c.gridwidth = c.gridheight = 1 ;
		for (int i = 0; i < 4; i++) {
			if(i==3) {
				c.gridwidth = 3 ;
				add(tabButton[i],c);
				c.gridwidth = 1 ;
			}else
				add(tabButton[i],c);
			c.gridx += 1 ;
		}
		
		c.gridx= 0 ; c.gridy = 1 ;
		for (int i = 4; i < 9; i++) {
			if(i==8) {
				c.gridwidth = 2 ;
				add(tabButton[i],c);
				c.gridwidth = 1 ;
			}else
				add(tabButton[i],c);
			c.gridx += 1 ;
		}
		
		c.gridx = 0; c.gridy = 2;
		for (int i = 9; i < 14; i++) {
			if(i==13) {
				c.gridwidth = 2 ;
				c.gridheight = 2 ;
				add(tabButton[i],c);
			}else
				add(tabButton[i],c);
			c.gridx += 1 ;
		}
		
		c.gridx = 0 ; c.gridy = 3;
		c.gridheight = 1 ; c.gridwidth = 3 ;
		add(tabButton[14],c);
		
		c.gridx = 3 ; c.gridwidth = 1 ;
		add(tabButton[15],c);
	}
}
