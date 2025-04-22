package Exo_1;
import java.util.Scanner;
import java.util.StringTokenizer;

public class token {


	public static void main(String[] args) {
		System.out.println("enter an expression");
		Scanner n = new Scanner(System.in);
		String expression = n.next();
		StringTokenizer exp1 = new StringTokenizer(expression,"+");
		
		StringTokenizer exp2 = new StringTokenizer(expression,"*");
		
		int somme = 0;
		while(exp1.hasMoreTokens()) {
			while(exp1.hasMoreTokens()) {
			somme+=Integer.parseInt(exp1.nextToken());
			System.out.println("le resultat: "+ somme);
			
				
			
		}
	}
	}
}
