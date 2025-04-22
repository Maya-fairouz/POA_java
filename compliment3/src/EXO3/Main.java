package EXO3;

public class Main {
public static void main(String[] args) {
	Share s = new Share();
	ThreadPair p1 = new ThreadPair(s);
	ThreadImpair p2 = new ThreadImpair(s);
	
	p1.start();
	p2.start();
  }
}




