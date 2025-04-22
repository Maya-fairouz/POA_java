package EXO2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

public class Groupe {
    private int idG;
    private String formation;
    ArrayList<Etudiant> tabG =new ArrayList<Etudiant>();
    
    public Groupe( int idG, String formation) {
    	this.idG=idG;
    	this.formation=formation; 
    }

	public int getIdG() {
		return idG;
	}

	public void setIdG(int idG) {
		this.idG = idG;
	}

	public String getFormation() {
		return formation;
	}

	public void setFormation(String formation) {
		this.formation = formation;

	}
    
	
	public void ajouterEtudiant(Etudiant e) {
		tabG.add(e);
		
	}
	public void supprimerEtudiant(Etudiant e) {
		tabG.remove(e);
	}
	public void supprimerEtudiant(int i) {
		tabG.remove(i);
		}
	public void rechercheEtudiantNom(String n) {
	
		 if(tabG.contains(n)) {
            System.out.println("le nom "+n+" existe dans le groupe ");
		 }
		 else System.out.println("le nom "+n+" n'existe pas dans le groupe ");
		
	}
	public void afficherToutEtudinat() {

//		Iterator itr = tabG.iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
			
		      for (int i = 0; i < tabG.size();i++) 
		      { 		      
		          System.out.println(tabG.get(i)); 		
		      }  
			
			
	}
	
	@Override
	public String toString() {
		return "the groupe :"+this.idG +" , "+this.formation;
	}
    
	
	public static void main(String[] args) {
		Groupe g1 = new Groupe(1,"informatique");
		
		Etudiant e1 = new Etudiant(0,"ahmed","22 janvier 2001");
		Etudiant e2 = new Etudiant(1,"ali","31 juiller 2001");
		Etudiant e3 = new Etudiant(2,"adem","02 mars 2001");
		Etudiant e4 = new Etudiant(3,"annter","17 septembre 2001");
		Etudiant e5 = new Etudiant(4,"malak","27 mai 2001");
		Etudiant e6 = new Etudiant(5,"aroua","7 septembre 2001");
		Etudiant e7 = new Etudiant(6,"kaouthar","15 janvier 2001");
		
		
		
		g1.ajouterEtudiant(e1);
		g1.ajouterEtudiant(e2);
		g1.ajouterEtudiant(e3);
		g1.ajouterEtudiant(e4);
		g1.ajouterEtudiant(e5);
		g1.ajouterEtudiant(e6);
		g1.ajouterEtudiant(e7);
		System.out.println("toutes les étudiants :");
		
		System.out.println(g1);
		System.out.println();
		g1.afficherToutEtudinat();
		System.out.println();
        System.out.println("supprission de l'étudiant de Id =6");		
		g1.supprimerEtudiant(6);
		g1.afficherToutEtudinat();
		        System.out.println();
        		System.out.println("supprission de l'étudiant e3");
		g1.supprimerEtudiant(e3);
		g1.afficherToutEtudinat();
		
		
		g1.rechercheEtudiantNom("ahmed");
		
		
		
	  System.out.println();	
	  e1.getInfo();
	  e2.getInfo();
	  e3.getInfo();
	  
	 g1.setFormation("cooking");
	 g1.setIdG(2);
	 
	 System.out.println(g1);
		
	 e4.getInfo();
	 e4.getInfo();
	 
	 System.out.println(e4.getInfo());
	}
}
