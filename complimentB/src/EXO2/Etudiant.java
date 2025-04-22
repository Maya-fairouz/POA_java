package EXO2;

import java.util.ArrayList;
import java.util.Iterator;

import EXO3.Personne;

public class Etudiant{
	private int idE;
	private String nom;
	private String dateNaissance;
	
	
	public Etudiant(int idE,String nom,String dateNaissance) {
          this.idE=idE;
          this.nom=nom;
          this.dateNaissance=dateNaissance;
 
	}


	public int getIdE() {
		return idE;
	}


	public void setIdE(int id) {
		this.idE = id;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getDateNaissance() {
		return dateNaissance;
	}


	public void setDateNaissance(String dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	public String toString() {
		return "Etudiant :"+this.idE +", name : "+this.nom+", birthday : "+this.dateNaissance; 
	
	}
	public String getInfo() {
		return "id : "+this.idE+" name : "+this.nom+" birthday :"+this.dateNaissance;
	}
	
	public static void main(String[] args) {
		
       
	

}
}