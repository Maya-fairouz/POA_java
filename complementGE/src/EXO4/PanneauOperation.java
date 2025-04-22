package EXO4;

import java.awt.BorderLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.Action;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.plaf.basic.ComboPopup;

import org.w3c.dom.Text;

public class PanneauOperation extends JFrame implements ItemListener, ActionListener{

	final public int ADDITION = 0;
	final public int SOUSTRACTION = 1;
	final public int MULTIPLICATON = 2;
	final public int DIVISION = 3;
	final public int MODULO = 4;
	
	private int operation ;
	
	JLabel txtchoix = new JLabel("Choix :");
	
	JButton btnConfirmer = new JButton("Confirmer"),
			btnAnnuler = new JButton("Annuler");
	
	JComboBox <String>comboOperation= new JComboBox<String>();
	
	JPanel panGlobal = new JPanel(),
		   panChoix = new JPanel(),
		   panButton = new JPanel();
	
	public PanneauOperation( int operation) {
		this.operation=operation;
		setTitle("Panneau Operation. ");
		setSize(350,150);
		panGlobal.setLayout(new BoxLayout(panGlobal,BoxLayout.Y_AXIS));		
		panGlobal.add(panChoix);
		panGlobal.add(panButton);
		
		comboOperation.addItem("ADDITION");
		comboOperation.addItem("SOUSTRACTION");
		comboOperation.addItem("MULTIPLICATION");
		comboOperation.addItem("DIVISION");
		comboOperation.addItem("MODULO");
		
		comboOperation.addItemListener(this);
		
		panChoix.add(txtchoix);
		panChoix.add(comboOperation);
		
		panButton.add(btnConfirmer);
		panButton.add(btnAnnuler);
		
		btnConfirmer.addActionListener(this);
		btnAnnuler.addActionListener(this);
		
		getContentPane().add(panGlobal);
//		pack();
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	
	}
public static void main(String[] args) {
//	new PanneauOperation();
}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == btnConfirmer) {
			 new PanneauCalcul();
			 dispose();
		}
		else {
			System.exit(0);
		}
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		if( e.getStateChange()==ItemEvent.SELECTED)
		{
			if(comboOperation.getSelectedItem().toString().equals("ADDITION")) {operation = 0; System.out.println("OOO");}
			else if(comboOperation.getSelectedItem().toString().equals("SOUSTRACTION")) {operation = 1;System.out.println("111");}
			else if(comboOperation.getSelectedItem().toString().equals("MULTIPLICATION")) {operation = 2;System.out.println("222");}
			else if(comboOperation.getSelectedItem().toString().equals("DIVISION")) {operation = 3;System.out.println("333");}
			else {operation = 4;System.out.println("444");
//				(comboOperation.getSelectedItem().toString().equals("MODULO"))
			}
			
		}
			
			
		}

	

}
