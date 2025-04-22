package exoo;

import java.util.Scanner;
import java.util.StringTokenizer;

public class token {
public static void main(String[] args) {
	System.out.println("enter an expression");
	Scanner n = new Scanner(System.in);
	String expression = n.next();
	StringTokenizer st = new StringTokenizer(expression,"+");
	
	int somme = 0;
	while(st.hasMoreTokens()) {
		somme+=Integer.parseInt(st.nextToken());
		System.out.println("le resultat: "+ somme);
	}
}
}
