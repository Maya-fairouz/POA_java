package ex04;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class FenetreLogin extends JFrame{
	
	static Vector<Utilisateur> tabUtilisateurs = new Vector<Utilisateur>();
	boolean exist = false ;
	
	JLabel labelUserName = new JLabel("UserName :");
	JLabel labelPassword = new JLabel("Mot de passe :");
	
	JTextField feildUserName = new JTextField();
	JPasswordField feildPassword = new JPasswordField();
	
	JButton btnLogin = new JButton("Se connecter");
	JButton btnSignin = new JButton("S'inscrire");
	
	JPanel p = new JPanel();
	
	public FenetreLogin(Vector<Utilisateur> tabUtilisateurs) {
		FenetreLogin.tabUtilisateurs.addAll(tabUtilisateurs);
		
		setTitle("Authentification");
		setSize(500,500);
		setLocation(500,300);
		
		FenetreLogin.tabUtilisateurs.addElement(new Utilisateur(null , null , "admin", "admin"));
		
		btnLogin.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					for (int i = 0; i < FenetreLogin.tabUtilisateurs.size(); i++) {
						if(FenetreLogin.tabUtilisateurs.elementAt(i).getUsername().equals(feildUserName.getText())&&
						   Arrays.equals(FenetreLogin.tabUtilisateurs.get(i).getPassword().toCharArray(),feildPassword.getPassword())) {
							exist = true;
							break;
						}
					}
					
					if(!exist)
						throw new Exception();
						
					dispose();
					new FenetreCalcul(0);					
				} catch (Exception exception) {
					String msg = "UserName ou Mot de passe non valide !";
					JOptionPane.showConfirmDialog(null , msg , "Unknown User",JOptionPane.PLAIN_MESSAGE);
				}
			}
		});
		
		btnSignin.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				new FenetreSignin();
			}
		});
		
		p.setLayout(new GridLayout(3,2));
		
		p.add(labelUserName);p.add(feildUserName);
		p.add(labelPassword);p.add(feildPassword);
		p.add(btnLogin);p.add(btnSignin);
		
		getContentPane().add(p);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		pack();
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new FenetreLogin(new Vector<Utilisateur>());
	}
}
