package EXO2;
import java.awt.FlowLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
class calcule3 extends JFrame implements ItemListener,ActionListener{
          JLabel labelModule=new JLabel ("Module:"),
                labelControle=new JLabel("Controle:"),
                labelControleTP=new JLabel("Controle TP:"),
                labelResultat = new JLabel("Résultat: ");

          
          TextField txtControle= new TextField(10),
        		    txtControleTP=new TextField(10);
          
          JComboBox <String>comboModule= new JComboBox<String>();

          JButton btnAfficher = new JButton("Afficher"),
                  btnQuitter = new JButton("Quitter");
          
          JPanel panModule= new JPanel(),
        		  panControle= new JPanel(),
                  panAffichage= new JPanel(),
                  panGlobal= new JPanel();

        public calcule3() {

      comboModule.addItem("Algorithmque") ; 
      comboModule.addItem("Java");
      comboModule.addItem("UML");
      
      comboModule.addItemListener(this);
      
      //panModule=new JPanel();  panModule.setLayout(new FlowLayout());
      panModule.add(labelModule);
      panModule.add(comboModule) ;
      
      // panControle.setLayout(new FlowLayout());
      panControle.add(labelControleTP) ;
      panControle.add(txtControleTP) ;
      panControle.add(labelControle) ;
      panControle.add(txtControle) ;
      
      btnAfficher.addActionListener(this);
      btnQuitter.addActionListener(this);
      
      // a suivre
      
      //panAffichage.setLayout(new FlowLayout());
      panAffichage.add(btnAfficher);
      panAffichage.add(btnQuitter) ;
      panAffichage.add(labelResultat) ;
      
      panGlobal.setLayout(new BoxLayout(panGlobal, BoxLayout.Y_AXIS));
      panGlobal.add(panModule) ;
      
      panGlobal.add(panControle);
      
      panGlobal.add(panAffichage) ;
      
      getContentPane().add(panGlobal) ;
      pack();
      setLocationRelativeTo(null);
      setVisible(true);
      
      }
        
        private float calculerMoyenne() {
          return (Float.valueOf(txtControle.getText())*2+Float.valueOf(txtControleTP.getText()))/3;
		}
  public static void main(String[] args) {
      
       
      new calcule3();
  }
@Override
public void itemStateChanged(ItemEvent e) {
   txtControle.setText("");
   txtControleTP.setText("");
   labelResultat.setText("");
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	JButton btn = (JButton) e.getSource();
	if(btn.equals(btnAfficher))
		labelResultat.setText("moyenne de"+
	comboModule.getSelectedItem().toString() +":"+String.valueOf(calculerMoyenne()));
	else System.exit(0);
	
}
	
}

     
