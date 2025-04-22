package EXO1;

public class ThreadRandom extends Thread{

        int x,y,taille;
	    int [] tab;
 
		protected ThreadRandom(int [] tab ,int x , int y,int taille) {
			super();
			this.tab = tab;
			this.taille=taille;
			this.x=x;
			this.y=y;
		}
		@Override
		public void run() {
			
			
				synchronized (tab) {
					
				for (int i = 0; i < taille; i++) {
				
					tab[i]= (int) (x + (y - x)*Math.random());
	                System.out.println( this +" position : "+i +" ="+tab[i]);
	                System.out.println("--------------------------------");
				
					}
				}
			}
			

	public static void main(String[] args) {
		int taille = 20;
		int [] tab = new int[taille];
		
		ThreadRandom t1 = new ThreadRandom(tab,0,24,taille);
		ThreadRandom t2 = new ThreadRandom(tab,25,49,taille);
		ThreadRandom t3 = new ThreadRandom(tab,50,74,taille);
		ThreadRandom t4 = new ThreadRandom(tab,75,99,taille);
        
		t1.start();t2.start();t3.start();t4.start();
        
	}
	

}


