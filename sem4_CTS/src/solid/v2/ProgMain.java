package solid.v2;

public class ProgMain {
	
	public static void main(String[] args) {
		
		Calculator c = new Calculator();
		IOperationType add = new AddOperation();
		System.out.println(c.calculate(10, 2, add));
	}

}
