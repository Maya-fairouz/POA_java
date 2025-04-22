package ggg;

	import java.util.concurrent.ThreadLocalRandom;
	import java.util.concurrent.atomic.AtomicIntegerArray;

	public class RandomArrayFiller {
	    public static void main(String[] args) throws InterruptedException {
	        // Créez un tableau de taille N rempli de zéros
	        int N = 1000;
	        AtomicIntegerArray array = new AtomicIntegerArray(N);

	        // Créez les threads qui vont remplir le tableau
	        Thread t1 = new Thread(() -> fillArray(array, 0, 24));
	        Thread t2 = new Thread(() -> fillArray(array, 25, 49));
	        Thread t3 = new Thread(() -> fillArray(array, 50, 74));
	        Thread t4 = new Thread(() -> fillArray(array, 75, 99));

	        // Démarrez les threads
	        t1.start();
	        t2.start();
	        t3.start();
	        t4.start();

	        // Attendez que les threads se terminent
	        t1.join();
	        t2.join();
	        t3.join();
	        t4.join();

	        // Affichez le nombre de valeurs créées par chaque thread
//	        System.out.println("Thread 1: " + t1.getName() + " a créé " + t1.getCounter() + " valeurs");
//	        System.out.println("Thread 2: " + t2.getName() + " a créé " + t2.getCounter() + " valeurs");
//	        System.out.println("Thread 3: " + t3.getName() + " a créé " + t3.getCounter() + " valeurs");
//	        System.out.println("Thread 4: " + t4.getName() + " a créé " + t4.getCounter() + " valeurs");
	    }

	    private static void fillArray(AtomicIntegerArray array, int min, int max) {
	        ThreadLocalRandom random = ThreadLocalRandom.current();
	        int counter = 0;
	        for (int i = 0; i < array.length(); i++) {
	            // Générez un nombre aléatoire entre min et max
	            int randomInt = random.nextInt(min, max + 1);
	            // Utilisez la méthode compareAndSet de AtomicIntegerArray pour mettre à jour la valeur de manière thread-safe
	            array.compareAndSet(i, 0, randomInt);
	            counter++;
	        }
	        // Enregistrez le nombre de valeurs créées par ce thread
//	        Thread.currentThread().setCounter(counter);
	    }
	}


