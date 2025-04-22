package EXO3;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Couleurs extends JFrame{

    JButton btnGreen = new JButton ("Green"),

           btnRed = new JButton( "Red"),

           btnBlue = new JButton("Blue");

    JPanel p =new JPanel();
    public Couleurs() {

        setTitle( "Fenetre Calcul");
        setSize(300,100);
        
    
        btnBlue.addActionListener(new Ecouteur(Color.BLUE,p));
        btnGreen.addActionListener(new Ecouteur(Color.GREEN,p));
        btnRed.addActionListener(new Ecouteur(Color.RED,p));
       
        
        p.add(btnRed);
        p.add(btnBlue);
        p.add(btnGreen);
        setContentPane(p);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        
        
    }
    public static void main(String[] args) {
		new Couleurs();
	}
	
}
