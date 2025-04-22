package ex04;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Arrays;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class FenetreSignin extends JFrame{

	JLabel labelNom = new JLabel("Nom :");
	JLabel labelPrenom = new JLabel("Prenom :");
	JLabel labelUserName = new JLabel("UserName :");
	JLabel labelPassword = new JLabel("Mot de passe :");
	JLabel labelPasswordConfirmed = new JLabel("Confirmer Mot de passe :");
	
	JTextField feildNom = new JTextField();
	JTextField feildPrenom = new JTextField();
	JTextField feildUserName = new JTextField();
	JPasswordField feildPassword = new JPasswordField();
	JPasswordField feildPasswordConfirmed = new JPasswordField();
	
	JButton btnAnnuler = new JButton("Annuler");
	JButton btnSignin = new JButton("s'inscrire");
	
    JPanel p = new JPanel();
	
	public FenetreSignin() {
		setTitle("S'inscrire");
		setSize(400,400);
		setLocation(500, 300);
		
		btnSignin.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(Arrays.equals(feildPassword.getPassword() , feildPasswordConfirmed.getPassword())) {
					Vector<Utilisateur> tab = new Vector<Utilisateur>();
					tab.add(new Utilisateur(feildNom.getText(),feildPrenom.getText(),feildUserName.getText(),String.valueOf(feildPassword.getPassword())));
					dispose();
					new FenetreLogin(tab);					
				}
			}
		});
		
		btnAnnuler.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				new FenetreLogin(new Vector<Utilisateur>());
			}
		});
		
		p.setLayout(new GridLayout(6,2));
		
		p.add(labelNom);p.add(feildNom);
		p.add(labelPrenom);p.add(feildPrenom);
		p.add(labelUserName);p.add(feildUserName);
		p.add(labelPassword);p.add(feildPassword);
		p.add(labelPasswordConfirmed);p.add(feildPasswordConfirmed);
		p.add(btnSignin);p.add(btnAnnuler);
		
       setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		addWindowListener(new WindowAdapter() {
			
			@Override
			public void windowClosed(WindowEvent e) {
				new FenetreLogin(new Vector<Utilisateur>());
			}
		});
		
		getContentPane().add(p);
		pack();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
}
