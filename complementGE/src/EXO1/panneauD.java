package EXO1;


	import java.awt.BorderLayout;
	import java.awt.GridBagConstraints;
	import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
	import javax.swing.JFrame;
	import javax.swing.JPanel;

	public class panneauD extends JPanel{
      
		String[] tabEtiquette = {"7","8","9","BACKSPACE","4","5","6","*","CE","1","2","3",
				"+","=","0","."};
		JButton [] tabBouton = new JButton[tabEtiquette.length];
		
		

		public panneauD() {
		
			
			for (int i = 0; i < tabBouton.length; i++) {
				tabBouton[i]= new JButton(tabEtiquette[i]);
				this.add(tabBouton[i]);
			}
		

		     this.setLayout(new GridBagLayout());

		     GridBagConstraints c = new GridBagConstraints();
            	c.fill=GridBagConstraints.BOTH;
	      	
		
            	 c.gridx=0;c.gridy=0;
         	    c.gridheight=1;c.gridwidth=1;
		this.add(tabBouton[0],c); 
		
	    c.gridx=1;c.gridy=0;
	    c.gridheight=1;c.gridwidth=1;
	    this.add(tabBouton[1],c);
	    
	    c.gridx=2;c.gridy=0;
	    c.gridheight=1;c.gridwidth=1;
	    this.add(tabBouton[2],c);

	    c.gridx=3;c.gridy=0;
	    c.gridheight=1;c.gridwidth=2;
	    this.add(tabBouton[3],c);
//--------------------------------
	    c.gridx=0;c.gridy=1;
	    c.gridheight=1;c.gridwidth=1;
	    this.add(tabBouton[4],c);

	    c.gridx=1;c.gridy=1;
	    c.gridheight=1;c.gridwidth=1;
	    this.add(tabBouton[5],c);

	    c.gridx=2;c.gridy=1;
	    c.gridheight=1;c.gridwidth=1;
	    this.add(tabBouton[6],c);

	    c.gridx=3;c.gridy=1;
	    c.gridheight=1;c.gridwidth=1;
	    this.add(tabBouton[7],c);

	    c.gridx=4;c.gridy=1;
	    c.gridheight=1;c.gridwidth=1;
	    this.add(tabBouton[8],c);

	    //-----------------------------
	    c.gridx=0;c.gridy=2;
	    c.gridheight=1;c.gridwidth=1;
	    this.add(tabBouton[9],c);

	    c.gridx=1;c.gridy=2;
	    c.gridheight=1;c.gridwidth=1;
	    this.add(tabBouton[10],c);

	    c.gridx=2;c.gridy=2;
	    c.gridheight=1;c.gridwidth=1;
	    this.add(tabBouton[11],c);

	    c.gridx=3;c.gridy=2;
	    c.gridheight=1;c.gridwidth=1;
	    this.add(tabBouton[12],c);
	    
	    c.gridx=4;c.gridy=2;
	    c.gridheight=2;c.gridwidth=1;
	    this.add(tabBouton[13],c);
	    
	    c.gridx=0;c.gridy=3;
	    c.gridheight=1;c.gridwidth=3;
	    this.add(tabBouton[14],c);
	    
	    c.gridx=3;c.gridy=3;
	    c.gridheight=1;c.gridwidth=1;
	    this.add(tabBouton[15],c);
	  
	 
		}
	
		public static void main(String[] args) {
			panneauD panD = new panneauD();
			JFrame frame = new JFrame();
			frame.setTitle("test");
			frame.setLocation(500, 500);
			frame.setSize(250,150);
			frame.setLocationRelativeTo(panD);
			frame.add(panD);
			//frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
			frame.setVisible(true);
		}
	}


