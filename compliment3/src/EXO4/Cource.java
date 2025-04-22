package EXO4;


public class Cource {

	   
	   public static void main(String[] args) {
		   
		  int distance = 5000;
				  
		 Cheval ch1 = new Cheval("CH1", 1000, 1500,distance);
		 Cheval ch2 = new Cheval("CH2", 1400, 1600,distance);
		 Cheval ch3 = new Cheval("CH3", 1200, 1700,distance);
		 Cheval ch4 = new Cheval("CH4", 900, 1400,distance);
		 Cheval ch5 = new Cheval("CH5", 1100, 1800,distance);
		   
		 
		 ch1.start();
		 ch2.start();
		 ch3.start();
		 ch4.start();
		 ch5.start();
		 
		 try {
			ch1.join();
			ch2.join();
			ch3.join();
			ch4.join();
			ch5.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		
	}

}
