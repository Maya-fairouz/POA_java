
	package ggg;
	import java.util.Random;
	import java.util.concurrent.locks.Lock;
	import java.util.concurrent.locks.ReentrantLock;

	public class Exo1 {
	    static final int N = 100; // taille du tableau
	    static final int[] tableau = new int[N]; // tableau d'entiers
	    static int index = 0; // position courante dans le tableau
	    static final Lock lock = new ReentrantLock(); // verrou pour synchroniser l'accès à la variable index
	    static final Random random = new Random(); // générateur de nombres aléatoires

	    static class T1Thread extends Thread {
	        int compteur = 0; // compteur de valeurs générées par le thread

	        @Override
	        public void run() {
	            while (index < N) {
	                // on verrouille le verrou avant de modifier la variable index
	                lock.lock();
	                try {
	                    if (index < N) {
	                        tableau[index] = random.nextInt(25);
	                        index++;
	                        compteur++;
	                    }
	                } finally {
	                    lock.unlock();
	                }
	            }
	            System.out.println("t1 a généré " + compteur + " valeurs aléatoires");
	        }
	    }

	    static class T2Thread extends Thread {
	        int compteur = 0;

	        @Override
	        public void run() {
	            while (index < N) {
	                lock.lock();
	                try {
	                    if (index < N) {
	                        tableau[index] = random.nextInt(25) + 25;
	                        index++;
	                        compteur++;
	                    }
	                } finally {
	                    lock.unlock();
	                }
	            }
	            System.out.println("t2 a généré " + compteur + " valeurs aléatoires");
	        }
	    }

	    static class T3Thread extends Thread {
	        int compteur = 0;

	        @Override
	        public void run() {
	            while (index < N) {
	                lock.lock();
	                try {
	                    if (index < N) {
	                        tableau[index] = random.nextInt(25) + 50;
	                        index++;
	                        compteur++;
	                    }
	                } finally {
	                    lock.unlock();
	                }
	            }
	            System.out.println("t3 a généré " + compteur + " valeurs aléatoires");
	        }
	    }

	    static class T4Thread extends Thread {
	        int compteur = 0;

	        @Override
	        public void run() {
	            while (index < N) {
	                lock.lock();
	                try {
	                    if (index < N) {
	                        tableau[index] = random.nextInt(25) + 75;
	                        index++;
	                        compteur++;
	                    }
	                } finally {
	                    lock.unlock();
	                }
	            }
	            System.out.println("t4 a généré " + compteur + " valeurs aléatoires");
	        }
	    }
	}
	   


