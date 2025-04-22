package EXO2;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.StringTokenizer;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Calculatrice extends JFrame implements ActionListener{

	
			String[] tabEtiquette = {"7","8","9","BACKSPACE","4","5","6","*","CE","1","2","3",
					"+","=","0","."};
			JButton [] tabBouton = new JButton[tabEtiquette.length];
			
			
			JPanel p = new JPanel();
			
			JTextArea textField = new JTextArea();
	String temp="";

			public Calculatrice() {
	temp = "";
				setTitle("Calculatrice");
			      //  setSize(300, 200);
			  
				p.add(textField);
				for (int i = 0; i < tabBouton.length; i++) {
					tabBouton[i]= new JButton(tabEtiquette[i]);
					p.add(tabBouton[i]);
				}
				
				for (int i = 0; i < tabBouton.length; i++) {
					tabBouton[i].addActionListener(this);
				}
			
				getContentPane().add(p);

				pack();

				setVisible(true) ;
				setDefaultCloseOperation(EXIT_ON_CLOSE) ;
				setLocationRelativeTo(null) ;

			     p.setLayout(new GridBagLayout());

			     GridBagConstraints c = new GridBagConstraints();
	            	c.fill=GridBagConstraints.BOTH;
                    
	            	
	        c.gridx=0;c.gridy= 0;
	        c.gridheight=1;c.gridwidth=5;
	        p.add(textField,c); 
			
	        c.gridx=0;c.gridy=1;
	        c.gridheight=1;c.gridwidth=1;
			p.add(tabBouton[0],c); 
			
		    c.gridx=1;c.gridy=1;
		    c.gridheight=1;c.gridwidth=1;
		    p.add(tabBouton[1],c);
		    
		    c.gridx=2;c.gridy=1;
		    c.gridheight=1;c.gridwidth=1;
		    p.add(tabBouton[2],c);

		    c.gridx=3;c.gridy=1;
		    c.gridheight=1;c.gridwidth=2;
		    p.add(tabBouton[3],c);
	//--------------------------------
		    c.gridx=0;c.gridy=2;
		    c.gridheight=1;c.gridwidth=1;
		    p.add(tabBouton[4],c);

		    c.gridx=1;c.gridy=2;
		    c.gridheight=1;c.gridwidth=1;
		    p.add(tabBouton[5],c);

		    c.gridx=2;c.gridy=2;
		    c.gridheight=1;c.gridwidth=1;
		    p.add(tabBouton[6],c);

		    c.gridx=3;c.gridy=2;
		    c.gridheight=1;c.gridwidth=1;
		    p.add(tabBouton[7],c);

		    c.gridx=4;c.gridy=2;
		    c.gridheight=1;c.gridwidth=1;
		    p.add(tabBouton[8],c);

		    //-----------------------------
		    c.gridx=0;c.gridy=3;
		    c.gridheight=1;c.gridwidth=1;
		    p.add(tabBouton[9],c);

		    c.gridx=1;c.gridy=3;
		    c.gridheight=1;c.gridwidth=1;
		    p.add(tabBouton[10],c);

		    
		    c.gridx=2;c.gridy=3;
		    c.gridheight=1;c.gridwidth=1;
		    p.add(tabBouton[11],c);

		    c.gridx=3;c.gridy=3;
		    c.gridheight=1;c.gridwidth=1;
		    p.add(tabBouton[12],c);
		    
		    c.gridx=4;c.gridy=3;
		    c.gridheight=2;c.gridwidth=1;
		    p.add(tabBouton[13],c);
		    
		    //---------------------------------------
		    c.gridx=0;c.gridy=4;
		    c.gridheight=1;c.gridwidth=3;
		    p.add(tabBouton[14],c);
		    
		    c.gridx=3;c.gridy=4;
		    c.gridheight=1;c.gridwidth=1;
		    p.add(tabBouton[15],c);
		    

		  
		    getContentPane().add(p);
		    pack();
		    setVisible(true);
		    setDefaultCloseOperation(EXIT_ON_CLOSE);
		    setLocationRelativeTo(null);

	}
			public static void main(String[] args) {
				new Calculatrice();
			}
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JButton btn = (JButton) e.getSource();
				
				
					
					if (btn.equals(tabBouton[3])) {
						
						
						textField.setText(textField.getText().substring(0,textField.getText().length()-1));
						temp = temp.substring(0,temp.length()-1);
					
					}
					else if (btn.equals(tabBouton[8])) {
						
						textField.setText("0");
						temp="";
						
					}		
					else if (btn.equals(tabBouton[13])) {
						textField.setText(textField.getText() +"=" + String.valueOf(tokenResultat()));
						
					}		
					
					else  {                		

						 temp=temp+btn.getText();
					     textField.setText(temp);
					}
				}
			
			private float tokenResultat() {
				// TODO Auto-generated method stub

				StringTokenizer stPlus = new StringTokenizer(textField.getText(), "+");
		     	float somme=0;
		     	while (stPlus.hasMoreTokens()) {
		     		
		     		float prod=1;
		     		StringTokenizer stProd = new StringTokenizer(stPlus.nextToken(), "*");
		     		while(stProd.hasMoreTokens()) {
		     			prod=prod*Float.parseFloat(stProd.nextToken());
		     	
		     	 }
		     	somme=prod+somme;
		
		     	}	
		     	  return (somme);
			}
	}
		
			
