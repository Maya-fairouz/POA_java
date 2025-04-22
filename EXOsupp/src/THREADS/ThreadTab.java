package THREADS;

import java.util.Scanner;

public class ThreadTab extends Thread {
	
	int [] tab;
	int min,max,valeur;
	static int compteur=0;

	
	protected ThreadTab(int [] tab ,  int min, int max, int valeur) {
		super();
		this.tab = tab;
		this.min = min;
		this.max = max;
		this.valeur=valeur;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		for (int i = min; i < max; i++) {
			if(tab[i]==valeur){
			  System.out.println(" occurence found ");
					compteur++;

			}
		}
	}
	
public static void main(String[] args) {
	int taille = 10;
	int [] tab = new int[taille];
	System.out.println("enter tab ");
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < taille; i++) {
    	tab[i] = sc.nextInt();
	}
    System.out.println("enter value ");
    int expression = sc.nextInt();
    
    ThreadTab t1 = new ThreadTab(tab,0, taille/2,expression);
    ThreadTab t2 = new ThreadTab(tab,taille/2+1, taille,expression );

    t1.start(); t2.start();
    try {
		t1.join(); t2.join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    System.out.println("number of occurences found :"+compteur);

}

}
//1 2 2 2 3 1 3 2 2 2
