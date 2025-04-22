package EXO4;

import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class PanneauCalcul extends JFrame implements ActionListener{

	int operation;
	Operation ope = new Operation(operation); 
	JButton btnModifier = new JButton("Modifier")
			,btnAfficher = new JButton("Afficher");
	
	JLabel labelA = new JLabel("A:"),
		   labelB = new JLabel("B:"),
		   labelResultat = new JLabel("");
	
	TextField txtA = new TextField(10),
			  txtB = new TextField(10);
	
	JPanel panGlobal = new JPanel(),
		   panA = new JPanel(),
		   panB = new JPanel(),
		   panAffichage = new JPanel();
	
//	 private float getResultat() {
//		
//				// TODO Auto-generated method stub
//				if(operation==0) return (Float.valueOf(txtA.getText())+Float.valueOf(txtB.getText()));
//				else if(operation==1) return(Float.valueOf(txtA.getText())-Float.valueOf(txtB.getText()));
//				else if(operation==2)  return (Float.valueOf(txtA.getText())*Float.valueOf(txtB.getText()));
//				else if(operation==3)  return (Float.valueOf(txtA.getText())/Float.valueOf(txtB.getText()));
//				else if(operation==4)  return (Float.valueOf(txtA.getText())%Float.valueOf(txtB.getText()));
//				else return 0;
//			
//        
//		}
	
	
	public PanneauCalcul() {
		
		setTitle("Panneau Calcule. ");
		setSize(350,200);
	//	panInput.setLayout(new BoxLayout(panInput, BoxLayout.Y_AXIS));
		panA.add(labelA);
		panA.add(txtA);
		panB.add(labelB);
		panB.add(txtB);
		
		panAffichage.add(btnAfficher);
		panAffichage.add(btnModifier);
		panAffichage.add(labelResultat);
		
		btnAfficher.addActionListener(this);
		btnModifier.addActionListener(this);
		
	    panGlobal.setLayout(new BoxLayout(panGlobal, BoxLayout.Y_AXIS));
		panGlobal.add(panA);
		panGlobal.add(panB);
		panGlobal.add(panAffichage);
		
		getContentPane().add(panGlobal);
//		pack();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==btnModifier) {
			new PanneauOperation(operation);
			dispose();
		}
		else {
//			e.getSource()==btnAfficher)
				labelResultat.setText("Resultat : "+new Operation(operation).getResults(Integer.parseInt(txtA.getText()),
						Integer.parseInt(txtB.getText())));
			
				
//			e.getSource()==btnAfficher)
//				labelResultat.setText("Resultat de"+
//			comboperation.getSelectedItem().toString() +":"+String.valueOf(getResultat()));
//				
//				/JOptionPane.showConfirmDialog(null,msg+""+new Operation(operation).getResult(Integer.parseInt(paneCalcul.feildA.getText()),Integer.parseInt(paneCalcul.feildB.getText())),new Operation(operation).toString(),JOptionPane.PLAIN_MESSAGE);
//			
//			String msg = "La valeur est : ";
//				JOptionPane.showConfirmDialog(null,msg+""+
//				new Operation(operation).getResults(Integer.parseInt(txtA.getText()),
//						Integer.parseInt(txtB.getText())),
//				new Operation(operation).toString(),JOptionPane.PLAIN_MESSAGE);
			
				
		}
		
	}
	
	
	
	

}
