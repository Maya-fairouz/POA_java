package EXO1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;

class Calcul implements ActionListener{
	
	@Override
	public void actionPerformed(ActionEvent e) {
	        JButton b = (JButton) e.getSource();
	        JOptionPane.showConfirmDialog(null, "Vous avez cliqué sur "+ b.getText(),
	        		"Ma boite message", JOptionPane. PLAIN_MESSAGE);

	}
	}