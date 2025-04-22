package EXO5;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Annuaire {
	HashMap<String, Coordonnees> hp =new HashMap<String,Coordonnees>();
	
public void ajouter(String n, Coordonnees c) {
	hp.put(n, c);
}
public void afficherCoordonnees(String n) {
	System.out.println();
	System.out.println("*affichage des coordoonnes de :" +n );
	System.out.println("les coordonnees sont :"+hp.get(n).getTelephone()+ " , "+hp.get(n).getAdresse());
}
public void modifierCoordonnees( String n , Coordonnees c) {
	System.out.println();
	System.out.println("*modification des coordonnees de "+n);
	hp.put(n, c);
}

public void supprimer(String n) {
	System.out.println();
	System.out.println("*suprission des coordonnees de "+n);
	System.out.println();
	hp.remove(n);
}
public void listerNoms() {
	System.out.println();
	System.out.println("*Lister les noms :");
	System.out.println(hp.keySet());
	
	
	}
public void listerTelephones() {
	System.out.println();
	System.out.println("*Lister les telephones :");
	
	for (Map.Entry<String, Coordonnees> mapEntry : hp.entrySet()) {
		
		System.out.println("\t\t"+mapEntry.getValue().getTelephone());
	}
} 
public void listerAdresses() {
	System.out.println();
	System.out.println("*Lister les adresses :");
	for (Map.Entry<String, Coordonnees> mapEntry : hp.entrySet()) {
		System.out.println("\t\t"+mapEntry.getValue().getAdresse());
	}
}

public void afficherAnnuaire() {
	System.out.println();
System.out.println("*affichage annuaire");	
    System.out.println(hp);

}

@Override
public String toString() {
	return hp.toString();
}

public static void main(String[] args) {

	Annuaire annu =new Annuaire();
	annu.ajouter("maya", new Coordonnees(898989, "adrs 1"));
	annu.ajouter("yousra", new Coordonnees(323, "adrs 2"));
	annu.ajouter("naoual", new Coordonnees(566989, "adrs 3"));
	annu.ajouter("nouha", new Coordonnees(877789, "adrs 4"));
	annu.ajouter("nada", new Coordonnees(1119, "adrs 5"));
	annu.ajouter("asma", new Coordonnees(234339, "adrs 6"));
	
	
	annu.afficherAnnuaire();
	annu.afficherCoordonnees("maya");
	
    annu.listerNoms();
    annu.listerAdresses(); 
    annu.listerTelephones();
    
    annu.afficherAnnuaire();
    
    annu.supprimer("asma");
    
    annu.afficherAnnuaire();
      
    
    annu.modifierCoordonnees("naoual", new Coordonnees(2222, "batbat"));
    
    annu.afficherAnnuaire();
    
}
}


