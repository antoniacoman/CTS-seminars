package command;

public class Chef {
	
	private String name;
	
	public Chef(String name) {
		super();
		this.name = name;
	}

	public void cookPizza(String name) {
		System.out.println("The chef " + this.name + " is cooking pizza " + name);
	}
	
	public void cookPasta(String name) {
		System.out.println("The chef " + this.name + " is cooking pasta " + name);
	}

}
