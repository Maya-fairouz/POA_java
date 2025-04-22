package ex04;

public class Utilisateur {

	private String Nom ,
	               prenom ,
	               username ,
	               password ;
	
	public String getNom() {
		return Nom;
	}

	public void setNom(String nom) {
		Nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Utilisateur(String nom , String prenom , String username , String password) {
		this.Nom = nom;
		this.prenom = prenom;
		this.username = username;
		this.password = password;
	}
}
