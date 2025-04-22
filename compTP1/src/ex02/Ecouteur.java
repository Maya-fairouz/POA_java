package ex02;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.StringTokenizer;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Ecouteur implements ActionListener{
	
	JButton[] tabButton ;
	JTextField txt = new JTextField();
	int op = 0,
		rs = 0,
		dc = 0;
	
	public Ecouteur(JButton[] tabButton , JTextField txt) {
		this.tabButton = tabButton;
		this.txt = txt;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {

		JButton btn = (JButton) e.getSource();
		String expression = txt.getText();
		
		if(rs != 0) {
			expression = "";
		}
		
		try {
			
			if (btn.equals(tabButton[3]))
				txt.setText(expression.substring(0,txt.getText().length()-1));
			else if (btn.equals(tabButton[8]))
				txt.setText("");
			else if (btn.equals(tabButton[13])) {
				if(!txt.getText().isEmpty()&&rs==0) {
					txt.setText(expression+"="+tokenResultat());
					rs = 1 ;
				}
			}
			else if(btn.equals(tabButton[15])||btn.equals(tabButton[12])||btn.equals(tabButton[7])) {
				if(op==0 && !txt.getText().isEmpty() && dc == 0) {
					txt.setText(expression+btn.getText()); //+ 12 / 0 14 / . 15
					op = 1 ;				
				}
				if(btn.equals(tabButton[15]))
					dc = 1;
			}
			else  {                		
				txt.setText(expression+btn.getText());
				op = 0 ;
				rs = 0 ;
				dc = 0 ;
			}
		} catch (Exception exception) {
			String msg = "Veiller resaisir une expression valide";
			JOptionPane.showConfirmDialog(null , msg , "Expression erroné",JOptionPane.PLAIN_MESSAGE);
			rs = 1;
		}
	}
	
	public float tokenResultat() {
		
		StringTokenizer stPlus = new StringTokenizer(txt.getText(), "+");
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
