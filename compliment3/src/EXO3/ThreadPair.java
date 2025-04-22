package EXO3;

public class ThreadPair extends Thread{

    Share s;	 
	 ThreadPair(Share s){
	  this.s = s;
	 }
	 
	 @Override
	 public void run() {
	 
	  try{
	   synchronized (s) {
	 
	    for (int i = 0; i <= 20; i++) {
	 
	     if(s.flag!=1){
	      s.wait();
	     }
	     if (i%2==0) {
		    	System.out.println(i);
			}
	     sleep(1000);
	     s.flag = 2;
	     s.notifyAll();
	    }
	 
	   }
	  }catch (Exception e) {
	   System.out.println("Exception 2 :"+e.getMessage());
	  }

	 
	 }

}
