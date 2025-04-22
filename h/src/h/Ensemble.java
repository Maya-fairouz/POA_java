package h;

import java.util.ArrayList;
import java.util.Random;
  
public class Ensemble {
    protected ArrayList<Integer> al;
    private Random rand;
  
    public Ensemble() {
        al = new ArrayList<Integer>();
        rand = new Random();
    }
  
     
    public void ajout(int x) {
        if (!al.contains(x))
            al.add(x);
    }
  
 
    public int cardinal() {
        return al.size();
    }
  
 
    public boolean estVide() {
        return al.isEmpty();
    }
  
  
    public void supprimer(int x) {
        if (al.contains(x))
            al.remove(al.indexOf(x));
         
        else if (al.isEmpty())
            /*Leve une exception car l'ensemble est vide*/
            throw new RuntimeException("Il n'y a rien a supprimer car l'ensemble est vide !");
         
        else if (!al.contains(x))
            /*Leve une exception car x n'est pas dans l'ensemble*/
            throw new RuntimeException(x+" n'appartient pas  a l'ensemble !");         
    }
  
     
    public int choisir() {
        int i = rand.nextInt(al.size());
        return al.get(i);
    }
  
    public boolean appartient(int x) {
        return al.contains(x);
    }
  
  
    /**Renvoie le contenu de l'ensemble sous la forme d'une chaine de caracteres
     * @return String
     */
    public String toString() {
        return al.toString();
    }
 
 
    //Methode qui renvoie l'entier au rang x de l'ensemble
    private int getInt(int x) {
        return al.get(x);
    }
     
     
    /**Renvoie l'union de l'ensemble et d'un autre ensemble passe en parametre
     * @param e l'ensemble en parametre
     * @return u l'ensemble union
     */
    public Ensemble union (Ensemble e) {
        Ensemble u = new Ensemble();
        for(int i=0; i<e.cardinal(); i++)
            u.ajout(e.getInt(i));
             
        for (int j=0; j<al.size(); j++) {
            if ( !u.appartient(al.get(j)) )
                u.ajout(al.get(j));
            }
        return u;
    }
     
 
    /**Renvoie l'intersection de l'ensemble et d'un autre ensemble passe en parametre
     * @param e l'ensemble en parametre
     * @return u l'intersection des ensembles
     */
    public Ensemble intersection(Ensemble e) {
        Ensemble u = new Ensemble();
         
        for(int i=0; i<e.cardinal(); i++)
            for(int j=0; j<al.size(); j++)
                if(e.getInt(i) == al.get(j))
                    u.ajout(getInt(i));
        return u;
    }
     
     
    /**Verifie si l'ensemble est inclus dans un autre ensemble passe en parametre
     * @param e l'ensemble en parametre
     * @return true si l'ensemble est incluss, false sinon
     */
    public boolean inclusion(Ensemble e) {
        for(int i=0; i<al.size(); i++) {
            if(!e.appartient(al.get(i)))
                return false;
        }
        return true;
 
    }
     
     
     
     
     
     
     
     
     
     
     
    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
         
         
        //Creation et affichage des ensemble a et b
        Ensemble a = new Ensemble();
        Ensemble b = new Ensemble();
         
        System.out.println("a : "+a.toString());
        System.out.println("b : "+b.toString());
        System.out.println();
         
        //Test si les ensembles sont vides et le nombre d'entiers qu'ils contiennent
        if (a.estVide())
            System.out.println("L'ensemble a est vide.");
        else
        System.out.println("L'ensemble a n'est pas vide.");
        System.out.println("L'ensemble a contient : "+a.cardinal()+" entiers");
         
        if (b.estVide())
            System.out.println("L'ensemble b est vide.");
        else
        System.out.println("L'ensemble b n'est pas vide.");
        System.out.println("L'ensemble b contient : "+b.cardinal()+" entiers");
        System.out.println();
         
        //Ajout dans l'ensemble a
        a.ajout(2);
        a.ajout(7);
        a.ajout(21);
        a.ajout(4);
        System.out.println("a : "+a.toString());
         
        //Ajout dans l'ensemble b
        b.ajout(2);
        b.ajout(7);
        b.ajout(21);
        b.ajout(3);
        System.out.println("b : "+b.toString());
        System.out.println();
         
        //Suppression dans l'ensemble a
        a.supprimer(2);
        System.out.println("a : "+a.toString());
         
        //Suppression dans l'ensemble b
        b.supprimer(2);
        System.out.println("b : "+b.toString());
        System.out.println();
         
        //Test si les ensembles sont vides et le nombre d'entiers qu'ils contiennent
        if (a.estVide())
            System.out.println("L'ensemble a est vide.");
        else
        System.out.println("L'ensemble a n'est pas vide.");
        System.out.println("L'ensemble a contient : "+a.cardinal()+" entiers");
         
        if (b.estVide())
            System.out.println("L'ensemble b est vide.");
        else
        System.out.println("L'ensemble b n'est pas vide.");
        System.out.println("L'ensemble b contient : "+b.cardinal()+" entiers");
        System.out.println();
         
        //Choisi un entier au hasard dans les ensembles
        System.out.println("L'entier choisi dans a est : "+a.choisir());
        System.out.println("L'entier choisi dans b est : "+b.choisir());
        System.out.println();
         
        //Teste si l'entier n appartient aux ensembles
        int n = 17;
        if (a.appartient(n))
                System.out.println(n+"  appartient a l'ensemble a");
        else
            System.out.println(n+" n'appartient pas a l'ensemble a");
         
        if (b.appartient(n))
            System.out.println(n+"  appartient a l'ensemble b");
        else
        System.out.println(n+" n'appartient pas a l'ensemble b");
        System.out.println();
         
        //Union ente a et b
        System.out.println("Union entre a et b : "+a.union(b).toString());
        System.out.println();
         
        //Intersection entre a et b
        System.out.println("Intersection entre a et b : "+a.intersection(b).toString());
        System.out.println();
         
        //a est-il inclus dans b ?
        if (a.inclusion(b))
            System.out.println(a.toString()+" est inclus dans "+b.toString());
        else
            System.out.println(a.toString()+" n'est pas inclus dans "+b.toString());
        System.out.println();
         
    }
  
}