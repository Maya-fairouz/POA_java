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
class calcule2 extends JFrame implements ItemListener{
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

        public calcule2() {

      comboModule.addItem("Algorithmque") ; 
      comboModule.addItem("Java");
      comboModule.addItem("UML");
      
      comboModule.addItemListener(this);
      
      
      //******** la liste ta3 les modules **************
      panModule.add(labelModule);
      panModule.add(comboModule) ;
      
      //******** win n7ot inputes ta3i  **************
      panControle.add(labelControleTP) ;
      panControle.add(txtControleTP) ;
      panControle.add(labelControle) ;
      panControle.add(txtControle) ;
      
      // a suivre
      
      //******** l'affichage + botowat **************
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
  public static void main(String[] args) {
      
       
      new calcule2();
  }
@Override
public void itemStateChanged(ItemEvent e) {
   txtControle.setText("");
   txtControleTP.setText("");
   labelResultat.setText("");
}
	
}

     
