package EXO3;

public class ThreadAffichage extends Thread{
	
	int nbr;
	boolean estpair;
	Partage p ;
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 20; i++) {
			if(estpair == true) {
				p.pair(i);
			}
			else {
				p.immpair(i);
			}
		}
	}
	
	public ThreadAffichage(int nbr,boolean estpair ,Partage p) {
		this.nbr=nbr;
		this.estpair=estpair;
		this.p=p;

}
	
	public static void main(String[] args) {
		
		Partage p = new Partage();
		
		ThreadAffichage t1 = new ThreadAffichage(20, true, p);
		ThreadAffichage t2 = new ThreadAffichage(20, false, p);
		t1.start();
		t2.start();
	}
}

class Partage{
 void pair(int nbr) {
			if(nbr%2==0) {
				System.out.println(nbr);
		}
	}
 void immpair(int nbr) {
		
			if(nbr%2==1) {
				System.out.println(nbr);
			
		}
	}
	
}
