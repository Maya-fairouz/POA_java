package EXO3;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

class FenetreMenu extends JFrame {
public FenetreMenu() {
setTitle("Fenetre avec menus");
setSize(300, 200);

JMenuBar menuBar = new JMenuBar();
JMenu menuFichier = new JMenu("Fichier");
JMenuItem itemOuvrir = new JMenuItem("Ouvrir"),
          itemEnregister = new JMenuItem("Enregistrer"),
          itemQuitter = new JMenuItem("Quitter") ;

menuFichier.add(itemOuvrir) ;
menuFichier.add(itemEnregister) ;
menuFichier.addSeparator();
menuFichier.add(itemQuitter) ;

menuBar.add(menuFichier) ;
setJMenuBar(menuBar) ;
setLocationRelativeTo(null) ;
setVisible(true) ;

}

public static void main(String[] args) {

 new FenetreMenu() ;


}
}
