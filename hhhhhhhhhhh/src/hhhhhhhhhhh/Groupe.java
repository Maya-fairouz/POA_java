package hhhhhhhhhhh;

public class Groupe {
	int a; Groupe(int a) { this.a=a;} }
	class Test { static void permuter (Groupe x, Groupe y) {int t=x.a ; x.a=y.a;y.a=t; }
	public static void main(String[] args) {
	Groupe g1 = new Groupe(5), g2 = new Groupe(7);
	System.out.println("Valeurs avant permutation: "+g1.a+" "+g2.a);
	permuter(g1, g2);
	System.out.println("Valeurs après permutation: "+g1.a+" "+g2.a); }

}
