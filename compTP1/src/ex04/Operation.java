package ex04;

public class Operation {

	final public int ADDITION = 0;
	final public int SOUSTRACTION = 1;
	final public int MULTIPLICATON = 2;
	final public int DIVISION = 3;
	final public int MODULO = 4;
	
	private int operation ;

	public Operation(int operation) {
		this.operation = operation;
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
		if (operation == ADDITION) return "Addition" ;
		else if (operation == SOUSTRACTION) return "Soustraction" ;
		else if (operation == MULTIPLICATON) return "Multiplication" ;
		else if (operation == DIVISION) return "Devision" ;
		else return "Modulo" ;
	}
	
	public String getResult(int a , int b) {
		if (operation == ADDITION) return "Addition : "+(a+b) ;
		else if (operation == SOUSTRACTION) return "Soustraction : "+(a-b) ;
		else if (operation == MULTIPLICATON) return "Multiplication : "+(a*b) ;
		else if (operation == DIVISION) return "Devision : "+(a/b) ;
		else return "Modulo : "+(a%b) ;
	}
}
