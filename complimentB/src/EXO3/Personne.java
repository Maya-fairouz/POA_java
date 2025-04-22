package EXO3;

import java.text.CollationElementIterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class Personne implements Comparable<Personne> {
	String nom;
	int age;
	int poids;
	int taille;
	public Personne(String nom,int age,int poids,int taille) {
		this.nom=nom; 
		this.age=age;
		this.poids=poids;
		this.taille=taille;

	}
	@Override
	public int compareTo(Personne p) {
//		return nom.compareTo(p.nom);
         return (poids-p.poids);
         // return (taille-p.taille);
		//return (age -p.age);
	}
	
	public String toString() {
		return "( le personne est : "+this.nom+" , age : "+this.age+" , de poids et taille : " +this.poids+" / "+this.taille +" )";
	}
	public static void main(String[] args) {
//		Personne tabP[];
//		tabP= new Personne[3];
//		tabP[0]=new Personne("maya",21,45,157);
//		tabP[1]=new Personne("nada",26,70,175);
//		tabP[2]=new Personne("adel",1,3,60);
		
//		for(int i=0;i<tabP.length;i++) {
//			System.out.println(tabP[i]);
//		}
		ArrayList<Personne> tabP =new ArrayList<Personne>();
		tabP.add(new Personne("maya",21,45,157));
		tabP.add(new Personne("nada",26,70,175));
		tabP.add(new Personne("adel",1,3,60));
		
		Iterator itr = tabP.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
		}
		
		
		Collections.sort(tabP);
		System.out.println();
//				new Comparator<Personne>() {
//
//			@Override
//			public int compare(Personne o1, Personne o2) {
//				
//				//return o1.age.compareTo(o2.age);
//				
//			//	return o1.poids.compareTo(o2.poids);
//			return o1.nom.compareTo(o2.nom);
//			}
//		});
		System.out.println(tabP);
	}

}
