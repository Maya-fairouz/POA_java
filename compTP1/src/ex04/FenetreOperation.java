package ex04;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

public class FenetreOperation extends JFrame{

	int operation ;
	
	
	public FenetreOperation() {
		
		PanneauOperation paneOperation = new PanneauOperation(operation);
				
		setSize(400,400);
		setLocation(500,300);
		getContentPane().add(paneOperation);
		
		paneOperation.btnAnnuler.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				new FenetreCalcul(operation);
			}
		});
		
		paneOperation.btnConfirmer.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
			    FenetreOperation.this.operation = paneOperation.comboOperation.getSelectedIndex();
				new FenetreCalcul(operation);
			}
		});
		
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		addWindowListener(new WindowAdapter() {
			
			@Override
			public void windowClosed(WindowEvent e) {
				new FenetreCalcul(operation);
			}
		});
		
		pack();
		setVisible(true);
	}
}
