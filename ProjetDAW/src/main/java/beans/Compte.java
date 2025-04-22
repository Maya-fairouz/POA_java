package beans;
public class Compte {
private String NomUser;
private String PassWord;
private String Nom;
private String Prenom;
private String poste; // G: Gérant, A: Acheteur, V: Vendeur
public Compte() {
this.NomUser = "";
this.PassWord = "";
this.Nom = "";
this.Prenom = "";
this.poste = "";
}
public Compte(String NU, String PW, String N, String P, String Po) {
this.NomUser = NU;
this.PassWord = PW;
this.Nom = N;
this.Prenom = P;

this.poste = Po;
}
public String getNomUser() {
return NomUser;
}
public void setNomUser(String nomUser) {
NomUser = nomUser;
}
public String getPassWord() {
return PassWord;
}
public void setPassWord(String passWord) {
PassWord = passWord;
}
public String getNom() {
return Nom;
}
public void setNom(String nom) {
Nom = nom;
}
public String getPrenom() {
return Prenom;
}
public void setPrenom(String prenom) {
Prenom = prenom;
}
public String getPoste() {
return poste;
}
public void setPoste(String poste) {
this.poste = poste;
}
}