package EXO5;

public class Coordonnees {
	private int telephone ;
	private String adresse ;
	
	public Coordonnees(int telephone, String adresse) {
		this.telephone=telephone;
		this.adresse=adresse;
		
	}
	public int getTelephone() {
		return telephone;
	}
	public void setTelephone(int telephone) {
		this.telephone = telephone;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	@Override
	public String toString() {
		return "telephone : "+getTelephone()+" ,adresse :" +getAdresse();
	}
	
	

}
