package ex02;

import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanneauField extends JPanel{

	JTextField fieldExpression = new JTextField(30);
	
	public PanneauField() {
		fieldExpression.setEditable(false);
		add(fieldExpression);
	}
}
