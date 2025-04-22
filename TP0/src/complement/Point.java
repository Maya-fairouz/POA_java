package complement;

public class Point {
	int abs, ord;
	
	
	public Point(int abs, int ord) {
	this.abs = abs;
	this.ord = ord; }
	
	  public String toString(){
			return("( "+this.abs+","+this.ord+" )");
	  }	
	
	
public static void main(String[] args) {
	Point x = new Point(1,2);
	System.out.println(x );
}
		
	
	}
