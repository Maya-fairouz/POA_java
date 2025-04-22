package EXO4;

import java.awt.Color;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.HashMap;

import javax.swing.Action;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginOperation extends JFrame implements ActionListener{
	int operation ;
	JLabel labelwlcm= new JLabel("Welcome !"),
		   labelUsername = new JLabel("Username : "),
           labelPassword= new JLabel("Password : "),
	       labelWrong = new JLabel();
		   
	TextField txtUsername = new TextField(20);
	JPasswordField txtPassword = new JPasswordField(24);
	
	JButton btnLogin = new JButton("Login");
	
	JPanel panGlobal = new JPanel(),
    	   panWlcm = new JPanel(),
		   panUsername = new JPanel(),
		   panPassword = new JPanel(),
		   panLogin = new JPanel(),
		   panWrong = new JPanel();
	
		  HashMap<String, String> loginInfo = new HashMap<String,String>();
	
	public LoginOperation(HashMap<String, String> loginInfoOriginal) {
		loginInfo = loginInfoOriginal;
		
		
		setTitle("Login.");
		setSize(400,350);
		
		panGlobal.setLayout(new BoxLayout(panGlobal, BoxLayout.Y_AXIS));
		panGlobal.add(panWlcm);
		panGlobal.add(panUsername);
		panGlobal.add(panPassword);
		panGlobal.add(panLogin);
		panGlobal.add(panWrong);
        
		panWlcm.add(labelwlcm);
        
		panUsername.add(labelUsername);
		panUsername.add(txtUsername);
		
		panPassword.add(labelPassword);
		panPassword.add(txtPassword);
		
		panLogin.add(btnLogin);
		
		panWrong.add(labelWrong);
		
		
		btnLogin.addActionListener(this);

		getContentPane().add(panGlobal);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		IDandPassword idandPasswords = new IDandPassword();
		LoginOperation loginoperation = new LoginOperation(idandPasswords.getLoginInfo());
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method 
		if(e.getSource()==btnLogin) {
			String userId =txtUsername.getText();
			String password = String.valueOf(txtPassword.getPassword());
			
			if(loginInfo.containsKey(userId)) {
				if (loginInfo.get(userId).equals(password)) {
					
					PanneauOperation panOperation = new PanneauOperation(operation);
					dispose();
				}
				else {
					labelWrong.setText("Wrong password .. try agin :(");
					labelWrong.setForeground(Color.RED);
					txtUsername.setText("");
					txtPassword.setText("");
				}
			}
				
				else {
					labelWrong.setText("Wrong username .. try agin :(");
					labelWrong.setForeground(Color.RED);
					txtUsername.setText("");
					txtPassword.setText("");
					
				}	
			}
		
	}


}











