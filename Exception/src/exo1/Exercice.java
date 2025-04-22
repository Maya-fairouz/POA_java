package exo1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercice {
public static void main(String[] args) {
try {

Scanner sc = new Scanner(System. in);
int [] tabEntier = new int[4];

System.out.println("Saisir les éléments du tableau:");
for (int i = 0; i < tabEntier.length; i++)
tabEntier[i] = sc.nextInt();



System.out.println("Saisir l'indice de 1'élément & diviser: ");

int indice = sc.nextInt();

System.out.println("Saisir le diviseur: ");
int diviseur = sc.nextInt();
System.out.println("Résultat : "+ tabEntier[indice]/diviseur) ;


}

catch (ArithmeticException e) {
System.err.println("Le diviseur ne doit pas etre nul.");
e.printStackTrace();

}

catch (InputMismatchException e) {
System.err.println("L'element, l'indice et/ou le diviseur doivent etre un entier");
e.printStackTrace();

}

catch (ArrayIndexOutOfBoundsException e) {
System.err.println("L'indice doit etre entre @ et 4");
e.printStackTrace();

}

catch (Exception e) {
e.printStackTrace();

}
}
}
 