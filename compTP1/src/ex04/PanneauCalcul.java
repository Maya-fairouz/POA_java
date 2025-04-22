package ex04;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanneauCalcul extends JPanel{

	int operation = 0;
	Operation op = new Operation(operation);
	
	JLabel labelAfficher = new JLabel(op.toString());
	JLabel labelA = new JLabel("A : ");
	JLabel labelB = new JLabel("B : ");
	
	JTextField feildA = new JTextField(15);
	JTextField feildB = new JTextField(15);
	
	JButton btnModifier = new JButton("Modifier");
	JButton btnAfficher = new JButton("Afficher");
	
	JPanel paneFeildA = new JPanel();
	JPanel paneFeildB = new JPanel();
	JPanel paneButtons = new JPanel();
	
	public PanneauCalcul(){
		paneFeildA.add(labelA);paneFeildA.add(feildA);
		paneFeildB.add(labelB);paneFeildB.add(feildB);
		
		paneButtons.add(btnModifier);
		paneButtons.add(btnAfficher);
		
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		add(paneFeildA);add(paneFeildB);add(paneButtons);
	}
}
