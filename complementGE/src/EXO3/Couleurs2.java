package EXO3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Couleurs2 extends JFrame implements MouseListener {
	JButton b1 = new JButton("Button 1"),
            b3 = new JButton("Button 3"),
            b2 = new JButton("Button 2");
	JCheckBox caseCheck1 = new JCheckBox("First choice"),
			  caseCheck2 = new JCheckBox("Second choice");
            
    JPanel p =new JPanel();
    
    
    public Couleurs2() {
	   b1.setFocusable(false);
	   b3.setFocusable(false);
	   b2.setFocusable(false);
	   caseCheck1.setFocusable(false);
	   caseCheck2.setFocusable(false);
	   
        setTitle("Fenetre Calcul");
        setSize(300,100);
      
        b1.addMouseListener(this);
        b3.addMouseListener(this);
        b2.addMouseListener(this);
        caseCheck1.addMouseListener(this);
        caseCheck2.addMouseListener(this);
        p.addMouseListener(this);
        
        p.add(b3);
        p.add(b2);
        p.add(b1);
        p.add(caseCheck1);
        p.add(caseCheck2);
        
        setContentPane(p);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
        
    public static void main(String[] args) {
        new Couleurs2();
        }
  
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
	

    	Object o = e.getSource();
    	if(o instanceof JButton) {
    		JButton b= (JButton)o;
    		System.out.println("You hoverd over "+b.getText());
    		
//    		JOptionPane.showConfirmDialog (null, "Vous avez cliqué sur "
//        			+ b.getText(), "Ma boite message", JOptionPane. PLAIN_MESSAGE);
    	}
    	else {
    		if( o instanceof JCheckBox) {
    		JCheckBox c = (JCheckBox)o;
    		System.out.println("You hoverd over "+c.getText());
    		
//    		JOptionPane.showConfirmDialog (null, "Vous avez cliqué sur "
//        			+ c.getText(), "Ma boite message", JOptionPane. PLAIN_MESSAGE);

    		}
    		else {
    			if(o instanceof JPanel) {
    				JPanel p = new JPanel();
    				System.out.println("You hoverd over the Panel");
    			}
    		}
    	}
    	
    

		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
    }

