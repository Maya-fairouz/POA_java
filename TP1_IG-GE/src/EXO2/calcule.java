package EXO2;
import java.awt.FlowLayout;
import java.awt.TextField;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
class calcule extends JFrame {
          JLabel labelModule=new JLabel ("Module:"),
                labelControle=new JLabel("Controle:"),
                labelControleTP=new JLabel("Controle TP:"),
                labelResultat = new JLabel("Résultat: ");

          
          TextField txtControle= new TextField(10),
        		    txtControleTP=new TextField(10);
          
          JComboBox <String>comboModule= new JComboBox<String>();

          JButton btnAfficher = new JButton("Afficher"),
                  btnQuitter = new JButton("“Quitter");
          
          JPanel panModule= new JPanel(),
        		  panControle= new JPanel(),
                  panAffichage= new JPanel(),
                  panGlobal= new JPanel();

        public calcule() {

      comboModule.addItem("Algorithmque") ; 
      comboModule.addItem("Java");
      comboModule.addItem("UML");
      
      //panModule=new JPanel();  panModule.setLayout(new FlowLayout());
      panModule.add(labelModule);
      panModule.add(comboModule) ;
      
      // panControle.setLayout(new FlowLayout());
      panControle.add(labelControleTP) ;
      panControle.add(txtControleTP) ;
      panControle.add(labelControle) ;
      panControle.add(txtControle) ;
      
      // a suivre
      
      //panAffichage.setLayout(new FlowLayout());
      panAffichage.add(btnAfficher); panAffichage.add(btnQuitter) ;
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
      
       
      new calcule();
  }}
      
      
      
      
      
      
      
      
      
      










//package EXO2;
//
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.awt.event.ItemEvent;
//import java.awt.event.ItemListener;
//import java.lang.reflect.Array;
//import java.util.ArrayList;
//
//import javax.swing.Action;
//import javax.swing.JButton;
//import javax.swing.JComboBox;
//import javax.swing.JFrame;
//import javax.swing.JLabel;
//import javax.swing.JTextField;
//
//public class calcule extends JFrame implements ItemListener, ActionListener{
//
//	public calcule(){
//	JLabel module = new JLabel();
//	ArrayList<String> JcomboBox = new ArrayList<String>();
//	JcomboBox.add("Algorithme");
//	JcomboBox.add("Java");
//	JcomboBox.add("UML");
//	
//	
//	JLabel controle =new JLabel();
//    JLabel controleTP = new JLabel();
//    JTextField cntr = new JTextField();
//    JTextField cntrTP = new JTextField();
//    
//    JButton Quitter = new JButton();
//    JButton Afficher = new JButton();
//	}
//	
//	
//	@Override
//	public void actionPerformed(ActionEvent e) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void itemStateChanged(ItemEvent e) {
//		// TODO Auto-generated method stub
//		
//	}
	


