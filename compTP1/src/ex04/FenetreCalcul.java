package ex04;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FenetreCalcul extends JFrame{
	
	int operation = 0;
	PanneauCalcul paneCalcul = new PanneauCalcul();
	
	public FenetreCalcul(int operation) {
		this.operation = operation;
		setSize(400,400);
		setLocation(500,300);
		getContentPane().add(paneCalcul);
		
        paneCalcul.btnModifier.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				new FenetreOperation();
			}
		});
        
        paneCalcul.btnAfficher.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String msg = "La valeur est : ";
				JOptionPane.showConfirmDialog(null,msg+""+new Operation(operation).getResult(Integer.parseInt(paneCalcul.feildA.getText()),Integer.parseInt(paneCalcul.feildB.getText())),new Operation(operation).toString(),JOptionPane.PLAIN_MESSAGE);
			}
		});

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		pack();
		setVisible(true);
	}
}
