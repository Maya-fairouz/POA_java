package EXO4;

import java.util.ArrayList;
import java.util.Iterator;





public class EnsembleEntier {
     int a;
     ArrayList<Integer> tabE= new ArrayList<Integer>();
    
     
	public EnsembleEntier() {
		
	}
	public EnsembleEntier(int a) {
		this.a=a;
	}
	public EnsembleEntier(EnsembleEntier e) {
	//	this.tabE=e;
	
	}
	
	
    public int cardinal() {
      return tabE.size();
			
    }
    public boolean estVide() {
    	return tabE.isEmpty();
    	}
    
    public boolean singleton() {
    	if(tabE.size()==1) return true;
    	else return false;
    	}
    
    public boolean appartient(int a) {
    	return tabE.contains(a);
    	}
    
    public void ajouter(int a) {
    	if (!tabE.contains(a))
            tabE.add(a);
    }
    
    public void supprimer(int a) {
    	//tabE.remove(a);
    	if (tabE.contains(a))
            tabE.remove(tabE.indexOf(a));
    }
    public EnsembleEntier intersection(EnsembleEntier e) {
    	{
            EnsembleEntier u = new EnsembleEntier();
             
            for(int i=0; i<e.cardinal(); i++)
                for(int j=0; j<tabE.size(); j++)
                    if(e.getInt(i) == tabE.get(j))
                        u.ajouter(getInt(i));
            return u;
    	}
    }
    public EnsembleEntier union(EnsembleEntier e) {
    	EnsembleEntier u = new EnsembleEntier();
        for(int i=0; i<e.cardinal(); i++)
            u.ajouter(e.getInt(i));
             
        for (int j=0; j<tabE.size(); j++) {
            if ( !u.appartient(tabE.get(j)) )
                u.ajouter(tabE.get(j));
            }
        return u;
}
    public int getInt(int x) {
        return tabE.get(x);
    }
	public EnsembleEntier difference(EnsembleEntier e) {
		EnsembleEntier u = new EnsembleEntier();
		for(int i = 0;i<e.cardinal();i++) {
			
				if(!(tabE.get(i)==e.getInt(i))) {
					u.ajouter(tabE.get(i));}
		}
			

    	return u;
    	}

    public boolean estInclus(EnsembleEntier e) {
    	return this.tabE.equals(e);
    	
    }
    public boolean equals(EnsembleEntier e) {
        for(int i=0; i<tabE.size(); i++) {
            if(!e.appartient(tabE.get(i)))
                return false;
        }
        return true;
 
    }
    public String toString() {
    	return tabE.toString();
    }
    
public static void main(String[] args) {
	
    
    //Creation et affichage des ensemble a et b
    EnsembleEntier a = new EnsembleEntier();
    EnsembleEntier b = new EnsembleEntier();
     
    System.out.println("a : "+a.toString());
    System.out.println("b : "+b.toString());
    System.out.println();
     
    //Test si les ensembles sont vides et le nombre d'entiers qu'ils contiennent
    if (a.estVide())
        System.out.println("L'ensemble a est vide.");
    else
    System.out.println("L'ensemble a n'est pas vide.");
    System.out.println("L'ensemble a contient : "+a.cardinal()+" entiers");
     
    if (b.estVide())
        System.out.println("L'ensemble b est vide.");
    else
    System.out.println("L'ensemble b n'est pas vide.");
    System.out.println("L'ensemble b contient : "+b.cardinal()+" entiers");
     
    //Ajout dans l'ensemble a
    a.ajouter(2);
    a.ajouter(7);
    a.ajouter(21);
    a.ajouter(4);
    a.ajouter(4);
    a.ajouter(6);
    a.ajouter(2);
    a.ajouter(3);
    a.ajouter(1);
    System.out.println("a : "+a.toString());
     
    //Ajout dans l'ensemble b
//    b.ajouter(2);
//    b.ajouter(7);
//    b.ajouter(21);
//    b.ajouter(3);
//    b.ajouter(7);
//    b.ajouter(13);
//    b.ajouter(3);
//    b.ajouter(5);
    b.ajouter(10);
    b.ajouter(115);
    b.ajouter(15);
    b.ajouter(52);
    b.ajouter(53);
    b.ajouter(54);
    
    
    System.out.println("b : "+b.toString());
    System.out.println();
     
    //Suppression dans l'ensemble a
    a.supprimer(2);
    System.out.println("a : "+a.toString());
     
    //Suppression dans l'ensemble b
    b.supprimer(2);
    System.out.println("b : "+b.toString());
    System.out.println();
     
    //Test si les ensembles sont vides et le nombre d'entiers qu'ils contiennent
    if (a.estVide())
        System.out.println("L'ensemble a est vide.");
    else
    System.out.println("L'ensemble a n'est pas vide.");
    System.out.println("L'ensemble a contient : "+a.cardinal()+" entiers");
     
    if (b.estVide())
        System.out.println("L'ensemble b est vide.");
    else
    System.out.println("L'ensemble b n'est pas vide.");
    System.out.println("L'ensemble b contient : "+b.cardinal()+" entiers");
    System.out.println();
     
  
     
    //Teste si l'entier n appartient aux ensembles
    int n = 7;
    if (a.appartient(n))
            System.out.println(n+"  appartient a l'ensemble a");
    else
        System.out.println(n+" n'appartient pas a l'ensemble a");
     
    if (b.appartient(n))
        System.out.println(n+"  appartient a l'ensemble b");
    else
    System.out.println(n+" n'appartient pas a l'ensemble b");
    System.out.println();
     
    //Union ente a et b
    System.out.println("Union entre a et b : "+a.union(b).toString());
    System.out.println();
     
    //Intersection entre a et b
    System.out.println("Intersection entre a et b : "+a.intersection(b).toString());
    System.out.println();
     
    //a inclus dans b ?
    if (a.estInclus(b))
        System.out.println(a.toString()+" est inclus dans "+b.toString());
    else
        System.out.println(a.toString()+" n'est pas inclus dans "+b.toString());
    System.out.println();
     
    System.out.println("diffrenece entre a et b : "+a.difference(b));

}
}
