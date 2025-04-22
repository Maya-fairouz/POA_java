package EXO4;

public class Cheval extends Thread {
   String nom;
   int min,max;
   int distance=0;   
  
   
   public Cheval(String nom, int min,int max ,int distance) {
	   this.nom=nom;
	   this.min=min;
	   this.max=max;
	   this.distance=0;
   }
 
   @Override
	public void run() {
		
			while (distance<5000) {
	            // Calculate the speed of the horse using the min and max speed values
	            int speed = min+ (int)((max - min) * Math.random());
	            distance += 100;
	            System.out.println( nom +" distance : "+ distance );
	            try {
					sleep(speed);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	            
	            if (distance % 200 == 0) { 
	                System.out.println("at " +distance+ "on the checkpoint : " + nom  );
		}
	            if (distance % distance == 0) {
					System.out.println();
	                System.out.println("horse finished : " + nom  );
                    System.out.println();
	            	
		}
	            
		
	            }
			
		}
   }

