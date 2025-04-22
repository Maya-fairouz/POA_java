package EXO1;

import java.util.Scanner;
import java.util.StringTokenizer;

public class stringTokenizer {

		
	     	public static void main(String[] args) {
	     		System.out.println("enter ur expression :");
	     	Scanner sc = new Scanner(System.in);
	     	String expression = sc.nextLine();
	     	
	     	StringTokenizer stPlus = new StringTokenizer(expression, "+");
	     	int somme=0;
	     	while (stPlus.hasMoreTokens()) {
	     		
	     		int prod=1;
	     		StringTokenizer stProd = new StringTokenizer(stPlus.nextToken(), "*");
	     		while(stProd.hasMoreTokens()) {
	     			prod=prod*Integer.parseInt(stProd.nextToken());
	     		
	     		 
	     	 }
	     	somme=prod+somme;
	
	     	}	
	     	  System.out.println("la somme est : "+somme);
	     	}
	     	
	     	
	     	}

