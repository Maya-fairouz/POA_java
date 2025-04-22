package partieB2;

import java.util.Vector;

import partieB.PileString;

public class PilieInt {
Vector <Integer>tab = new Vector();	
	
	void empliler(int x) {
		tab.addElement(x);
	}
	Integer sommet() {
		return ( tab.lastElement());
	}
    void depiler() {
    	tab.removeElementAt(tab.size()-1);
    }
    boolean estVide() {
    	return tab.isEmpty();
    }	
    
public static void main(String[] args) {
	PilieInt ps = new PilieInt();
	
	ps.empliler(4);
	ps.empliler(5);
	ps.empliler(77);
	ps.empliler(3);
	
	while(!ps.estVide()) {
		System.out.println(ps.sommet());
		ps.depiler();
	}
	
}    
}
