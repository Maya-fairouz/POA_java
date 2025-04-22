package EXO4;

public class Operation {

	private int operation;
	static final int ADDITION = 0;
	static final int SOUSTRACTION = 1;
	static final int MULTIPLICATION = 2;
	static final int DIVISION = 3;
	static final int MODULO= 4;
	
	
	public Operation(int operation) {
		this.operation=operation;
	}
	
	
	public int getOperation() {
		return operation;
	}
	public void setOperation(int operation) {
		this.operation = operation;
	}
	@Override
	public boolean equals(Object obj) {
		Operation op = (Operation) obj ; 
		return operation == op.operation;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
//		return "resultat : "; // affiche le type d'operation 
		
		if(operation==ADDITION) return "ADDITION";
		else if(operation==SOUSTRACTION) return "SOUSTRACTION";
		else if(operation==MULTIPLICATION) return "MULTIPLICATION";
		else if(operation==DIVISION) return "DIVISION";
		else if(operation==MODULO) return "MODULO";
		else return null ;
	}
	
	public int getResults(int a , int b) {
		// TODO Auto-generated method stub
		if(operation==0) return a+b;
		else if(operation==1) return a-b;
		else if(operation==2) return a*b;
		else if(operation==3) return a/b;
		else if(operation==4) return a%b;
		else return 0;
	}
}
 