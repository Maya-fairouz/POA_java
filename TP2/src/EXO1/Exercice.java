 	package EXO1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercice {
public static void main(String[] args) {
	try {
		Scanner sc = new Scanner(System.in);
		int [] tabEntier= new int[4];
		
		System.out.println("enter values of table : " );
		for (int i = 0; i < tabEntier.length; i++) {
			tabEntier[i] = sc.nextInt();
		}
		
		System.out.println("enter index of element to devide : ");
		int indice = sc.nextInt();
		
		System.out.println("divider : ");
		int diviseur= sc.nextInt();
		
		System.out.println("Results : " + tabEntier[indice]/diviseur);
		
	} catch (ArithmeticException e) {
		// TODO: handle exception
		System.err.println("divider can't be null ..");
		e.printStackTrace();
	}
	 catch (InputMismatchException e) {
			// TODO: handle exception
			System.err.println("must be an integer ..");
			e.printStackTrace();
		}
	 catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.err.println("respect the size bitch ");
			e.printStackTrace();
		}
	catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
		
}
}
