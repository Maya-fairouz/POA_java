package test;


public class testThread extends Thread{
  static int co = 0;
	int nbr,x;
	partage p;
	public testThread(int nbr,int x,partage p) {
		this.x=x;
		this.nbr=nbr;
		this.p=p;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
      for (int i = 0; i < nbr; i++) {
         co=co+x;		
         
	}
      System.out.println(co);     
	}
	public static void main(String[] args) {
		partage p = new partage();
		testThread t1 = new testThread(10000, +1,p);
		testThread t2 = new testThread(10000, -1,p);
		t1.start();
		t2.start();
	}

}