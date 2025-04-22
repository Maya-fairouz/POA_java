package THREADS;

import java.util.Scanner;

public class ThreadTab2 extends Thread {
	
	int [] tab;
	int min,max;
	static int big;
    
	

	protected ThreadTab2(int [] tab ,  int min, int max) {
		super();
		this.tab = tab;
		this.min = min;
		this.max = max;
		
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i=min; i<max; i++) {
			synchronized (tab) {
			if (tab[i]>big) {
					big=tab[i];
				}
			}
		}
//		System.out.println("the biggest value is "+big);
		
	}
	
public static void main(String[] args) {
	int taille = 40;
	int [] tab = new int[taille];
	
	System.out.println("enter tab ");
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < taille; i++) {
    	tab[i] = sc.nextInt();
	}
 
    ThreadTab2 t1 = new ThreadTab2(tab,0, taille/4);
    ThreadTab2 t2 = new ThreadTab2(tab,taille/4, taille/2);
    ThreadTab2 t3 = new ThreadTab2(tab,taille/2+1, taille*3/4);
    ThreadTab2 t4 = new ThreadTab2(tab,taille*3/4+1, taille);

    t1.start(); t2.start();t3.start();t4.start();
    try {
		t1.join(); t2.join();t3.join();t4.join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
//    System.out.println("number of occurences found :"+compteur);
    System.out.println("the biggest value is "+big);

}

}
//1 2 2 2 3 1 3 2 2 2
