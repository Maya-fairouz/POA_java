package ex04;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanneauOperation extends JPanel{
	
	final public int ADDITION = 0;
	final public int SOUSTRACTION = 1;
	final public int MULTIPLICATON = 2;
	final public int DIVISION = 3;
	final public int MODULO = 4;
	
	private int operation ;

	JLabel labelChoix = new JLabel("Choix");
	
	JComboBox<Operation> comboOperation = new JComboBox<Operation>();
	
	JButton btnConfirmer = new JButton("Confirmer");
	JButton btnAnnuler = new JButton("Annuler");
	
	JPanel paneCombo = new JPanel();
	JPanel paneButtons = new JPanel();
	
	public PanneauOperation(int operation) {
		this.operation = operation;
		
		comboOperation.addItem(new Operation(0));
		comboOperation.addItem(new Operation(1));
		comboOperation.addItem(new Operation(2));
		comboOperation.addItem(new Operation(3));
		comboOperation.addItem(new Operation(4));
		
		paneCombo.add(labelChoix);paneCombo.add(comboOperation);
		
		paneButtons.add(btnConfirmer);paneButtons.add(btnAnnuler);
		
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		add(paneCombo);add(paneButtons);
	}

}
