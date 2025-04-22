package partieB;

import java.util.Vector;

public class PileString {

	Vector tab = new Vector();	
	
	void empliler(String x) {
		tab.addElement(x);
	}
	String sommet() {
		return ((String) tab.lastElement());
	}
    void depiler() {
    	tab.removeElementAt(tab.size()-1);
    }
    boolean estVide() {
    	return tab.isEmpty();
    }	
    
public static void main(String[] args) {
	PileString ps = new PileString();
	
	ps.empliler("maya");
	ps.empliler("yousra");
	ps.empliler("naoual");
	ps.empliler("yousra");
	
	while(!ps.estVide()) {
		System.out.println(ps.sommet());
		ps.depiler();
	}
	
}    
}
